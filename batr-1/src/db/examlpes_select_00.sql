-- Выбрать все записи из таблицы spr_Model и отобразить поля name_ru, name_en
--SELECT name_ru, name_en FROM spr_Model;

-- Выбрать все записи из таблицы Car и отобразить все поля
--SELECT * FROM Car;

-- Выбрать уникальные модели из таблицы Car
--SELECT DISTINCT(model_id) FROM Car;

-- Выбрать все записи из таблицы Transport у к-ых цена <= 5000. Отобразить все столбцы.
--SELECT * FROM Transport WHERE price <= 5000;

-- Выбрать все записи из таблицы Transport у к-ых цена <= 5000 и год выпуска > 1 янв 2010г. Отобразить все столбцы.
--SELECT * FROM Transport WHERE price <= 5000 AND issue_date >= '2010-01-01';

-- Выбрать запись из таблицы Car у к-ой id = 5 (результат 1 или 0)
--SELECT * FROM Car WHERE id = 5;

-- Выбрать все записи из таблицы Transport у к-ых цена <= 5000 и упорядочить результат по дате выпуска.
--SELECT * FROM Transport WHERE price <= 5000 ORDER BY issue_date;

-- Выбрать все записи из таблицы Transport и упорядочить результат случайным образом. Отобразить все столбцы.
--SELECT * FROM Transport ORDER BY RANDOM();

-- Выбрать все записи из таблицы Transport у к-ых цена <= 5000 и отобразить 4 записи начиная со 2.
--SELECT * FROM Transport WHERE price <= 5000 LIMIT 2,4;

-- Получить кол-во записей в таблице Transport
--SELECT COUNT(*) FROM Transport;

-- Получить максимальный объем двигателя среди всех автомобилей
--SELECT MAX(capacity) FROM Car;

-- Получить общую стоимость всех имеющихся транспортных средств
--SELECT SUM(price) FROM Transport;

-- Получить кол-во записей в таблице Transport и назвать столбец "transport_count"
--SELECT COUNT(*) AS transport_count FROM Transport;

-- Получить по каждому продавцу кол-во проданных им машин
--SELECT seller_id, COUNT(transport_id) FROM Sale GROUP BY seller_id;

-- Получить по каждому продавцу кол-во проданных им машин, группировка по продавцу, а затем для каждого из них по дате
SELECT seller_id, sale_date, COUNT(transport_id) FROM Sale GROUP BY seller_id, sale_date;





