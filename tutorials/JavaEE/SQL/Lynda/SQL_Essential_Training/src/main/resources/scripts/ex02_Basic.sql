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

-- 07 DELETE FROM--------------------------------------------------------

SELECT * FROM test;
DELETE FROM test WHERE a = 3;
SELECT * FROM test WHERE a = 1;
DELETE FROM test WHERE a = 1;

-- 08 NULL---------------------------------------------------------

SELECT * FROM test;
INSERT INTO test ( b, c ) VALUES ( 'That', 'Over there!' );
SELECT * FROM test WHERE a = NULL;
SELECT * FROM test WHERE a IS NULL;
SELECT * FROM test WHERE a IS NOT NULL;
INSERT INTO test ( a, b, c ) VALUES ( 0, NULL, '' );
SELECT * FROM test WHERE b IS NULL;
SELECT * FROM test WHERE b = '';
SELECT * FROM test WHERE c = '';
SELECT * FROM test WHERE c IS NULL;

DROP TABLE test;
CREATE TABLE test (
  a INTEGER NOT NULL,
  b TEXT NOT NULL,
  c TEXT
);

INSERT INTO test VALUES ( 1, 'this', 'that' );
SELECT * FROM test;

INSERT INTO test ( b, c ) VALUES ( 'one', 'two' );
INSERT INTO test ( a, c ) VALUES ( 1, 'two' );
INSERT INTO test ( a, b ) VALUES ( 1, 'two' );
DROP TABLE test;

-- 09 Constraints-----------------------------------------------------------

CREATE TABLE test ( a TEXT, b TEXT, c TEXT );
INSERT INTO test ( a, b ) VALUES ( 'one', 'two' );
SELECT * FROM test;

CREATE TABLE test ( a TEXT, b TEXT, c TEXT NOT NULL );
# CREATE TABLE test ( a TEXT, b TEXT, c TEXT DEFAULT 'panda' ); #TEXT DEFAULT not work in MySQL
CREATE TABLE test ( a TEXT, b TEXT, c VARCHAR(125) DEFAULT 'panda' );
CREATE TABLE test ( a VARCHAR(125) UNIQUE, b TEXT, c VARCHAR(125) DEFAULT 'panda' );
CREATE TABLE test ( a VARCHAR(125) UNIQUE NOT NULL, c VARCHAR(125) DEFAULT 'panda' );

-- 10 ALTER TABLE

CREATE TABLE test ( a TEXT, b TEXT, c TEXT );
INSERT INTO test VALUES ( 'one', 'two', 'three');
INSERT INTO test VALUES ( 'two', 'three', 'four');
INSERT INTO test VALUES ( 'three', 'four', 'five');
SELECT * FROM test;

ALTER TABLE test ADD d TEXT;
ALTER TABLE test ADD e VARCHAR(125) DEFAULT 'panda';

DROP TABLE test;

-- 11 ID------------------------------------------------------------

CREATE TABLE test (
  id INTEGER PRIMARY KEY AUTO_INCREMENT,
  a INTEGER,
  b TEXT
);
INSERT INTO test (a, b) VALUES ( 10, 'a' );
INSERT INTO test (a, b) VALUES ( 11, 'b' );
INSERT INTO test (a, b) VALUES ( 12, 'c' );
SELECT * FROM test;