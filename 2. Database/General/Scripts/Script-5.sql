SELECT * FROM employees ORDER BY birth_date; -- order by : 오름차순 정렬
SELECT * FROM employees ORDER BY birth_date DESC; -- order by 00 DESC : 내림차순 정렬
SELECT * FROM employees ORDER BY birth_date ASC; -- order by 00 ASC : 오름차순 정렬인데 기본값이 오름차순이라 ASC 스킵해도 됨.
SELECT * FROM titles ORDER BY to_date DESC;

-- Group 함수
-- max, min, avg, sum 기능 // count : 조회된 컬럼의 개수 확인, 보통 *로 확인
SELECT max(salary) FROM salaries s;  
SELECT min(salary) FROM salaries s; 
SELECT avg(salary) FROM salaries s; 
SELECT sum(salary) FROM salaries s; 
SELECT count(*) FROM salaries s;

SELECT count(*) AS '직원 수 ' FROM employees;

-- Q1. 실습
SELECT count(title = 'Enginner') AS '직원 수' FROM titles;
SELECT count(*) FROM employees WHERE hire_date > '1965-01-01';
SELECT min(emp_no), max(emp_no) FROM employees;

-- Group By 함수 // 특정 컬럼을 기준으로 묶어 그룹화 시킴
SELECT max(emp_no), birth_date FROM employees GROUP BY birth_date; -- group by에 작성한 컬럼 기준(birth_date)으로 묶음

-- 부서별 직원 수 구하기
-- > 부서 번호(dept_no) 조회
SELECT count(*), dept_no FROM dept_emp GROUP BY dept_no; -- dept_no로 묶고 count로 묶은 dept_no를 출력

-- Q2. 실습
SELECT count(*) AS 'cnt', gender  FROM employees GROUP BY gender;

SELECT count(*), title AS '직원 수' FROM titles GROUP BY title HAVING count(*) >= 100000 ORDER BY title DESC;
-- HAVING : 조건을 달아줌

-- dept_emp에서 직원 수가 5만 이상인 부서만 조회
SELECT count(*), dept_no FROM dept_emp GROUP BY dept_no HAVING count(*) >= 50000;

-- 현재 재직중인 직원들 중 직무별 직원 수가 200명 미만인 직무만 조회
-- to_date가 9999-01-01이 재직중
SELECT title, count(*) FROM titles s WHERE to_date = '9999-01-01' GROUP BY title HAVING count(*) <= 200;