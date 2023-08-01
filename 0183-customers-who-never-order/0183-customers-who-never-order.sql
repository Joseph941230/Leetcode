# Write your MySQL query statement below


SELECT c.name as Customers
FROM Customers c Left JOIN Orders o On c.id = o.customerId
where o.customerId is null