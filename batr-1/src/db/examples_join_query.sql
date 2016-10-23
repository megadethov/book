-- вывести данные (поля) по всем автомобилям (из обеих таблиц Car и Transport), чтобы вместо id значений из справочников выводились наименования на русском
SELECT

Transport.[issue_date] AS дата_выпуска,
Transport.[price] AS цена,
spr_Brand.[name_en] AS бренд,
spr_Color.[name_ru] AS цвет,
spr_Condition.[name_ru] AS состояние,
spr_Currency.[shortname_ru] AS валюта,
spr_CarType.[name_ru] AS тип_машины,
spr_Model.[name_ru] AS модель,
spr_Transmission.[name_ru] AS коробка,
spr_Privod.[name_ru] AS привод,
Car.[capacity] AS объем_двигателя

FROM Car INNER JOIN Transport ON Car.[transport_id] = [Transport].[id]
         INNER JOIN spr_Brand ON Transport.[brand_id] = spr_Brand.[id]         
         INNER JOIN spr_Color ON Transport.[color_id] = spr_Color.[id] 
         INNER JOIN spr_Condition ON Transport.[condition_id] = spr_Condition.[id]         
         INNER JOIN spr_Currency ON Transport.[currency_id] = spr_Currency.[id]         
         INNER JOIN spr_CarType ON Car.[car_type_id] = spr_CarType.[id]         
         INNER JOIN spr_Model ON Car.[model_id] = spr_Model.[id]         
         INNER JOIN spr_Transmission ON Car.[transmission_id] = spr_Transmission.[id]         
         INNER JOIN spr_Privod ON Car.[privod_id] = spr_Privod.[id]         
ORDER BY Transport.[price] DESC;

-- вывести данные (поля) по всем автомобилям (из обеих таблиц Car и Transport), чтобы вместо id значений из справочников выводились наименования на русском
-- НО только для проданных авто
SELECT

Transport.[issue_date] AS дата_выпуска,
Transport.[price] AS цена,
spr_Brand.[name_en] AS бренд,
spr_Color.[name_ru] AS цвет,
spr_Condition.[name_ru] AS состояние,
spr_Currency.[shortname_ru] AS валюта,
spr_CarType.[name_ru] AS тип_машины,
spr_Model.[name_ru] AS модель,
spr_Transmission.[name_ru] AS коробка,
spr_Privod.[name_ru] AS привод,
Car.[capacity] AS объем_двигателя

FROM Car INNER JOIN Transport ON Car.[transport_id] = [Transport].[id]
         INNER JOIN spr_Brand ON Transport.[brand_id] = spr_Brand.[id]         
         INNER JOIN spr_Color ON Transport.[color_id] = spr_Color.[id] 
         INNER JOIN spr_Condition ON Transport.[condition_id] = spr_Condition.[id]         
         INNER JOIN spr_Currency ON Transport.[currency_id] = spr_Currency.[id]         
         INNER JOIN spr_CarType ON Car.[car_type_id] = spr_CarType.[id]         
         INNER JOIN spr_Model ON Car.[model_id] = spr_Model.[id]         
         INNER JOIN spr_Transmission ON Car.[transmission_id] = spr_Transmission.[id]         
         INNER JOIN spr_Privod ON Car.[privod_id] = spr_Privod.[id]    
         INNER JOIN Sale ON Sale.[transport_id] = Transport.[id]     
ORDER BY Transport.[price] DESC;

-- первый пункт, но только для марки Toyota, цена которых меньше 3000 $  (учитывать валюту)
SELECT

DISTINCT Car.[id],                                  -- обеспечить уникальность проданных авто
Transport.[issue_date] AS дата_выпуска,
Transport.[price] AS цена,
spr_Brand.[name_en] AS бренд,
spr_Color.[name_ru] AS цвет,
spr_Condition.[name_ru] AS состояние,
spr_Currency.[shortname_ru] AS валюта,
spr_CarType.[name_ru] AS тип_машины,
spr_Model.[name_ru] AS модель,
spr_Transmission.[name_ru] AS коробка,
spr_Privod.[name_ru] AS привод,
Car.[capacity] AS объем_двигателя

FROM Car INNER JOIN Transport ON Car.[transport_id] = [Transport].[id]
         INNER JOIN spr_Brand ON Transport.[brand_id] = spr_Brand.[id]         
         INNER JOIN spr_Color ON Transport.[color_id] = spr_Color.[id] 
         INNER JOIN spr_Condition ON Transport.[condition_id] = spr_Condition.[id]         
         INNER JOIN spr_Currency ON Transport.[currency_id] = spr_Currency.[id]         
         INNER JOIN spr_CarType ON Car.[car_type_id] = spr_CarType.[id]         
         INNER JOIN spr_Model ON Car.[model_id] = spr_Model.[id]         
         INNER JOIN spr_Transmission ON Car.[transmission_id] = spr_Transmission.[id]         
         INNER JOIN spr_Privod ON Car.[privod_id] = spr_Privod.[id]    
         INNER JOIN Sale ON Sale.[transport_id] = Transport.[id] 
                      
WHERE spr_Brand.[name_en] = 'Toyota' AND Transport.[price] < 3000 AND Transport.[currency_id] = 1

ORDER BY Transport.[price] DESC;

-- по каждому продавцу вывести кол-во проданных им автомобилей
SELECT
Seller.id, 
Seller.fio AS ФИО_продавца,
COUNT(Seller.fio) AS колличество_продаж                         -- выводит одну строку с колличеством


FROM Seller INNER JOIN Sale ON Seller.[id] = Sale.[seller_id]
GROUP BY Seller.fio, Seller.id                                  -- без этой строчки COUNT(Seller.fio) - склеивает таблицу в 1 строку
ORDER BY Seller.fio 

-- вывести суммарную выручку по продажам автомобилей за январь 2011 г
SELECT 

SUM(Transport.[price]) AS выручка

FROM Sale INNER JOIN Transport ON Sale.transport_id = Transport.[id]
WHERE  STRFTIME('%Y', Sale.[sale_date])='2011'
AND  STRFTIME('%m', Sale.[sale_date])='01'

-- получить всех продавцов, которые продали хотя бы одну подержанную машину
SELECT
Seller.[fio]
FROM Seller INNER JOIN Sale ON Sale.[seller_id] = Seller.[id]
            INNER JOIN Transport ON Sale.[transport_id] = Transport.id
WHERE Transport.[condition_id] = 2;

-- получить всех продавцов, которые не продали ни одной машины, вывести в алфавитном порядке по ФИО
SELECT
Seller.fio
FROM Seller LEFT JOIN Sale ON Sale.[seller_id] = Seller.[id]
WHERE Sale.[transport_id] IS NULL
ORDER BY Seller.[fio]

-- получить по каждому продавцу количество проданных им машин марки Toyota, где цена >= 1000 $
SELECT
Transport.[price],
Seller.[fio],
COUNT(Sale.[transport_id])
FROM Seller INNER JOIN Sale ON Sale.[seller_id] = Seller.[id]
            INNER JOIN Transport ON Sale.transport_id = Transport.[id]

--WHERE Transport.[brand_id] = 1 AND Transport.price >= 1000 AND Transport.[currency_id] = 2  -- можно заменить HAVING
GROUP BY Seller.fio
HAVING Transport.[brand_id] = 1 AND Transport.price >= 1000 AND Transport.[currency_id] = 2
               
               
