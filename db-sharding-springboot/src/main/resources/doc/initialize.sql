CREATE DATABASE ds_0 CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';
CREATE DATABASE ds_1 CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';

USE ds_0;
CREATE TABLE user(
	id bigint(64) not null,
	city varchar(20) not null,
	name varchar(20) not null,
	PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

USE ds_1;
CREATE TABLE location (
    id varchar(20) NOT NULL,
    city varchar(20) NOT NULL,
    region varchar(20) NOT NULL,
    name varchar(20) NOT NULL,
    building_num varchar(10) NOT NULL,
    unit_num varchar(10) NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
