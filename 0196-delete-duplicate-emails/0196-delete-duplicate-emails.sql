# Write your MySQL query statement below

DELETE p
FROM Person AS p
INNER JOIN Person AS q
    ON p.email= q.email
WHERE p.id>q.id;