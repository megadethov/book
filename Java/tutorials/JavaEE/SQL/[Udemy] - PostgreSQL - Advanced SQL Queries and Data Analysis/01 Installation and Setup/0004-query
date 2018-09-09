--просмотр всех данных таблицы
SELECT * FROM weather;
SELECT * FROM cities;

--алиас для вычисляемой из двух колонок колонки
SELECT city, (temp_hi+temp_lo)/2 AS temp_avg FROM weather;

--выборка с условиями
SELECT * FROM weather WHERE city = 'San Francisco' AND prcp > 0.0;

--без повторов DISTINCT, упорядоченные по ORDER BY
SELECT DISTINCT city FROM weather ORDER BY city;
SELECT DISTINCT city FROM weather ORDER BY city DESC; --в обратном порядке
