-- выбрать все film_id из film = 1000
SELECT film_id, title 
FROM film 
ORDER BY title;

-- выбрать все film_id из inventory приджойнить из film, искл повторы = 958
SELECT DISTINCT inventory.film_id, title 
FROM inventory
INNER JOIN film ON film.film_id = inventory.film_id
ORDER BY title;

-- выбрать все film_id из film (исключенные) = 42
SELECT film_id, title 
FROM film 
EXCEPT
 SELECT
 DISTINCT inventory.film_id, title
 FROM inventory
 INNER JOIN film ON film.film_id = inventory.film_id
ORDER BY title;