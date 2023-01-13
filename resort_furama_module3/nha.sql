create database if not exists quan_ly_nha;
use quan_ly_nha;

create table trang_thai(
trang_thai_id int primary key,
trang_thai varchar(50)
);

insert into trang_thai (trang_thai_id,trang_thai)
values
(1,"Trống"),
(2,"hạ tầng"),
(3,"đầy đủ");

select * from trang_thai;

create table loai_phong(
loai_phong_id int primary key,
loai_phong varchar(50)
);

insert into loai_phong (loai_phong_id,loai_phong)
values
(1,"Hạng sang"),
(2,"Tầm trung"),
(3,"Bình thường");

select * from loai_phong;

create table nha(
ma_so int auto_increment primary key,
ten varchar(50),
dien_tich double,
so_tang int ,
ngay_bat_dau date,
ngay_ket_thuc date,
gia double,
trang_thai_id int,
loai_phong_id int,
foreign key (loai_phong_id) references  loai_phong(loai_phong_id) on delete set null,
foreign key (trang_thai_id) references  trang_thai(trang_thai_id) on delete set null
);
insert into nha(ma_so,ten,dien_tich,so_tang,ngay_bat_dau,ngay_ket_thuc,gia,trang_thai_id,loai_phong_id)
values
(1,"bt_04", 30,3,"2020/12/12","2020/12/15",100,1,1),
(2,"bt_05", 30,5,"2020/12/12","2020/12/15",200,2,2),
(3,"bt_06", 30,4,"2020/12/12","2020/12/15",300,3,3),
(4,"bt_07", 30,1,"2020/12/12","2020/12/15",400,3,1);
select*from nha;
select*from nha where ma_so =3;

select n.* ,l.loai_phong ,t.trang_thai from nha n 
join loai_phong l on n.loai_phong_id = l.loai_phong_id
join  trang_thai t on n.trang_thai_id = t.trang_thai_id;

select n.* ,l.loai_phong ,t.trang_thai from nha n 
join loai_phong l on n.loai_phong_id = l.loai_phong_id
join  trang_thai t on n.trang_thai_id = t.trang_thai_id
where ten like "%b%" and n.loai_phong_id = 1 and n.trang_thai_id = 1;
