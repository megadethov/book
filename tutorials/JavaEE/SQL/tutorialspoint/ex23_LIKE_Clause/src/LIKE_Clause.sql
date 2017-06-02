/*
The percent sign represents zero, one, or multiple characters. The underscore represents a single number or character.
The symbols can be used in combinations.
The basic syntax of % and _ is as follows:

SELECT FROM table_name
WHERE column LIKE 'XXXX%'
or
SELECT FROM table_name
WHERE column LIKE '%XXXX%'
or
SELECT FROM table_name
WHERE column LIKE 'XXXX_'
or
SELECT FROM table_name
WHERE column LIKE '_XXXX'
or
SELECT FROM table_name
WHERE column LIKE '_XXXX_'

You can combine N number of conditions using AND or OR operators. Here, XXXX could be any numeric or string value.

WHERE SALARY LIKE '200%' Finds any values that start with 200
WHERE SALARY LIKE '%200%' Finds any values that have 200 in any position
WHERE SALARY LIKE '_00%' Finds any values that have 00 in the second and third positions
WHERE SALARY LIKE '2_%_%' Finds any values that start with 2 and are at least 3 characters in length
WHERE SALARY LIKE '%2' Finds any values that end with 2
WHERE SALARY LIKE '_2%3' Finds any values that have a 2 in the second position and end with a 3
WHERE SALARY LIKE '2___3' Finds any values in a five-digit number that start with 2 and end with 3

 */
SELECT * FROM customers
WHERE salary LIKE '200%';