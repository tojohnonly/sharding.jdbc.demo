CREATE DATABASE ds_0 CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';
CREATE DATABASE ds_1 CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';

USE ds_0;
CREATE TABLE user (
	id bigint(64) not null,
	city varchar(20) not null,
	name varchar(20) not null,
	PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO user VALUES (1001,'上海','尹吉欢');
INSERT INTO user VALUES (1002,'北京','张三');

USE ds_1;
CREATE TABLE user (
  id bigint(64) not null,
  city varchar(20) not null,
  name varchar(20) not null,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO user VALUES (1001,'上海','尹吉欢');
INSERT INTO user VALUES (1002,'北京','张三');

