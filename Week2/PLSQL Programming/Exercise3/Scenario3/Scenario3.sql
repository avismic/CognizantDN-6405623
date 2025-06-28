SET SERVEROUTPUT ON
SET LINESIZE 120
SET PAGESIZE 50

COLUMN account_id    FORMAT 999            HEADING 'ID'
COLUMN customer_name FORMAT A25           HEADING 'NAME'
COLUMN balance       FORMAT 999,999,999.99 HEADING 'BALANCE'


CREATE TABLE bank_accounts (
  account_id    NUMBER       PRIMARY KEY,
  customer_name VARCHAR2(100),
  balance       NUMBER(12,2)
);

INSERT INTO bank_accounts VALUES (1, 'Abhishek Anand',    1000.00);
INSERT INTO bank_accounts VALUES (2, 'Adarsh Kumar',   500.00);
INSERT INTO bank_accounts VALUES (3, 'Anushka Singh',    200.00);
COMMIT;

SELECT account_id, customer_name, balance
  FROM bank_accounts
 ORDER BY account_id;

CREATE OR REPLACE PROCEDURE TransferFunds (
  p_from_id  IN NUMBER,
  p_to_id    IN NUMBER,
  p_amount   IN NUMBER
) AS
  v_balance  NUMBER(12,2);
BEGIN
  SELECT balance INTO v_balance
    FROM bank_accounts
   WHERE account_id = p_from_id;
  
  IF v_balance < p_amount THEN
    RAISE_APPLICATION_ERROR(-20001,
      'Insufficient funds in account ' || p_from_id);
  END IF;

  UPDATE bank_accounts
     SET balance = balance - p_amount
   WHERE account_id = p_from_id;

  UPDATE bank_accounts
     SET balance = balance + p_amount
   WHERE account_id = p_to_id;

  COMMIT;
  DBMS_OUTPUT.PUT_LINE(
    'Transferred ' || TO_CHAR(p_amount,'FM9999990.00') ||
    ' from acct ' || p_from_id ||
    ' to acct '   || p_to_id
  );

EXCEPTION
  WHEN NO_DATA_FOUND THEN
    RAISE_APPLICATION_ERROR(-20002,
      'Account not found: ' || p_from_id || ' or ' || p_to_id);
END;
/
  
BEGIN
  TransferFunds(1, 2, 200);
END;
/

PROMPT
PROMPT ===== Bank Accounts After Transfer =====
SELECT account_id, customer_name, balance
  FROM bank_accounts
 ORDER BY account_id;
