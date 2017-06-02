/*Second normal form states that it should meet all the rules for 1NF and there must be no partial dependences
of any of the columns on the primary key

Consider a customer-order relation and you want to store customer ID, customer name, order ID
and order detail, and date of purchase:
*/
/*This table is in first normal form, in that it obeys all the rules of first normal form.
In this table, the primary key consists of CUST_ID and ORDER_ID.
Combined, they are unique assuming same customer would hardly order same thing.
*/
CREATE TABLE CUSTOMERS(
  CUST_ID    INT              NOT NULL,
  CUST_NAME VARCHAR (20)      NOT NULL,
  ORDER_ID   INT              NOT NULL,
  ORDER_DETAIL VARCHAR (20)  NOT NULL,
  SALE_DATE  DATETIME,
  PRIMARY KEY (CUST_ID, ORDER_ID)
);
# To make this table comply with second normal form, you need to separate the columns into three tables.
# First, create a table to store the customer details as follows:
CREATE TABLE CUSTOMERS(
  CUST_ID    INT              NOT NULL,
  CUST_NAME VARCHAR (20)      NOT NULL,
  PRIMARY KEY (CUST_ID)
);


# Next, create a table to store details of each order:
CREATE TABLE ORDERS(
  ORDER_ID   INT              NOT NULL,
  ORDER_DETAIL VARCHAR (20)  NOT NULL,
  PRIMARY KEY (ORDER_ID)
);


# Finally, create a third table storing just CUST_ID and ORDER_ID to keep track of all the orders for a customer:
CREATE TABLE CUSTMERORDERS(
  CUST_ID    INT              NOT NULL,
  ORDER_ID   INT              NOT NULL,
  SALE_DATE  DATETIME,
  PRIMARY KEY (CUST_ID, ORDER_ID)
);


