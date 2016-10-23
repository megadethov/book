-- Получить только те автомобили, к-ые были проданы
--SELECT 
--*
--FROM Car WHERE transport_id IN (SELECT transport_id FROM Sale);

-- Получить автомобили марки Golf
--SELECT 
--*
--FROM Car WHERE model_id IN (SELECT id FROM spr_Model WHERE name_en = 'Golf');

-- Вложенный SELECT (может возвращать только одно значение) - альтернатива INNER JOIN
--SELECT
--price,
----currency_id
--(SELECT name_ru FROM spr_Currency WHERE id = Transport.[currency_id]) AS 'валюта',   -- обязательно замкнуть ключи таблиц
----brand_id
--(SELECT name_en FROM spr_Brand WHERE id = Transport.[brand_id]) AS 'бренд'           -- обязательно замкнуть ключи таблиц
--FROM Transport;

-- SELECT FROM несколько таблиц (2)
--SELECT 
--s.[transport_id],
--t.[price]
--FROM Transport t, Sale s WHERE t.[id] = s.[transport_id];  -- обязательно замкнуть ключи таблиц

-- SELECT FROM несколько таблиц (3 
SELECT 
s.[transport_id],
t.[price],
spr_Brand.[name_en]
FROM Transport t, Sale s, spr_Brand WHERE t.[id] = s.[transport_id] AND spr_Brand.[id] = t.[brand_id];                                     -- the same
--FROM Transport t, (SELECT * FROM Sale WHERE id = 3) AS s, spr_Brand WHERE t.[id] = s.[transport_id] AND spr_Brand.[id] = t.[brand_id];   -- the same


