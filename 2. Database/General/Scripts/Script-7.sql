-- 사번, 이름, 연봉 조회
SELECT e.emp_no, e.first_name, s.salary, s.to_date   FROM employees e JOIN salaries s ON e.emp_no = s.emp_no; -- 사번이 일치하는 애들만 묶기
SELECT * FROM employees e JOIN salaries s ON e.emp_no = s.emp_no WHERE s.to_date = '9999-01-01'; -- 테이블 전부 보임

-- 사번, 이름, 직무 조회(현재 재직중인)
SELECT e.emp_no, e.first_name, t.title FROM employees e JOIN titles t ON e.emp_no = t.emp_no WHERE t.to_date = '9999-01-01';
-- on이 없으면 이름과 직무가 랜덤으로 섞임. 그걸 방지하기 위해 on 사용

-- 사번, 이름, 연봉, 직무
SELECT e.emp_no, e.first_name, s.salary, t.title FROM employees e 
JOIN salaries s ON e.emp_no = s.emp_no JOIN titles t ON e.emp_no = t.emp_no;

-- left join은 left 테이블은 전부 출력 오른쪽은 일치하는 것만 출력
SELECT * FROM departments d LEFT JOIN dept_manager dm ON d.dept_no = dm.dept_no;

SELECT * FROM dept_manager dm RIGHT JOIN departments d ON dm.dept_no = d.dept_no;