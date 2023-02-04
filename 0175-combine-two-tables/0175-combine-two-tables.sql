# Write your MySQL query statement below
SELECT Person.firstName, person.lastName,address.city,Address.state
FROM Person
Left JOIN Address
ON Person.PersonId = Address.personId