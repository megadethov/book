/*
The UNIQUE Constraint prevents two records from having identical values
in a particular column. In the CUSTOMERS table, for example, you might want
to prevent two or more people from having identical age.
 */

CREATE TABLE customers (
  ID      INT         NOT NULL,
  NAME    VARCHAR(20) NOT NULL,
  AGE     INT         NOT NULL UNIQUE,
  ADDRESS CHAR(25),
  SALARY  DECIMAL(18, 2),
  PRIMARY KEY (ID)
);

# If CUSTOMERS table has already been created, then to add a UNIQUE constraint to AGE column,
# you would write a statement similar to the following:
ALTER TABLE customers
  MODIFY AGE INT NOT NULL UNIQUE;

# You can also use following syntax, which supports naming the constraint in multiple columns as well:
ALTER TABLE customers
    ADD CONSTRAINT myUniqueConstraint UNIQUE (AGE, SALARY);

# To drop a UNIQUE constraint, use the following SQL:
ALTER TABLE CUSTOMERS
  DROP CONSTRAINT myUniqueConstraint;

# If you are using MySQL, then you can use the following syntax:
ALTER TABLE CUSTOMERS
  DROP INDEX myUniqueConstraint;

