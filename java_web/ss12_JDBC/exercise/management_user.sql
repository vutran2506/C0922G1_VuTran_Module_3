create database if not exists management_user;
use management_user;
create table users (
id int primary key,
name varchar(30) not null,
email varchar(30) not null,
country varchar(30)
);
insert into users(id,name,email,country)
values(1,"vũ","vu@gmail.com","Viet Nam"),
(2,"hậu","hau@gmail.com","Laos");

select*from usersusers
;
select*from users having id =1;
