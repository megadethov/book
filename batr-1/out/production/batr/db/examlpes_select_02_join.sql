-- INNER JOIN
--SELECT
-- s1.[sale_date], 
-- s2.[fio],
-- s2.[birthday], 
-- s1.[transport_id], 
-- tr.[price],   
-- sBr.name_en
-- FROM Sale s1 
-- INNER JOIN Seller s2 ON s1.[seller_id] = s2.[id]              -- GROUP BY fio; 
-- INNER JOIN [Transport] tr ON s1.[transport_id] = tr.[id]  
-- INNER JOIN spr_Brand sBr ON tr.brand_id = sBr.[id]; 

-- LEFT OUTER JOIN
--SELECT
--s1.[sale_date],
--s2.[fio],
--s1.transport_id
--FROM Sale s1
--LEFT JOIN Seller s2 ON s1.seller_id = s2.[id];         -- здесь LEFT JOIN == INNER JOIN

-- LEFT OUTER JOIN (меняем местами s1, s2)
-- здесь берется вся таблица Seller, а заполняются только те селлеры, к-ые есть в таблице Sale
SELECT
s1.[sale_date],
s2.[fio],
s1.transport_id
FROM  Seller s2
LEFT JOIN Sale s1 ON s1.seller_id = s2.[id];              
-- WHERE s1.[transport_id] IS null; 
-- WHERE s1.[transport_id] IS NOT null; 
 





























