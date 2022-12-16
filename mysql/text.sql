create database c0922g1;
use c0922g1;

create table class(
class_id int  primary key,
class_name varchar(30)
);
 select* from class;
 
create table student(
id int  primary key ,
name varchar(25),
birthday varchar(30),
username varchar(25) ,
point double,
class_id int,
foreign key(class_id) references class(class_id)
);

select * from student;
 insert into class(class_id, class_name)
 values
 (1 ,'c1121g1'),
 (2,'c121g1'),
 (3,'c0821g1'),
 (4,'c0821j1');
 
INSERT INTO student (id,`name`,birthday,username,point, class_id)
VALUES
(1, 'nguyen ngoc vu', '2000-10-20', 'vunn', 8,2 ),
(2,' bui duc a ' ,'1990-10-20','vubd',9,1),
(3,' bui duc b' ,'1990-10-20','d',4,2),
(4,' bui duc c' ,'1990-10-20','vub',7,1),
(5,' bui duc d' ,'1990-10-20','bd',5,2),
(7,' bui duc ag ' ,'1990-10-20','vd',9,null),
(8,' bui duc ah ' ,'1990-10-20','vubd1',9,null);
    
    -- Lấy thông tin học sinh có lớp học
    select s.*,c.class_name from student s inner join class c on s.class_id = c.class_id;
    
    
    -- Lây thông tin học sinh
    select s.*, ifnull(c.class_name,"chưa có lớp") from student s left join class c on s.class _id = c.class_id;
    
    
