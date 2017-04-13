-- 02 JOIN
-- test.db

-- join example tables, left and right
CREATE TABLE left_table ( id INTEGER, description TEXT );
CREATE TABLE right_table ( id INTEGER, description TEXT );

INSERT INTO left_table VALUES ( 1, 'left 01' );
INSERT INTO left_table VALUES ( 2, 'left 02' );
INSERT INTO left_table VALUES ( 3, 'left 03' );
INSERT INTO left_table VALUES ( 4, 'left 04' );
INSERT INTO left_table VALUES ( 5, 'left 05' );
INSERT INTO left_table VALUES ( 6, 'left 06' );
INSERT INTO left_table VALUES ( 7, 'left 07' );
INSERT INTO left_table VALUES ( 8, 'left 08' );
INSERT INTO left_table VALUES ( 9, 'left 09' );

INSERT INTO right_table VALUES ( 6, 'right 06' );
INSERT INTO right_table VALUES ( 7, 'right 07' );
INSERT INTO right_table VALUES ( 8, 'right 08' );
INSERT INTO right_table VALUES ( 9, 'right 09' );
INSERT INTO right_table VALUES ( 10, 'right 10' );
INSERT INTO right_table VALUES ( 11, 'right 11' );
INSERT INTO right_table VALUES ( 11, 'right 12' );
INSERT INTO right_table VALUES ( 11, 'right 13' );
INSERT INTO right_table VALUES ( 11, 'right 14' );

SELECT * FROM left_table;
SELECT * FROM right_table;

SELECT l.description AS `left-descr`, r.description AS `right-descr`
FROM left_table AS l
JOIN right_table AS r ON l.id = r.id
;

-- restore database
DROP TABLE left_table;
DROP TABLE right_table;