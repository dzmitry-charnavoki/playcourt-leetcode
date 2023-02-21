-- Write your MySQL query statement below (but for leetcode MS SQL Server engine was used to pass)
DELETE
FROM Person
WHERE ID NOT IN
      (SELECT MIN(ID) FROM Person GROUP BY Email)
