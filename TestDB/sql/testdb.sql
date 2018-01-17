drop database if exists testdb;
create database testdb;
use testdb;

create table test_table (
No int,
name varchar(255),
age int(255),
Mail varchar(255)
);

insert into test_table values(1,"wago",32,"@yahoo");
insert into test_table values(2,"shiro",24,"@-");
insert into test_table values(3,"matu",25,"@@");
insert into test_table values(3,"nakata",89,"@@@");



