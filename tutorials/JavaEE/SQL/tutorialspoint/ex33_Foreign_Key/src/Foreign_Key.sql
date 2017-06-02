/*
A foreign key is a key used to link two tables together. This is sometimes called a referencing key.
Foreign Key is a column or a combination of columns whose values match a Primary Key in a different table.
 */
# Consider the structure of the two tables as follows:

# CUSTOMERS table:
CREATE TABLE CUSTOMERS (
  ID      INT         NOT NULL,
  NAME    VARCHAR(20) NOT NULL,
  AGE     INT         NOT NULL,
  ADDRESS CHAR(25),
  SALARY  DECIMAL(18, 2),
  PRIMARY KEY (ID)
);

# ORDERS table:
CREATE TABLE ORDERS (
  ID          INT NOT NULL,
  DATE        DATETIME,
  CUSTOMER_ID INT REFERENCES CUSTOMERS (ID),
  AMOUNT      DOUBLE,
  PRIMARY KEY (ID)
);

# If ORDERS table has already been created, and the foreign key has not yet been set, use the syntax
# for specifying a foreign key by altering a table.
ALTER TABLE ORDERS
  ADD FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMERS (ID);

# To drop a FOREIGN KEY constraint, use the following SQL:
ALTER TABLE ORDERS
  DROP CUSTOMER_ID;