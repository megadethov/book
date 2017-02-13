/*Create Primary Key:
Here is the syntax to define ID attribute as a primary key in a CUSTOMERS table.
*/
CREATE TABLE CUSTOMERS (
  ID      INT         NOT NULL,
  NAME    VARCHAR(20) NOT NULL,
  AGE     INT         NOT NULL,
  ADDRESS CHAR(25),
  SALARY  DECIMAL(18, 2),
  PRIMARY KEY (ID)
);

/*To create a PRIMARY KEY constraint on the "ID" column when CUSTOMERS table
already exists, use the following SQL syntax:
NOTE: If you use the ALTER TABLE statement to add a primary key,
the primary key column(s) must already have been declared to not contain NULL values
(when the table was first created).
*/
ALTER TABLE CUSTOMERS
  ADD PRIMARY KEY (ID);

/*
For defining a PRIMARY KEY constraint on multiple columns, use the following SQL syntax:
 */
CREATE TABLE CUSTOMERS (
  ID      INT         NOT NULL,
  NAME    VARCHAR(20) NOT NULL,
  AGE     INT         NOT NULL,
  ADDRESS CHAR(25),
  SALARY  DECIMAL(18, 2),
  PRIMARY KEY (ID, NAME)
);

/*
To create a PRIMARY KEY constraint on the "ID" and "NAMES" columns when CUSTOMERS
table already exists, use the following SQL syntax:
 */
ALTER TABLE CUSTOMERS
  ADD CONSTRAINT PK_CUSTID PRIMARY KEY (ID, NAME);

# You can clear the primary key constraints from the table, Use Syntax:
ALTER TABLE CUSTOMERS DROP PRIMARY KEY;
