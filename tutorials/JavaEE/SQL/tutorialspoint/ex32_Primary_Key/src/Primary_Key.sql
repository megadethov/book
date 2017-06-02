/*
A primary key is a field in a table which uniquely identifies each row/record in a database table. Primary keys must contain unique values. A primary key column cannot have NULL values.
A table can have only one primary key, which may consist of single or multiple fields. When multiple fields are used as a primary key, they are called a composite key.
If a table has a primary key defined on any field(s), then you can not have two records having the same value of that field(s).

 */
CREATE TABLE CUSTOMERS (
  ID      INT         NOT NULL,
  NAME    VARCHAR(20) NOT NULL,
  AGE     INT         NOT NULL,
  ADDRESS CHAR(25),
  SALARY  DECIMAL(18, 2),
  PRIMARY KEY (ID)
);

# To create a PRIMARY KEY constraint on the "ID" column when CUSTOMERS table already exists, use the following SQL syntax:
# NOTE: If you use the ALTER TABLE statement to add a primary key, the primary key column(s) must already have been
# declared to not contain NULL values (when the table was first created).
ALTER TABLE CUSTOMERS
  ADD PRIMARY KEY (ID);

# For defining a PRIMARY KEY constraint on multiple columns, use the following SQL syntax:
CREATE TABLE CUSTOMERS (
  ID      INT         NOT NULL,
  NAME    VARCHAR(20) NOT NULL,
  AGE     INT         NOT NULL,
  ADDRESS CHAR(25),
  SALARY  DECIMAL(18, 2),
  PRIMARY KEY (ID, NAME)
);

# To create a PRIMARY KEY constraint on the "ID" and "NAMES" columns when CUSTOMERS table already exists,
# use the following SQL syntax:
ALTER TABLE CUSTOMERS
  ADD CONSTRAINT PK_CUSTID PRIMARY KEY (ID, NAME);

# You can clear the primary key constraints from the table, Use Syntax:
ALTER TABLE CUSTOMERS
  DROP PRIMARY KEY;
