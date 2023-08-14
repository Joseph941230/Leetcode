# Write your MySQL query statement below
SELECT b.id as "ID"
FROM weather a JOIN weather b ON DATEDiff(a.recordDate, b.recordDate) = -1
AND b.temperature > a.temperature

