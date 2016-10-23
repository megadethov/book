-- вывести данные (поля) по всем автомобилям (из обеих таблиц Car и Transport), чтобы вместо id значений из справочников выводились наименования на русском

select 

c.id,
(select name_ru from [spr_CarType] crt where c.[car_type_id] = crt.id)  as "Тип автомобиля",
(select name_ru from [spr_Model] m where c.[model_id] = m.id)  as "Модель",
(select name_ru from [spr_Transmission] tr where c.[transmission_id] = tr.id)  as "Коробка передач",
(select name_ru from [spr_Privod] p where c.[privod_id] = p.id)  as "Привод",
c.[capacity] as "Объем двигателя",
(select name_ru from [spr_Brand] br where tsprt.[brand_id] = br.id)  as "Бренд",
tsprt.[price]  as "Цена",
tsprt.[issue_date] as "Дата выпуска",
(select name_ru from [spr_Currency] curr where tsprt.[currency_id] = curr.id)  as "Валюта",

(select name_ru from [spr_Condition] cond where tsprt.[condition_id] = cond.id)  as "Состояние",

(select name_ru from [spr_Color] col where tsprt.[color_id] = col.id)  as "Цвет",

tsprt.[description] as "Описание"

from Car c, Transport tsprt

where c.[transport_id]=tsprt.[id]




-- первый пункт, но только для проданных автомобилей

select 

c.id,
(select name_ru from [spr_CarType] crt where c.[car_type_id] = crt.id)  as "Тип автомобиля",
(select name_ru from [spr_Model] m where c.[model_id] = m.id)  as "Модель",
(select name_ru from [spr_Transmission] tr where c.[transmission_id] = tr.id)  as "Коробка передач",
(select name_ru from [spr_Privod] p where c.[privod_id] = p.id)  as "Привод",
c.[capacity] as "Объем двигателя",
(select name_ru from [spr_Brand] br where tsprt.[brand_id] = br.id)  as "Бренд",
tsprt.[price]  as "Цена",
tsprt.[issue_date] as "Дата выпуска",
(select name_ru from [spr_Currency] curr where tsprt.[currency_id] = curr.id)  as "Валюта",

(select name_ru from [spr_Condition] cond where tsprt.[condition_id] = cond.id)  as "Состояние",

(select name_ru from [spr_Color] col where tsprt.[color_id] = col.id)  as "Цвет",

tsprt.[description] as "Описание"

from Car c, Transport tsprt

where c.[transport_id]=tsprt.[id]

and tsprt.[id] in (select transport_id from Sale)





-- первый пункт, но только для марки Toyota, цена которых меньше 3000 $  (учитывать валюту)

select 

c.id,
(select name_ru from [spr_CarType] crt where c.[car_type_id] = crt.id)  as "Тип автомобиля",
(select name_ru from [spr_Model] m where c.[model_id] = m.id)  as "Модель",
(select name_ru from [spr_Transmission] tr where c.[transmission_id] = tr.id)  as "Коробка передач",
(select name_ru from [spr_Privod] p where c.[privod_id] = p.id)  as "Привод",
c.[capacity] as "Объем двигателя",
(select name_ru from [spr_Brand] br where tsprt.[brand_id] = br.id)  as "Бренд",
tsprt.[price]  as "Цена",
tsprt.[issue_date] as "Дата выпуска",
(select name_ru from [spr_Currency] curr where tsprt.[currency_id] = curr.id)  as "Валюта",

(select name_ru from [spr_Condition] cond where tsprt.[condition_id] = cond.id)  as "Состояние",

(select name_ru from [spr_Color] col where tsprt.[color_id] = col.id)  as "Цвет",

tsprt.[description] as "Описание"

from Car c, Transport tsprt

where c.[transport_id]=tsprt.[id]

and tsprt.[brand_id]=1 and tsprt.[price]<3000 and tsprt.[currency_id]=2



-- по каждому продавцу вывести кол-во проданных им автомобилей

select

seller.[id],
seller.[fio],

(select count(id) from Sale where seller.id=sale.seller_id) as sale_count

from Seller


group by seller.[fio], seller.[id]

having sale_count>0



-- вывести суммарную выручку по продажам автомобилей за январь 2011 г

select 

sum(t.[price]) as "Выручка"

from Transport t


where  

t.[id] in (select transport_id from Sale s where strftime('%Y', s.[sale_date])='2011' and  strftime('%m', s.[sale_date])='01')



-- получить всех продавцов, которые продали хотя бы одну подержанную машину

select 

s.[fio] as "ФИО"

from Seller s

where s.[id] in (select seller_id from Sale where [transport_id] in (select id from [Transport] where [condition_id]=2))



-- получить всех продавцов, которые не продали ни одной машины, вывести в алфавитном порядке по ФИО

select 

s.[fio] as "ФИО"

from Seller s

where s.[id] not in (select seller_id from Sale)

order by "ФИО"


-- получить по каждому продавцу количество проданных им машин марки Toyota, где цена >= 1000 $

select

seller.[id],
seller.[fio] as "ФИО",
count(seller.[fio]) as "Количество продаж"

from Seller 

where Seller.id in (select seller_id from Sale where [transport_id] in 
(select id from [Transport] t where t.[price]>=1000 and t.[currency_id]=2 and t.[brand_id]=1))

group by seller.[fio], seller.[id]

order by seller.[fio]



// удаление всех автомобилей Тойота и БМВ

delete from car where car.[transport_id] 

in (select id from [Transport] where [brand_id] 
in (select id from spr_Brand where name_ru='Тойота' or name_ru='БМВ'))