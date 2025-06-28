SET SERVEROUTPUT ON
SET LINESIZE 120
SET PAGESIZE 50

COLUMN employee_id   FORMAT 999                HEADING 'ID'
COLUMN employee_name FORMAT A25                HEADING 'NAME'
COLUMN department_id FORMAT 99                 HEADING 'DEPT'
COLUMN salary        FORMAT 999,999,999.99     HEADING 'SALARY'

CREATE TABLE employees (
  employee_id   NUMBER       PRIMARY KEY,
  employee_name VARCHAR2(100),
  department_id NUMBER,
  salary        NUMBER(12,2)
);

INSERT INTO employees VALUES (101, 'Abhishek Anand',   10, 50000);
INSERT INTO employees VALUES (102, 'Carlos Sainz',  11, 60000);
INSERT INTO employees VALUES (103, 'Max Verstappen',   10, 55000);
COMMIT;

SELECT employee_id, employee_name, department_id, salary
  FROM employees
 ORDER BY department_id, employee_id;
 PROMPT;

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
  p_dept_id   IN NUMBER,
  p_bonus_pct IN NUMBER
) AS
BEGIN
  UPDATE employees
     SET salary = ROUND(salary * (1 + p_bonus_pct/100), 2)
   WHERE department_id = p_dept_id;
  COMMIT;
  DBMS_OUTPUT.PUT_LINE(
    'Applied ' || p_bonus_pct || '% bonus to dept ' || p_dept_id
  );
END;
/

BEGIN
  UpdateEmployeeBonus(10, 10);
END;
/

PROMPT
PROMPT ===== Employees After Bonus =====
SELECT employee_id, employee_name, department_id, salary
  FROM employees
 ORDER BY department_id, employee_id;
