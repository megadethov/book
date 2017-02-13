CREATE TABLE CUSTOMERS (
  ID      INT         NOT NULL,
  NAME    VARCHAR(20) NOT NULL,
  AGE     INT         NOT NULL,
  ADDRESS CHAR(25),
  SALARY  DECIMAL(18, 2) DEFAULT 5000.00,
  PRIMARY KEY (ID)
);

/*If CUSTOMERS table has already been created, then to add a DEFAULT constraint to SALARY column, you would write a statement similar to the following:
ALTER TABLE CUSTOMERS
  MODIFY SALARY  DECIMAL (18, 2) DEFAULT 5000.00;*/

