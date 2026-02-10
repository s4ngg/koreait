-- employees라는 데이터베이스 선택
use employees;

-- select * from employees; -- * : 모든 컬럼 선택. -> select * <모든 컬럼 선택> from employees <employees 테이블에서> 

-- Q1.실습
select emp_no, birth_date from employees;
select hire_date from employees;
select emp_no, from_date, to_date from dept_manager;
select * from departments;

insert into employees 
values (1,
		'2000-01-01',
		'sangwoo',
		'kim',
		'M',
		now()); -- now는 현재 date 의미

select * from employees;

-- Q1.실습
INSERT INTO departments 
VALUES ('d010',
		'Korea IT Department');
 
INSERT INTO employees 
VALUES (2,
		'2002-01-01',
		'kim',
		'sangwoo',
		'M',
		now());

INSERT INTO dept_emp
VALUES (1,
		'd010',
		now(),
		'9999-01-01');

UPDATE employees
SET first_name = '길동'
WHERE emp_no = 10001; -- emp_no의 10001의 값을 가진 first_name을 길동으로 바꾼다
 
UPDATE employees
SET last_name = '홍',
	hire_date = now()
WHERE emp_no = 10001;

SELECT * FROM employees;

-- Q2. 실습
UPDATE departments
SET Sales = 'Tech Sales'
WHERE dept_no = 'd007';
 
UPDATE employees
SET birth_date = '1977-07-07'
WHERE last_name = 'Erie';
 
SELECT * FROM employees
WHERE last_name = 'Erie';

DELETE FROM employees 
WHERE emp_no = 10005;
SELECT *  FROM employees;

DELETE FROM employees 
WHERE hire_date = '1993-05-12';

SELECT * FROM employees
WHERE hire_date = '1993-05-12';

DELETE FROM employees 
WHERE emp_no = 28847;


-- 
CREATE TABLE test_member (
	member_id varchar(50) COMMENT '아이디', -- 뒤에 COMMENT를 붙혀 메세지 추가
	member_pwd varchar(255) COMMENT '비밀번호',
	member_name varchar(50) COMMENT '이름',
	member_age TINYINT COMMENT '나이',
	member_in_date datetime COMMENT '가입일'
);  
 
 DROP TABLE test_member; -- drop은 테이블 삭제

 
 CREATE TABLE free_board (
 	board_no int COMMENT '게시판 번호',
 	board_title varchar(100) COMMENT '게시판 제목',
 	board_content TEXT COMMENT '게시판 내용',
 	board_date datetime COMMENT '게시판 작성일',
 	board_views int COMMENT '게시판 조회수'
 );
 
 INSERT INTO free_board 
 VALUES (6,
 	'임시1',
 	'데이터1',
 	now(),
 	5);
 
 INSERT INTO free_board 
 VALUES (7,
 	'임시2',
 	'데이터2',
 	now(),
 	7);
 
 INSERT INTO free_board 
 VALUES (9,
 	'임시3',
 	'데이터3',
 	now(),
 	9);
 SELECT * FROM free_board
 
 
 CREATE TABLE ddl_alter_test (
 	alter_id varchar(255),
 	alter_name varchar(255),
 	alter_as varchar(255)
 );
 
 -- 테이블 이름 변경
 ALTER TABLE ddl_alter_test RENAME TO ddl_alter;

 -- 테이블 구조 변경 (컬럼 변경)
 ALTER TABLE ddl_alter
 MODIFY alter_as varchar(100); -- modify는 컬럼의 속성 변경하는 명령어
 
 -- 테이블 구조 변경 (컬럼 추가)
 ALTER TABLE ddl_alter 
ADD alter_pwd varchar(255); -- add는 컬럼을 추가하는 명령어

-- 테이블 구조 변경 (컬럼 삭제)
ALTER TABLE ddl_alter 
DROP COLUMN alter_as; 
-- drop column은 컬럼을 삭제하는 명령어 / drop은 종류가 여러가지라 삭제할 속성을 추가 작성해줘야함
-- rename 도 마찬가지로 rename column사용
 
-- alter_name이라는 컬럼에 중복된 값이 들어가서는 안된다라는 조건을 추가
-- constraint : 제약조건 추가
-- unique : 중복 불가
ALTER TABLE ddl_alter 
ADD CONSTRAINT alter_name_unique UNIQUE(alter_name); -- 제약의 이름설정
 
-- "sang", "김상우", 'qwer1234!'
-- "test", "김상우", '1234'
INSERT INTO ddl_alter 
VALUES ("sang", "김상우66", 'qwer1234!'),
	   ("test", "김상우55", '1234');

SELECT * FROM ddl_alter;

-- MySQL에서는 지원 X, 수정하려면 제거 후 다시 추가
-- ALTER TABLE ddl_alter 
-- RENAME CONSTRAINT alter_name_unique TO name_unique; 

ALTER TABLE ddl_alter
DROP CONSTRAINT alter_name_unique;

ALTER TABLE ddl_alter
ADD CONSTRAINT name_unique UNIQUE(alter_name);

CREATE TABLE test_employees(
	te_employee_id int,
	te_first_name varchar(50),
	te_last_name varchar(50),
	te_salary int,
	te_department varchar(50)
);
-- Q1. 실습
ALTER TABLE test_employees RENAME TO STAFF;
ALTER TABLE STAFF 
MODIFY te_department varchar(100),
RENAME COLUMN te_last_name TO surname,
DROP COLUMN te_first_name,
ADD te_hire_date datetime,
ADD CONSTRAINT te_salary_check UNIQUE(te_salary);

DROP TABLE ddl_alter;

-- free_board, staff, test_member 제거하기
DROP TABLE free_board, staff, test_member;