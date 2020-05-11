alter database exampledb OWNER TO exampleuser;
\connect exampledb;
create SCHEMA IF NOT EXISTS example;
GRANT ALL PRIVILEGES ON SCHEMA example TO GROUP exampleuser;

CREATE TABLE IF NOT EXISTS something
(
    id int not null primary key,
    name varchar(200) not null
);

CREATE SEQUENCE something_seq START 1;

INSERT INTO something VALUES (NEXTVAL('something_seq'), 'Initial load 1');
INSERT INTO something VALUES (NEXTVAL('something_seq'), 'Initial load 2');
INSERT INTO something VALUES (NEXTVAL('something_seq'), 'Initial load 3');
INSERT INTO something VALUES (NEXTVAL('something_seq'), 'Initial load 4');
INSERT INTO something VALUES (NEXTVAL('something_seq'), 'Initial load 5');