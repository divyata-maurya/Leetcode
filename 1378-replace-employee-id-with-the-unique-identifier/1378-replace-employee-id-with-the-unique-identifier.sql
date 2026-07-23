# Write your MySQL query statement below

SELECT 
    e_u.unique_id,
    e.name
FROM Employees AS e
LEFT JOIN EmployeeUNI AS e_u
    ON e.id= e_u.id; 