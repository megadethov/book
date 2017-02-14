/*
The basic syntax of SELECT statement with WHERE clause is as follows:

SELECT column1, column2, columnN
FROM table_name
WHERE [condition]

You can specify a condition using comparison or logical operators like >, <, =, LIKE, NOT, etc.
Below examples would make this concept clear.

Following is an example which would fetch ID, Name and Salary fields from the CUSTOMERS table
where salary is greater than 2000:
 */

SELECT ID, NAME, SALARY
FROM customers
WHERE SALARY > 2000;

/*
Following is an example which would fetch ID, Name and Salary fields from the CUSTOMERS table
where salary is greater than 2000:
 */
SELECT ID, NAME, SALARY
FROM customers
WHERE NAME = 'Hardik';