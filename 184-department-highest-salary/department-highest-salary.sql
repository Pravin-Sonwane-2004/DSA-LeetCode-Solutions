-- # Write your MySQL query statement below
-- select d.name as Department,
-- e.name as Employee,
-- max(e.salary) as Salary
-- from Employee e
-- left join Department d
-- on e.id = d.id group by e.departmentId  
select 
    d.name as Department,
    e.name as Employee,
    e.salary as Salary
from Employee e
join Department d
    on e.departmentId = d.id
where e.salary = (
    select max(e2.salary)
    from Employee e2
    where e2.departmentId = e.departmentId
);