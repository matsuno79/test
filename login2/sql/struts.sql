set names utf8;
set foreign_key_checks = 0;
drop database if exists logindb;
create database logindb;
use logindb;

create table user(
id int;
user_name barcher(255),
password varcher(255)
);

insert into user values
(1,"taro","123"),
(1,"jiro","123"),
(1,"hanako","123"),
(1,"saburo","123");