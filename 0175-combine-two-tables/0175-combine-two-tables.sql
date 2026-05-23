# Write your MySQL query statement below
select p.firstName, p.lastName, a.city, a.state
-- this shows the incorrect result because person we n
-- from Person p left join Address a  on p.personId = a.addressId; /
from Person p left join Address a  on p.personId = a.personId; 

