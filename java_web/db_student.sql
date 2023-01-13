create database if not exists student_C09;
use student_C09;
create table student(
id int auto_increment primary key ,
name varchar(50),
gender boolean,
point int,
class_id int,
foreign key (class_id) references clazz(class_id)
);
create table clazz(
class_id int auto_increment primary key ,
class_name varchar(50)
);
insert into clazz(class_id,class_name)
values(1,"C0922G1"),
(2,"C0822G1");

select* from clazz;

select s.*, c.class_name from student s join clazz c on s.class_id = c.class_id where id = 3;

select s.*,c.class_name FROM student s join clazz c on s.class_id=c.class_id;


insert into student(name,gender,point,class_id)
values
("Trần Ngọc Vũ",true,8,1),
("Trần Ngọc Bảo",true,8,1),
("Trần Ngọc Hải",true,7,2);
select*from student;
select*from student where id =1;
update student set name = "acb", gender = false, point = 5,class_id =2 where id = 1;
delete from student where id =1;
