-- 02 LENGTH
-- world.db

SELECT LENGTH('string');
SELECT Name, LENGTH(Name) AS Len FROM City ORDER BY Len DESC;
SELECT Name, LENGTH(Name) AS Len FROM City ORDER BY Len DESC, Name;

-- 03 SUBSTR---------------------------------------------------------------------------------
-- album.db

SELECT SUBSTR('this string', 6);
SELECT released,
  SUBSTR(released, 1, 4) AS year,
  SUBSTR(released, 6, 2) AS month,
  SUBSTR(released, 9, 2) AS day
FROM album
ORDER BY released
;