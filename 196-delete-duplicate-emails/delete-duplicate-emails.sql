# Write your MySQL query statement below
delete p from person p  join
person p2
on p.email = p2.email and p.Id>p2.Id;