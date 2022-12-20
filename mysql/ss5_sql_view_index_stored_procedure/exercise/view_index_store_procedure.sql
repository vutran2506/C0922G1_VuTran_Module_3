create
database if not exists demo_ss5;
use
demo_ss5;

create table products
(
    Id                 int auto_increment primary key,
    productCode        varchar(30),
    productName        varchar(30),
    productPrice       double,
    productAmount      int,
    productDescription varchar(40),
    productStatus      varchar(30)
);

insert into products(productCode, productName, productPrice, productAmount, productDescription, productStatus)
values ('ip11', 'iphone_11', 1000, 20, 'xanh', '99%'),
       ('ip14', 'iphone_14', 2500, 25, 'đỏ', '100%'),
       ('ip12', 'iphone_12', 1500, 30, 'đen', '99%'),
       ('ip13', 'iphone_13', 1200, 20, 'xanh', '100%'),
       ('ipX', 'iphone_X', 1500, 15, 'tím', '95%'),
       ('ip8', 'iphone_8', 800, 3, 'trắng', '90%'),
       ('ip14', 'iphone_14', 2500, 25, 'vàng', '100%'),
       ('s21', 'samsung s21', 2000, 5, 'hồng', '100%'),
       ('s21u', 'samsung s21 Utra', 2100, 10, 'đen', '100%'),
       ('s22', 'samsung s22', 2500, 3, 'hồng', '100%'),
       ('mi11', 'xioami 11', 900, 2, 'hồng', '100%'),
       ('ip14', 'iphone_14', 2500, 25, 'xanh', '100%'),
       ('mi12', 'xioami 12', 1000, 8, 'đen', '100%'),
       ('op6', 'oppo z9', 6000, 2, 'hồng', '100%');
-- Bước 3
-- Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)

create index index_productCode on products (productCode);

-- Tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice)
create index index_productName_and_productPrice on products (productName, productPrice);

-- Sử dụng câu lệnh EXPLAIN để biết được câu lệnh SQL của bạn thực thi như nào

explain
select *
from products
where productCode = 'ip12';

-- So sánh câu truy vấn trước và sau khi tạo index
-- Câu truy vấn sau khi tạo index.
explain
select *
from products
where productCode = 'ip12';

drop index index_productCode on products;

-- Câu truy vấn trước khi tạo index.
explain
select *
from products
where productCode = 'ip12';

-- Bước 4:
-- Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products

create view view_product as
select productCode, productName, productPrice, productStatus
from products;
select *
from view_product;

-- Tiến hành sửa đổi view.
set
sql_safe_updates = 0;
update view_product
set productCode   = 'ip15',
    productName   = 'iphone15',
    productPrice  = 3000,
    productStatus = '100%'
where productCode = 'ip12';
set
sql_safe_updates = 1;
select *
from view_product;

-- Tiến hành xoá view.
drop view view_product;

-- Bước 5
-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product

delimiter //
create procedure get_all_products()
begin
select *
from products;
end //
   delimiter ;
call get_all_products ();

-- Tạo store procedure thêm một sản phẩm mới

delimiter //
create procedure
    add_product(In productCode varchar (30), productName varchar (30), productPrice double, productAmount int,
                productDescription varchar (30), productStatus varchar (30))
begin
insert into products(productCode, productName, productPrice, productAmount, productDescription, productStatus)
values (productCode, productName, productPrice, productAmount, productDescription, productStatus);
end //
delimiter ;
call add_product('ip16','iphone_16',3500,50,'safia','100%');
call get_all_products ();

-- Tạo store procedure sửa thông tin sản phẩm theo id.

delimiter //
create procedure
    edit_product(new_id int, new_productCode varchar (30), new_productName varchar (30), new_productPrice double,
                 new_productAmount int,
                 new_productDescription varchar (30), new_productStatus varchar (30))
begin
update products
set id                 = new_id,
    productCode        = new_productCode,
    productName        = new_productName,
    productPrice       = new_productPrice,
    productAmount      = new_productAmount,
    productDescription = new_productDescription,
    productStatus      = new_productStatus
where id = new_id;
end //
delimiter    ;
call edit_product (3,'ss23','samsung s23' , 2500,50,'hồng','100%');
call get_all_products ();

-- Tạo store procedure xoá sản phẩm theo id

delimiter //
create procedure delete_id(IN id_delete int)
begin
delete
from products
where id = id_delete;
end //
delimiter ;
call delete_id (3);
call get_all_products ();



