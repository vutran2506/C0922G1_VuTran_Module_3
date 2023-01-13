create database if not exists quan_ly;
use quan_ly;

create table table_heo(
id int auto_increment primary key,
ngay_nhap_chuong date ,
trong_luong_nhap_chuong double,
ngay_xuat_chuong varchar(50),
trong_luong_xuat_chuong double,
id_xuat_xu int,
foreign key (id_xuat_xu) references xuat_xu(id_xuat_xu ) 
);

insert into table_heo (id,ngay_nhap_chuong,trong_luong_nhap_chuong,ngay_xuat_chuong,trong_luong_xuat_chuong,id_xuat_xu)
values
(1,"2020/12/12",10,"null",10,1),
(2,"2020/12/12",10,"2021/06/20",10,2),
(3,"2020/12/12",10,"null",10,3);


create table xuat_xu(
id_xuat_xu int primary key,
name_xuat_xu varchar(50)
);

insert into xuat_xu (id_xuat_xu,name_xuat_xu)
values
(1,"Việt Nam"),
(2,"Mỹ"),
(3,"Úc");

select t.*,x.name_xuat_xu from table_heo t 
join xuat_xu x on t.id_xuat_xu = x.id_xuat_xu;