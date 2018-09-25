--версия PostgreSQL
--select version(); 

--создание новой таблицы
create table weather (
city varchar(80),
temp_lo int,
temp_hi int,
prcp real,
date date
);