create
database if not exists students_management;
use
students_management;

create table class
(
    class_id   int auto_increment primary key,
    class_name varchar(60) not null,
    start_date datetime,
    `status`   bit
);

create table student
(
    student_id   int auto_increment primary key,
    student_name varchar(30) not null,
    address      varchar(50),
    phone        varchar(20),
    status       bit,
    class_id     int,
    foreign key (class_id) references class (class_id)
);

create table subject
(
    sub_id   int auto_increment primary key,
    sub_name varchar(30) not null,
    credit   tinyint     not null default 1 check (credit >= 1),
    status   bit                  default 1
);

create table mark
(
    mark_id    int auto_increment primary key,
    sub_id     int not null,
    student_id int not null,
    mark       float   default 0 check ( mark between 0 and 100),
    exam_time  tinyint default 1,
    unique (sub_id, student_id),
    foreign key (sub_id) references subject (sub_id),
    foreign key (student_id) references student (student_id)
);

insert into class(class_name, start_date, status)
values ('A1', '2008-12-20', 1),
       ('A2', '2008-12-22', 1),
       ('B3', current_date(), 0);

insert into student(student_name, address, phone, status, class_id)
values ('Hung', 'Ha Noi', '0912113113', 1, 1),
       ('Hoa', 'Hai phong', '', 1, 1),
       ('Manh', 'HCM', '0123123123', 0, 2);

insert into subject(sub_name, credit, status)
values ('CF', 5, 1),
       ('C', 6, 1),
       ('HDJ', 5, 1),
       ('RDBMS', 10, 1);

insert into mark(sub_id, student_id, mark, exam_time)
values (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);


												
