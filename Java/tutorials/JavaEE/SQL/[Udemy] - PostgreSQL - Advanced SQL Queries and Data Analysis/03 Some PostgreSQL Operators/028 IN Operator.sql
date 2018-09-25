-- фильтрация по множественному значению
SELECT customer_id, rental_id, return_date
FROM rental
WHERE customer_id IN (1, 2)
ORDER BY return_date ASC;

SELECT customer_id, rental_id, return_date
FROM rental
WHERE rental_id IN (320, 76, 2128, 5636)
ORDER BY return_date DESC;