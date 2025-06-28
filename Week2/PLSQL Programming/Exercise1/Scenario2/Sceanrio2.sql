SET SERVEROUTPUT ON

CREATE TABLE customers (
  customer_id   NUMBER       PRIMARY KEY,
  customer_name VARCHAR2(100),
  balance       NUMBER(12,2),
  is_vip        CHAR(3)  DEFAULT 'No'   
);

INSERT INTO customers VALUES (1,'Adarsh Singh',     5500,'No');
INSERT INTO customers VALUES (2,'Abhishek Anand',     12000,'No');
INSERT INTO customers VALUES (3,'Kriti Kumari',25000,'No');
COMMIT;

SET LINESIZE 120
SET PAGESIZE 50

COLUMN customer_id   FORMAT 999  HEADING 'ID'
COLUMN customer_name FORMAT A25  HEADING 'NAME'
COLUMN balance       FORMAT 999,999,999.99  HEADING 'BALANCE'
COLUMN is_vip        FORMAT A3   HEADING 'VIP'

SELECT customer_id, customer_name, balance, is_vip
  FROM customers
 ORDER BY customer_id;

DECLARE
  CURSOR cur_cust IS SELECT customer_id, balance FROM customers;
BEGIN
  FOR rec IN cur_cust LOOP
    IF rec.balance > 10000 THEN
      UPDATE customers
         SET is_vip = 'Yes'
       WHERE customer_id = rec.customer_id;
    END IF;
  END LOOP;
  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Scenario 2: VIP flags updated.');
END;
/

SET LINESIZE 120
SET PAGESIZE 50

COLUMN customer_id   FORMAT 999  HEADING 'ID'
COLUMN customer_name FORMAT A25  HEADING 'NAME'
COLUMN balance       FORMAT 999,999,999.99  HEADING 'BALANCE'
COLUMN is_vip        FORMAT A3   HEADING 'VIP'

SELECT customer_id, customer_name, balance, is_vip
  FROM customers
 ORDER BY customer_id;
