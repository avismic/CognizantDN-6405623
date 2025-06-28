SET SERVEROUTPUT ON

CREATE TABLE customers (
  customer_id   NUMBER       PRIMARY KEY,
  customer_name VARCHAR2(100),
  age           NUMBER(3)
);

CREATE TABLE loans (
  loan_id       NUMBER       PRIMARY KEY,
  customer_id   NUMBER       REFERENCES customers(customer_id),
  interest_rate NUMBER(5,2)   
);

INSERT INTO customers VALUES (1,'Abhishek Anand',   45);
INSERT INTO customers VALUES (2,'Adarsh Singh',     67);
INSERT INTO customers VALUES (3,'Narendra Modi',  72);

INSERT INTO loans VALUES (101,1,8.25);
INSERT INTO loans VALUES (102,2,9.00);
INSERT INTO loans VALUES (103,3,15);
COMMIT;

SELECT loan_id, customer_id, interest_rate
  FROM loans
 ORDER BY loan_id;

DECLARE
  CURSOR cur_seniors IS
    SELECT l.loan_id
    FROM   customers c
           JOIN loans l USING (customer_id)
    WHERE  c.age > 60;
BEGIN
  FOR rec IN cur_seniors LOOP
    UPDATE loans
       SET interest_rate = interest_rate - 1
     WHERE loan_id = rec.loan_id;
  END LOOP;
  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Scenario 1: Discount applied to all senior loans.');
END;
/

SELECT loan_id, customer_id, interest_rate
  FROM loans
 ORDER BY loan_id;
