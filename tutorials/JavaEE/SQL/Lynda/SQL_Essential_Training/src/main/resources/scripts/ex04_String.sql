-- 02 LENGTH
-- world.db

SELECT LENGTH('string');
SELECT Name, LENGTH(Name) AS Len FROM City ORDER BY Len DESC;
SELECT Name, LENGTH(Name) AS Len FROM City ORDER BY Len DESC, Name;
