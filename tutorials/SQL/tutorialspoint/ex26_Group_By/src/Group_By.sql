/*
The SQL GROUP BY  clause is used in collaboration with the SELECT statement to arrange identical data into groups.
The GROUP BY clause follows the WHERE clause in a SELECT statement and precedes the ORDER BY clause.
The basic syntax of GROUP BY clause is given below. The GROUP BY clause must follow the conditions
in the WHERE clause and must precede the ORDER BY clause if one is used.

SELECT column1, column2
FROM table_name
WHERE [ conditions ]
GROUP BY column1, column2
ORDER BY column1, column2

 */

# If you want to know the total amount of salary on each customer, then GROUP BY query would be as follows:
SELECT name, sum(salary) FROM customers
GROUP BY name;