CREATE DATABASE DATABASE_NAME;
CREATE DATABASE EMP;

DROP DATABASE DATABASE_NAME;
DROP DATABASE EMP;

CREATE TABLE Employees
(
  id    INT NOT NULL,
  age   INT NOT NULL,
  first VARCHAR(255),
  last  VARCHAR(255),
  PRIMARY KEY (id)
);

DROP TABLE Employees;

INSERT INTO Employees VALUES (100, 18, 'Zara', 'Ali');

SELECT
  first,
  last,
  age
FROM Employees
WHERE id = 100;

UPDATE Employees
SET age = 20
WHERE id = 100;

DELETE FROM Employees
WHERE id = 100;

/*
Login to the database as follows −
C:\Program Files\MySQL\bin>mysql -u root -p
Enter password: ********
mysql>
*/

# CREATE the TABLE Employee AS FOLLOWS −
USE EMP;
CREATE TABLE Employees
(
  id    INT NOT NULL,
  age   INT NOT NULL,
  first VARCHAR(255),
  last  VARCHAR(255)
);

# Finally you create few records in Employee table as follows −
INSERT INTO Employees VALUES (100, 18, 'Zara', 'Ali');
INSERT INTO Employees VALUES (101, 25, 'Mahnaz', 'Fatma');
INSERT INTO Employees VALUES (102, 30, 'Zaid', 'Khan');
INSERT INTO Employees VALUES (103, 28, 'Sumit', 'Mittal');









