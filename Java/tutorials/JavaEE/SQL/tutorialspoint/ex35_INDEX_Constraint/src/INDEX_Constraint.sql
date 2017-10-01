/*
The INDEX is used to create and retrieve data from the database very quickly.
Index can be created by using single or group of columns in a table.
When index is created, it is assigned a ROWID for each row before it sorts out the data.
 */

# For example, the following SQL creates a new table called CUSTOMERS and adds five columns:
CREATE TABLE CUSTOMERS(
  ID   INT              NOT NULL,
  NAME VARCHAR (20)     NOT NULL,
  AGE  INT              NOT NULL,
  ADDRESS  CHAR (25) ,
  SALARY   DECIMAL (18, 2),
  PRIMARY KEY (ID)
);

# Now, you can create index on single or multiple columns using the following syntax:
CREATE INDEX index_name
  ON table_name ( column1, column2.....);

# To create an INDEX on AGE column, to optimize the search on customers for a particular age, following is the SQL syntax:
CREATE INDEX idx_age
  ON CUSTOMERS (AGE);

# To drop an INDEX constraint, use the following SQL:
ALTER TABLE CUSTOMERS
    DROP INDEX idx_age;
