-- Write your PostgreSQL query statement below
select a.id 
from weather a , weather b
where a.recorddate - b.recorddate = 1
and a.temperature > b.temperature;