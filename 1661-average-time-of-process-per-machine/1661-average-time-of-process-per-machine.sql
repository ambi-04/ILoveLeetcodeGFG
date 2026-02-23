-- Write your PostgreSQL query statement below
select x.machine_id, ROUND(avg(y.timestamp - x.timestamp)::numeric,3) as processing_time
from
activity x inner join activity y 
on x.machine_id = y.machine_id and x.process_id = y.process_id 
and x.activity_type = 'start' and y.activity_type = 'end'
group by x.machine_id;