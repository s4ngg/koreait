## Q.10
CREATE TABLE position (
	id int REFERENCES employees (position_id),
	position_name varchar(255));

## Q.11
SELECT name,dept FROM employees;

## Q.12
INSERT INTO employees VALUES(
NULL,'짱구',5,'M','개발팀',9800,5);

## Q.13
UPDATE employees
SET salary = 3500
WHERE name = '김민수';

## Q.14
DELETE FROM employees 
WHERE name = '김민수';

## Q.15
SELECT name FROM employees WHERE dept = '개발팀' AND salary >= 3000;

## Q.16
SELECT name FROM employees WHERE dept = '기획팀' OR dept = '마케팅팀';

## Q.17
SELECT name FROM employees WHERE name LIKE '김%';

## Q.18
SELECT e.name, p.position_name FROM employees e JOIN position p ON e.position_id = p.id;