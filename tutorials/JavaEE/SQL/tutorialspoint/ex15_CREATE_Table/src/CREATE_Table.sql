/*
Creating a basic table involves naming the table and defining its columns and each column's data type.
The SQL CREATE TABLE statement is used to create a new table.
Basic syntax of CREATE TABLE statement is as follows:

CREATE TABLE table_name(
   column1 datatype,
   column2 datatype,
   column3 datatype,
   .....
   columnN datatype,
   PRIMARY KEY( one or more columns )
);
*/

CREATE TABLE customers (
  ID      INT         NOT NULL,
  NAME    VARCHAR(20) NOT NULL,
  AGE     INT         NOT NULL,
  ADDRESS CHAR(25),
  SALARY  DECIMAL(18, 2),
  PRIMARY KEY (ID)
);

/*
You can verify if your table has been created successfully by looking at the message displayed
by the SQL server, otherwise you can use DESC command as follows:
 */
DESC customers;