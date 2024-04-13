SET MODE POSTGRESQL;

CREATE TABLE countries (
    country_code varchar(5) NOT NULL primary key,
    name varchar(200),
    official_name varchar(200),
    citizen_name varchar(200)
);
