-- 01 numeric types
-- database.db

-- demonstrates comparing two REAL numbers
/*SELECT A, B, A = B FROM
  ( SELECT ( ( .1 + .2 ) * 10 ) as A,
           ( 1.0 + 2.0 ) as B );*/

-- same demonstration using SQLite CAST function
/*SELECT A, B, A = B FROM
  ( SELECT ( CAST(.1 AS REAL) + CAST(.2 AS REAL) ) * CAST(10 AS REAL) as A,
           ( CAST(1 AS REAL) + CAST(2 AS REAL) ) as B );*/

# todo it's not work with MySQL