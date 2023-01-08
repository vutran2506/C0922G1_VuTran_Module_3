create database if not exists furama;
use furama;

create table positions (
position_id int  primary key,
name varchar(45)
);

create table education_degree (
education_degree_id int  primary key,
name varchar(45)
);

create table division(
division_id int  primary key,
name varchar(45)
);

create table employee (
employee_id int   primary key,
 name varchar(45),
 date_of_birth date,
 id_card varchar(45),
 salary double,
 phone_number varchar(45),
 email varchar(45),
 address varchar(45),
 position_id int,
 education_degree_id int,
division_id int,
foreign key (position_id) references positions(position_id),
foreign key (education_degree_id) references education_degree(education_degree_id),
foreign key (division_id) references division (division_id)
);

create table customer_type(
customer_type_id int  primary key,
name varchar(45)
);

insert into customer_type(customer_type_id,name)
values
(1, 'Diamond'),
(2, 'Platinium'),
(3, 'Gold'),
(4, 'Silve'),
(5, 'Member');
select*from customer_type;

create table customer(
customer_id int  primary key,
customer_type_id int,
name varchar(45),
date_of_birth date,
gender bit(1),
id_card varchar(45),
phone_number varchar(45),
email varchar(45),
address varchar(45),
foreign key (customer_type_id) references customer_type (customer_type_id)
);
insert into customer(customer_id,customer_type_id,name,date_of_birth,gender,id_card,phone_number,email,address)values(1,1, 'Nguyễn Thị Hào', '1970-11-07	', 0, '643431213', '0945423362', 'thihao07@gmail.com','23 Nguyễn Hoàng, Đà Nẵng');
-- Câu truy vấn Customer
select*from customer;
delete from customer where customer_id =13;
update customer set customer_type_id =2 ,name= "Trần Ngọc Vũ" ,date_of_birth ="1995-11-11",gender =1 ,id_card="159",phone_number="123",email="acv",address="adasd" where customer_id =1;

select c.*,ct.name from customer c join customer_type ct on c.customer_type_id = ct.customer_type_id;
create table facility_type(
facility_type_id int  primary key,
name varchar(45)
);

create table rent_type(
rent_type_id int  primary key,
name varchar(45)
);

create table facility(
facility_id int  primary key,
name varchar(45),
area int,
cost double,
max_people int,
rent_type_id int,
facility_type_id int,
standard_room varchar(45),
description_other_convenience varchar(45),
pool_area double,
number_of_floors int,
facility_free text,
foreign key(facility_type_id) references facility_type(facility_type_id),
foreign key(rent_type_id) references rent_type(rent_type_id)
);

create table contract (
contract_id int  primary key,
start_date datetime,
end_date datetime,
deposit double,
employee_id int,
customer_id int,
facility_id int,
foreign key(employee_id) references employee(employee_id),
foreign key(customer_id) references customer(customer_id),
foreign key(facility_id) references facility(facility_id)
);

create table attach_facility (
attach_facility_id int  primary key,
name varchar(45),
cost double,
uint varchar(10),
status varchar(45)
);

create table contract_detall(
id int primary key,
contract_id int,
attach_facility_id int,
quanlity int,
foreign key (contract_id) references contract(contract_id),
foreign key (attach_facility_id) references attach_facility(attach_facility_id)
);







