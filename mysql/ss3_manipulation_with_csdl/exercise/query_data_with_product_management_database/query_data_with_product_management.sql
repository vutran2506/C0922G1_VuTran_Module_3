create
database if not exists product_management;
use
product_management;

create table customer
(
    customer_id   int auto_increment primary key,
    customer_name varchar(30),
    customer_age  int
);

create table `order`
(
    order_id          int auto_increment primary key,
    customer_id       int,
    order_date        datetime,
    order_total_price double,
    foreign key (customer_id) references customer (customer_id)
);

create table product
(
    product_id    int auto_increment primary key,
    product_name  varchar(30),
    product_price double
);

create table order_detail
(
    order_id      int,
    product_id    int,
    order_quality varchar(30),
    foreign key (order_id) references `order` (order_id),
    foreign key (product_id) references product (product_id)
);

insert into customer(customer_name, customer_age)
values ('Minh Quan', 10),
       ('Ngoc Oanh', 20),
       ('Hong Ha', 50);

insert into `order`(customer_id, order_date, order_total_price)
values (1, '2006-03-21', null),
       (2, '2006-03-23', null),
       (1, '2006-03-16', null);

insert into product(product_name, product_price)
values ('May Giat', 3),
       ('Tu Lanh', 5),
       ('Dieu Hoa', 7),
       ('Quat', 1),
       ('Bep Dien', 2);

insert into order_detail(order_id, product_id, order_quality)
values (1, 1, 3),
       (1, 3, 7),
       (1, 4, 2),
       (2, 1, 1),
       (3, 1, 8),
       (2, 5, 4),
       (2, 3, 3);

-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select order_id, customer_id, order_date, order_total_price
from `order`;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select c.customer_name, p.product_name
from customer c
         join `order` o on c.customer_id = o.customer_id
         join order_detail od on o.order_id = od.order_id
         join product p on od.product_id = p.product_id;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select customer_name
from customer c
where c.customer_id not in (select distinct `order`.customer_id from `order`);

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn
-- giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn.
-- Giá bán của từng loại được tính = odQTY*pPrice
select o.order_id, o.order_date, od.order_quality * p.product_id as price
from `order` o
         join order_detail od on o.order_id = od.order_id
         join product p on od.product_id = p.product_id;
 
 
 