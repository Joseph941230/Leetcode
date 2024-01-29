# Write your MySQL query statement below
SELECT employee_id
FROM EMployees
WHERE salary < 30000 and manager_id not in( SELECT employee_id FROM Employees)
order by employee_id