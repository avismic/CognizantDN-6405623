SET SERVEROUTPUT ON
SET LINESIZE 120
SET PAGESIZE 50

COLUMN account_id    FORMAT 999            HEADING 'ID'
COLUMN customer_name FORMAT A25           HEADING 'NAME'
COLUMN balance       FORMAT 999,999,999.99 HEADING 'BALANCE'

CREATE TABLE savings_accounts (
  account_id    NUMBER       PRIMARY KEY,
  customer_name VARCHAR2(100),
  balance       NUMBER(12,2)
);

INSERT INTO savings_accounts VALUES (1, 'Abhishek Anand',   1000.00);
INSERT INTO savings_accounts VALUES (2, 'Akash Kumar',     2000.50);
INSERT INTO savings_accounts VALUES (3, 'Ankit Kumar',5000.00);
COMMIT;

SELECT account_id, customer_name, balance
  FROM savings_accounts
 ORDER BY account_id;
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
  UPDATE savings_accounts
     SET balance = ROUND(balance * 1.01, 2);
  COMMIT;
  DBMS_OUTPUT.PUT_LINE(
    'Monthly interest (1%) applied to all savings accounts.'
  );
END;
/
  
BEGIN
  ProcessMonthlyInterest;
END;
/

PROMPT
PROMPT ===== Savings Accounts After Interest =====
SELECT account_id, customer_name, balance
  FROM savings_accounts
 ORDER BY account_id;
