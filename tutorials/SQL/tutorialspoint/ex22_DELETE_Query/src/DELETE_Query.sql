/*
The SQL DELETE Query is used to delete the existing records from a table.
You can use WHERE clause with DELETE query to delete selected rows,
otherwise all the records would be deleted.
The basic syntax of DELETE query with WHERE clause is as follows:

DELETE FROM table_name
WHERE [condition];

Following is an example, which would DELETE a customer, whose ID is 6:
 */
DELETE FROM customers
WHERE id = 6;

/*
If you want to DELETE all the records from CUSTOMERS table, you do not need to use WHERE clause and
DELETE query would be as follows:
 */
DELETE FROM customers;
