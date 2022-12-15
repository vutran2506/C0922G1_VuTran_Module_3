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

create table orders
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
    foreign key (order_id) references orders (order_id),
    foreign key (product_id) references product (product_id)
);

