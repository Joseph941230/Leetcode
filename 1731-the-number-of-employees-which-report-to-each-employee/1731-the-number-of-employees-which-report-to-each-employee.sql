# Write your MySQL query statement below

WITH CTE AS (
SELECT reports_to,COUNT(reports_to) AS reports_count,ROUND(AVG(age),0) AS average_age
FROM Employees
WHERE reports_to is not null
Group by reports_to)

SELECT c.reports_to AS employee_id,e.name,c.reports_count,c.average_age
FROM CTE c  left join Employees e
ON c.reports_to = e.employee_id
ORDER BY e.employee_id
