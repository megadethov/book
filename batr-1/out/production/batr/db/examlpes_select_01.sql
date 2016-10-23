-- вывести все автомобили с ручной коробкой передач
--SELECT * FROM Car WHERE transmission_id=1;

--вывести случайную запись из таблицы Car
--SELECT * FROM Car ORDER BY RANDOM() LIMIT 0,1;

--сгруппировать продавцов по году рождения (без месяца и дня) и для каждого года вывести количество людей
--SELECT STRFTIME('%Y', birthday) AS birthyear, COUNT(id) AS seller_count FROM Seller GROUP BY birthyear;

-- вывести возраст всех продавцов (необходимо посчитать возраст до сегодняшнего дня)
SELECT birthday, fio, CASE WHEN STRFTIME('%j', birthday) - STRFTIME('%j',DATE ('now')) < 0
THEN (STRFTIME('%Y','now') - STRFTIME('%Y', birthday))
ELSE (strftime('%Y','now') - strftime('%Y', birthday)) - 1 END AS years FROM seller;




