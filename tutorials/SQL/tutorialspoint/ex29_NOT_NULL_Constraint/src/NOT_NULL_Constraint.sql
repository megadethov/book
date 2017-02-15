/*
By default, a column can hold NULL values. If you do not want a column to have a NULL value, then you need to define
such constraint on this column specifying that NULL is now not allowed for that column.
A NULL is not the same as no data, rather, it represents unknown data.
 */
CREATE TABLE customers (
  ID      INT         NOT NULL,
  NAME    VARCHAR(20) NOT NULL,
  AGE     INT         NOT NULL,
  ADDRESS CHAR(25),
  SALARY  DECIMAL(18, 2),
  PRIMARY KEY (ID)
);

# If CUSTOMERS table has already been created, then to add a NOT NULL constraint to SALARY column
# in Oracle and MySQL, you would write a statement similar to the following:
ALTER TABLE customers
  MODIFY salary DECIMAL(18, 2) NOT NULL;