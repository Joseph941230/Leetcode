# Write your MySQL query statement below
SELECT product_name,year,price
FROM Sales s JOIN Product p on s.product_id = p.product_id
GROUP BY sale_id
