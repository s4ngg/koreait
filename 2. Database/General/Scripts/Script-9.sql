CREATE TABLE db_tcl (id varchar(50));

INSERT INTO db_tcl values('test1');
INSERT INTO db_tcl values('test2');
INSERT INTO db_tcl values('test3');

SELECT * FROM db_tcl;
COMMIT;

UPDATE db_tcl SET id = 'test4';
ROLLBACK; -- 마지막  commit 시점으로 롤백