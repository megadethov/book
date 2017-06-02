/*
There are two basic syntax of INSERT INTO statement as follows:
INSERT INTO TABLE_NAME (column1, column2, column3,...columnN)

VALUES (value1, value2, value3,...valueN);

You may not need to specify the column(s) name in the SQL query if you are adding values
for all the columns of the table. But make sure the order of the values is in the
same order as the columns in the table. The SQL INSERT INTO syntax would be as follows:

INSERT INTO TABLE_NAME VALUES (value1,value2,value3,...valueN);
 */
INSERT INTO customers (ID,NAME,AGE,ADDRESS,SALARY)
    VALUES (1, 'Ramesh', 32, 'Ahmedabad', 2000.00);

INSERT INTO CUSTOMERS (ID,NAME,AGE,ADDRESS,SALARY)
VALUES (2, 'Khilan', 25, 'Delhi', 1500.00 );

INSERT INTO CUSTOMERS (ID,NAME,AGE,ADDRESS,SALARY)
VALUES (3, 'kaushik', 23, 'Kota', 2000.00 );

INSERT INTO CUSTOMERS (ID,NAME,AGE,ADDRESS,SALARY)
VALUES (4, 'Chaitali', 25, 'Mumbai', 6500.00 );

INSERT INTO CUSTOMERS (ID,NAME,AGE,ADDRESS,SALARY)
VALUES (5, 'Hardik', 27, 'Bhopal', 8500.00 );


INSERT INTO CUSTOMERS (ID,NAME,AGE,ADDRESS,SALARY)
VALUES (6, 'Komal', 22, 'MP', 4500.00 );

# You can create a record in CUSTOMERS table using second syntax as follows:
INSERT INTO customers
    VALUES (7, 'Muffy', 24, 'Indore', 10000.00);

/*
You can populate data into a table through select statement over
another table provided another table has a set of fields, which
are required to populate first table. Here is the syntax:

INSERT INTO first_table_name [(column1, column2, ... columnN)]
SELECT column1, column2, ... columnN
FROM second_table_name
[WHERE condition];

 */
