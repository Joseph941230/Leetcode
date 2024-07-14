# Write your MySQL query statement belows
SELECT project_id, ROUND(AVG(experience_years),2) AS average_years
FROM Project p left join Employee e
ON p.employee_id = e.employee_id
group by project_id