# Write your MySQL query statement below

SELECT a.name as Employee
FROM Employee as a JOIN Employee b ON a.managerId = b.id
Where a.salary > b.salary