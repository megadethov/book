/*
The INNER JOIN creates a new result table by combining column values of two tables (table1 and table2) based upon the join-predicate.
 The basic syntax of INNER JOIN is as follows:

SELECT table1.column1, table2.column2...
FROM * table1
INNER JOIN table2
ON table1.common_field = table2.common_field;
*/

SELECT id, name, amount, date
FROM customers INNER JOIN orders
ON customers.id = orders.customer_id;

