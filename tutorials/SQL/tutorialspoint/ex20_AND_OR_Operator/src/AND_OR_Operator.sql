/*
The AND operator allows the existence of multiple conditions in an SQL statement's WHERE clause.
The basic syntax of AND operator with WHERE clause is as follows:

SELECT column1, column2, columnN
FROM table_name
WHERE [condition1] AND [condition2]...AND [conditionN];

You can combine N number of conditions using AND operator.
For an action to be taken by the SQL statement, whether it be a transaction
or query, all conditions separated by the AND must be TRUE.

 */

SELECT ID, NAME, SALARY
FROM customers
WHERE SALARY > 2000 AND AGE < 25;


/*
The OR operator is used to combine multiple conditions in an SQL statement's WHERE clause.
The basic syntax of OR operator with WHERE clause is as follows:

SELECT column1, column2, columnN
FROM table_name
WHERE [condition1] OR [condition2]...OR [conditionN]
*/
SELECT id, name, salary
FROM customers
WHERE salary > 2000 OR age < 25;
