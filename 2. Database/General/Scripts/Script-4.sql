-- Q1. salaries 테이블에서 급여에 1000을 더한 값을 조회하세요.
SELECT salary + 1000 FROM salaries;

-- Q2. salaries 테이블에서 급여에서 세금 10%를 뺀 실수령액을 조회하세요.
SELECT salary * 0.9 FROM salaries;

-- Q3. salaries 테이블에서 연봉을 월급으로 계산하여 조회하세요.
SELECT salary / 12 FROM salaries;

-- Q4. employees 테이블에서 성별 목록을 중복 없이 조회하세요.
SELECT DISTINCT gender FROM employees;

-- Q5. titles 테이블에서 직급 목록을 중복 없이 조회하세요.
SELECT DISTINCT title FROM titles;

-- Q6. employees 테이블에서 사번이 10006인 사원을 조회하세요.
SELECT * FROM employees WHERE emp_no = 10006;

-- Q7. salaries 테이블에서 급여가 60000 이상인 사원을 조회하세요.
SELECT * FROM salaries WHERE salary >= 60000;
 
-- Q8. employees 테이블에서 입사일이 1995년 이후인 사원을 조회하세요.
SELECT * FROM employees WHERE hire_date >= '1995-01-01';
 
-- Q9. employees 테이블에서 성별이 F인 사원을 조회하세요.
SELECT * FROM employees WHERE gender = 'F';

-- Q10. dept_emp 테이블에서 부서 번호가 d005인 사원을 조회하세요.
SELECT * FROM dept_emp WHERE dept_no = 'd005';

-- Q11. salaries 테이블에서 급여가 60000 이상이고 80000 이하인 사원을 조회하세요.
SELECT * FROM salaries WHERE salary BETWEEN 60000 AND 80000;

-- Q12. employees 테이블에서 성별이 M이거나 입사일이 1990년 이전인 사원을 조회하세요.
SELECT * FROM employees WHERE gender = 'M' OR hire_date < '1990-01-01';

-- Q14. dept_emp 테이블에서 부서가 d001이고 현재 재직 중인 사원을 조회하세요.
SELECT * FROM dept_emp WHERE dept_no ='d001' AND to_date = '9999-01-01';

-- Q15. salaries 테이블에서 급여가 40000 미만이거나 100000 초과인 사원을 조회하세요.
SELECT * FROM salaries WHERE salary < 40000 OR salary >100000;

-- Q16. employees 테이블에서 성별이 F이면서 1995년 이후 입사한 사원을 조회하세요.
SELECT * FROM employees WHERE gender = 'F' AND hire_date > '1995-01-01';

-- Q17. salaries 테이블에서 급여가 50000부터 70000 사이인 사원을 조회하세요.
SELECT * FROM salaries WHERE salary BETWEEN 50000 AND 70000;

-- Q18. employees 테이블에서 입사일이 1990년부터 1995년 사이인 사원을 조회하세요.
SELECT * FROM employees WHERE hire_date BETWEEN '1990-01-01' AND '1995-01-01';

-- Q19. employees 테이블에서 사번이 10010부터 10020 사이인 사원을 조회하세요.
SELECT * FROM employees WHERE emp_no BETWEEN 10010 AND 10020;

-- Q20. salaries 테이블에서 급여가 80000 이상 100000 이하인 사원을 조회하세요.
SELECT * FROM salaries WHERE salary BETWEEN 80000 AND 100000; 

-- Q21. dept_emp 테이블에서 부서 번호가 d003부터 d006 사이인 사원을 조회하세요.
SELECT * FROM dept_emp WHERE dept_no BETWEEN 'd003' AND 'd006';

-- Q22. employees 테이블에서 이름이 A로 시작하는 사원을 조회하세요.
SELECT * FROM employees WHERE first_name LIKE 'A%';

-- Q23. employees 테이블에서 이름이 n으로 끝나는 사원을 조회하세요.
SELECT * FROM employees WHERE first_name LIKE '%n';

-- Q24. employees 테이블에서 이름에 'an'이 포함된 사원을 조회하세요.
SELECT * FROM employees WHERE first_name LIKE '%an%';

-- Q25. employees 테이블에서 이름이 5글자인 사원을 조회하세요.
SELECT * FROM employees WHERE first_name LIKE '_____';
 
-- Q26. employees 테이블에서 성(last_name)에 'son'이 포함된 사원을 조회하세요.
SELECT * FROM employees WHERE last_name LIKE '%son';

-- Q27. titles 테이블에서 to_date가 NULL인 데이터를 조회하세요.
SELECT * FROM titles WHERE to_date IS NULL;

-- Q28. dept_emp 테이블에서 부서가 d001, d003, d005인 사원을 조회하세요.
SELECT * FROM dept_emp WHERE dept_no IN ('d001','d003','d005');

-- Q29. employees 테이블에서 사번이 10001, 10005, 10010인 사원을 조회하세요.
SELECT * FROM employees WHERE emp_no IN (10001, 10005, 10010);

-- Q30. departments 테이블에서 부서명이 Sales 또는 Development인 부서를 조회하세요.
SELECT * FROM departments WHERE dept_name IN ('Sales', 'Development');