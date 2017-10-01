/*
The SQL ORDER BY clause is used to sort the data in ascending or descending order, based on one or more columns. Some database sorts query results in ascending order by default.
The basic syntax of ORDER BY clause is as follows:

SELECT column-list
FROM table_name
[WHERE condition]
[ORDER BY column1, column2, .. columnN] [ASC | DESC];

You can use more than one column in the ORDER BY clause. Make sure whatever column you are using to sort, that column should be in column-list.

 */

# Following is an example, which would sort the result in ascending order by NAME and SALARY:
SELECT * FROM customers
ORDER BY name, salary;

# Following is an example, which would sort the result in descending order by NAME:
SELECT * FROM customers
ORDER BY name, salary DESC;