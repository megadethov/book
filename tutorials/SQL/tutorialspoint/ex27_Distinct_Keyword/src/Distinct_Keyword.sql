/*
The SQL DISTINCT keyword is used in conjunction with SELECT statement to eliminate all the duplicate records and fetching only unique records.
There may be a situation when you have multiple duplicate records in a table. While fetching such records, it makes more sense to fetch only unique records instead of fetching duplicate records.
The basic syntax of DISTINCT keyword to eliminate duplicate records is as follows:

SELECT DISTINCT column1, column2,.....columnN
FROM table_name
WHERE [condition]

 */

# First, let us see how the following SELECT query returns duplicate salary records:
SELECT salary FROM customers
ORDER BY salary;

# Now, let us use DISTINCT keyword with the above SELECT query and see the result:
SELECT DISTINCT salary FROM customers
ORDER BY salary;