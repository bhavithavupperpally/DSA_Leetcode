# Write your MySQL query statement below
select person.firstName,person.lastname,Address.city,Address.state
from person
left join Address
on person.personId=Address.personId;