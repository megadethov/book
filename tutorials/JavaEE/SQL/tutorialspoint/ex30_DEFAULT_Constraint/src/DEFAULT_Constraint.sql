/*
The DEFAULT constraint provides a default value to a column when the INSERT INTO statement does not provide a specific value.
 */
CREATE TABLE CUSTOMERS (
  ID      INT         NOT NULL,
  NAME    VARCHAR(20) NOT NULL,
  AGE     INT         NOT NULL,
  ADDRESS CHAR(25),
  SALARY  DECIMAL(18, 2) DEFAULT 5000.00,
  PRIMARY KEY (ID)
);

# If CUSTOMERS table has already been created, then to add a DFAULT constraint to SALARY column,
# you would write a statement similar to the following:
ALTER TABLE CUSTOMERS
  MODIFY SALARY DECIMAL(18, 2) DEFAULT 5000.00;

# To drop a DEFAULT constraint, use the following SQL:
ALTER TABLE CUSTOMERS
  ALTER COLUMN SALARY DROP DEFAULT;