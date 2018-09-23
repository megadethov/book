-- в отличие от просто UNION сохраняет дубликаты
-- оба дубликата должны иметь одинаковое кол-во колонок и их тип
SELECT customer_id
FROM customer
UNION ALL
SELECT customer_id
FROM payment;
