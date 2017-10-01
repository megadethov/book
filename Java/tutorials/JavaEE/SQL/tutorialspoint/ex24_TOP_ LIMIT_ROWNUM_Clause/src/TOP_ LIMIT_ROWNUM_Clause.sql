/*
The SQL TOP clause is used to fetch a TOP N number or X percent records from a table.
Note: All the databases do not support TOP clause. For example MySQL supports LIMIT clause to fetch limited number of records and Oracle uses ROWNUM to fetch limited number of records.
The basic syntax of TOP clause with SELECT statement would be as follows:

SELECT TOP number|percent column_name(s)
FROM table_name
WHERE [condition]
 */

# Following is an example on SQL server, which would fetch top 3 records from CUSTOMERS table:
SELECT TOP 3 * FROM customers;

# If you are using MySQL server, then here is an equivalent example:
SELECT * FROM customers LIMIT 3;

# If you are using Oracle server, then here is an equivalent example:
SELECT * FROM CUSTOMERS
WHERE ROWNUM <= 3;

