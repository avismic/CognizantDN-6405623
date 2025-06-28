SET SERVEROUTPUT ON;

BEGIN
  EXECUTE IMMEDIATE 'DROP TABLE customers';
EXCEPTION
  WHEN OTHERS THEN
    IF SQLCODE != -942 THEN
      RAISE;
    END IF;
END;
/

CREATE TABLE customers (
  customer_id   NUMBER       PRIMARY KEY,
  customer_name VARCHAR2(100)
);

CREATE TABLE loans (
  loan_id       NUMBER       PRIMARY KEY,
  customer_id   NUMBER       REFERENCES customers(customer_id),
  due_date      DATE
);

INSERT INTO customers(customer_id, customer_name) VALUES (1, 'Adarsh Singh');
INSERT INTO customers(customer_id, customer_name) VALUES (2, 'Abhishek Anand');
INSERT INTO customers(customer_id, customer_name) VALUES (3, 'Kriti Kumari');

INSERT INTO loans(loan_id, customer_id, due_date) VALUES (101, 1, TRUNC(SYSDATE) + 5);
INSERT INTO loans(loan_id, customer_id, due_date) VALUES (102, 2, TRUNC(SYSDATE) + 15);
INSERT INTO loans(loan_id, customer_id, due_date) VALUES (103, 3, TRUNC(SYSDATE) + 40);
COMMIT;

DECLARE
  CURSOR cur_due IS
    SELECT l.loan_id,
           c.customer_name,
           l.due_date
      FROM loans l
      JOIN customers c ON c.customer_id = l.customer_id
     WHERE l.due_date BETWEEN TRUNC(SYSDATE)
                          AND TRUNC(SYSDATE) + 30;
BEGIN
  FOR rec IN cur_due LOOP
    DBMS_OUTPUT.PUT_LINE(
      'Reminder: Loan '    || rec.loan_id ||
      ' for '              || rec.customer_name ||
      ' is due on '        || TO_CHAR(rec.due_date, 'DD-Mon-YYYY')
    );
  END LOOP;
END;
/
