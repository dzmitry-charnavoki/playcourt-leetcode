-- Write your MySQL query statement below
SELECT e.name as Employee from EMPLOYEE e  left join EMPLOYEE m on e.MANAGERID = m.ID
where e.SALARY > m.SALARY
