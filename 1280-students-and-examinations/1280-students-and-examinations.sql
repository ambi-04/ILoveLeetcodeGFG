-- Write your PostgreSQL query statement below
select st.student_id,st.student_name,sb.subject_name, count(case when e.student_id is not null then 1 end) as attended_exams
from
students st cross join subjects sb left join examinations e on st.student_id = e.student_id and sb.subject_name = e.subject_name
group by st.student_id , st.student_name,sb.subject_name