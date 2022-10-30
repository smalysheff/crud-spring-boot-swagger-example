CREATE TABLE specialty
(
id uuid not null primary key,
created timestamp not null,
created_by varchar(50) not null,
updated timestamp not null,
updated_by varchar(50),
name varchar(50) not null,
code varchar(20) not null
);