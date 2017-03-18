/*
The SQL UPDATE Query is used to modify the existing records in a table.
The basic syntax of UPDATE query with WHERE clause is as follows:

UPDATE table_name
SET column1 = value1, column2 = value2...., columnN = valueN
WHERE [condition];

Following is an example, which would update ADDRESS for a customer whose ID is 6:
*/
UPDATE customers
SET address = 'Pune'
WHERE id = 6;

/*
If you want to modify all ADDRESS and SALARY column values in CUSTOMERS table, you do not need to use
WHERE clause and UPDATE query would be as follows:
 */

UPDATE customers
SET address = 'Pune', salary = 1000.00;