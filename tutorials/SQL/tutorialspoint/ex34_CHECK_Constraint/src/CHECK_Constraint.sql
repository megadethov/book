/*
The CHECK Constraint enables a condition to check the value being entered
into a record. If the condition evaluates to false, the record violates the
constraint and isn't entered into the table.
For example, the following SQL creates a new table called CUSTOMERS and adds five columns. Here, we add a CHECK
with AGE column, so that you can not have any CUSTOMER below 18 years:
 */
CREATE TABLE CUSTOMERS(
  ID   INT              NOT NULL,
  NAME VARCHAR (20)     NOT NULL,
  AGE  INT              NOT NULL CHECK (AGE >= 18),
  ADDRESS  CHAR (25) ,
  SALARY   DECIMAL (18, 2),
  PRIMARY KEY (ID)
);

# You can also use following syntax, which supports naming the constraint in multiple columns as well:
ALTER TABLE CUSTOMERS
    ADD CONSTRAINT myCheckConstraint CHECK (AGE >= 18);

# To drop a CHECK constraint, use the following SQL. This syntax does not work with MySQL:
ALTER TABLE CUSTOMERS
    DROP myCheckConstraint;