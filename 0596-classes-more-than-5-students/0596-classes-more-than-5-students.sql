# Write your MySQL query statement below

SELECT class
FROM(
SELECT COUNT(student) AS t,class
FROM Courses
group by class) AS d

WHERE d.t >=5
