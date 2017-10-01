/*First normal form (1NF) sets the very basic rules for an organized database:
Define the data items required, because they become the columns in a table. Place related data items in a table.
Ensure that there are no repeating groups of data.
Ensure that there is a primary key.
*/
CREATE TABLE CUSTOMERS (
  ID      INT         NOT NULL,
  NAME    VARCHAR(20) NOT NULL,
  AGE     INT         NOT NULL,
  ADDRESS CHAR(25),
  ORDERS  VARCHAR(155)
);

/*So IF we populate this TABLE FOR a single customer HAVING multiple orders, THEN it would be something AS FOLLOWS :
ID  NAME  AGE ADDRESS         ORDERS
100 Sachin 36 Lower West Side Cannon XL-200
100 Sachin 36 Lower West Side Battery XL-200
100 Sachin 36 Lower West Side Tripod Large

But as per 1NF, we need to ensure that there are no repeating groups of data. So let us break above table into
two parts and join them using a key as follows:
*/
# CUSTOMERS table:
CREATE TABLE CUSTOMERS (
  ID      INT         NOT NULL,
  NAME    VARCHAR(20) NOT NULL,
  AGE     INT         NOT NULL,
  ADDRESS CHAR(25),
  PRIMARY KEY (ID)
);
# This table would have the following record:
/*
ID  NAME  AGE ADDRESS
100 Sachin 36 Lower West Side
*/
# ORDERS table:
CREATE TABLE ORDERS (
  ID          INT NOT NULL,
  CUSTOMER_ID INT NOT NULL REFERENCES CUSTOMERS (ID),
  ORDERS      VARCHAR(155),
  PRIMARY KEY (ID)
);
# This table would have the following records:

/*
ID CUSTOMER_ID  ORDERS
10 100          Cannon XL-200
11 100          Battery XL-200
12 100          Tripod Large
*/
