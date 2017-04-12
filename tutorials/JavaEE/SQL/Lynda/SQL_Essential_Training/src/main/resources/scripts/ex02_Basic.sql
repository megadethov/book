-- 04 CREATE TABLE-------------------------------------

CREATE TABLE test (
  a INTEGER,
  b TEXT
);

INSERT INTO test VALUES ( 1, 'a' );
INSERT INTO test VALUES ( 2, 'b' );
INSERT INTO test VALUES ( 3, 'c' );
SELECT * FROM test;

-- 05 DELETE TABLE-------------------------------------

CREATE TABLE test ( a TEXT, b TEXT );
INSERT INTO test VALUES ( 'one', 'two' );
SELECT * FROM test;
DROP TABLE test;
DROP TABLE IF EXISTS test;

-- 06 INSERT INTO--------------------------------------------------

CREATE TABLE test ( a INTEGER, b TEXT, c TEXT );
SELECT * FROM test;

INSERT INTO test VALUES ( 1, 'This', 'Right here!' );
INSERT INTO test ( b, c ) VALUES ( 'That', 'Over there!' );
INSERT INTO test ( a, b, c ) SELECT id, name, description from item;