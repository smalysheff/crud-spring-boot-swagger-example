CREATE TABLE student
(
id uuid not null primary key,
created timestamp not null,
created_by varchar(50) not null,
updated timestamp not null,
updated_by varchar(50),
first_name varchar(50) not null,
last_name varchar(50) not null,
birthday varchar(20) not null,
specialty_id uuid not null,
foreign key (specialty_id) references specialty (id)
);