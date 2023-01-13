create database if not exists user;
use user;
create table users(
id int auto_increment primary key,
name varchar(50),
email varchar(50),
country varchar(50)
);
insert into users(name,email,country)
values
("Trần Ngọc Vũ","vu@gmail.com","Viet Nam"),
("Nguyễn Ngọc Hậu","hau@gmail.com","Viet Nam");
select*from users;
-- Lấy thông tin
DELIMITER //

CREATE PROCEDURE selectAll()

BEGIN

  SELECT * FROM users;

END //

DELIMITER ;
call selectAll();


-- Xoá Thông tin
DELIMITER //
create procedure deleteUser(IN id_user int)
begin
delete from users where id = id_user;
end //
DELIMITER ;
call deleteUser(7);



DELIMITER //
create procedure editUser(IN user_name varchar(50),
IN email_user varchar(50),
IN country_user varchar(50),
IN id_user int
)
begin
update users 
set name = user_name,email = email_user,country= country_user where id = id_user;
end //
DELIMITER ;
call editUser("vu","vu@gmail.com","vietnam",2);

DELIMITER //
create procedure insertUser(IN user_name varchar(50),

IN user_email varchar(50),

IN user_country varchar(50))
begin
insert into users(name,email,country)
values
(user_name,user_email,user_country);
end //
DELIMITER ;
call insertUser("hau","hau@gmail.com","viet nam");

create table Permision(
id int(11) primary key,
name varchar(50)
);
create table User_Permision(
permision_id int(11),
user_id int(11)
);

insert into Permision(id, name) values(1, 'add');

insert into Permision(id, name) values(2, 'edit');

insert into Permision(id, name) values(3, 'delete');

insert into Permision(id, name) values(4, 'view');
