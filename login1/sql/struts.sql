set name utf8;
set foreign_key_checks = 0;
drop database if exists logindb;
create database logindb;
use logindb;

create table user(
id int,
user_name varchar(255),
password varchar(255)
);

insert into user values
(1,"wago","123"),
(2,"juicy","123"),
(3,"nakata","123"),
(4,"momoko","123");