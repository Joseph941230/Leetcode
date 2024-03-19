# Write your MySQL query statement below
WITH CTE AS(

    SELECT 
    d.name as Department, 
    e.name as Employee,salary, 
    RANK() OVER(
        partition by d.name
        ORDER BY salary DESC
    ) as rk 
    FROM Employee e 
    JOIN Department d on e.departmentid = d.id

)
SELECT Department,Employee,Salary
FROM CTE
WHERE rk = 1