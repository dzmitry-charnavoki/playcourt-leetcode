-- Write your MySQL query statement below
-- SELECT w2.id
-- from Weather w1
--          JOIN Weather w2
--               ON w2.temperature > w1.temperature
--                   AND datediff(w2.recordDate, w1.recordDate) = 1;

select W2.id as Id
from Weather W1,Weather W2
where W1.recordDate = W2.recordDate - interval '1' day and W1.temperature < W2.temperature