-- вывести все автомобили с ручной коробкой передач
select * from Car where transmission_id=1

--вывести случайную запись из таблицы Car
select * from Car order by RANDOM() limit 0,1

--сгруппировать продавцов по году рождения (без месяца и дня) и для каждого года вывести количество людей
select
strftime('%Y',birthday) as birthyear,
count(id) as seller_count
from Seller
group by birthyear


-- вывести возраст всех продавцов (необходимо посчитать возраст до сегодняшнего дня)

select 
birthday,
fio,
case when strftime('%j',birthday) - strftime('%j',date('now'))<0
then
(strftime('%Y','now') - strftime('%Y', birthday))
else
(strftime('%Y','now') - strftime('%Y', birthday)) - 1
end as years 
from seller