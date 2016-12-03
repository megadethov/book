
#DDL
CREATE  TABLE  IF NOT EXISTS user (id INT NOT NULL , name VARCHAR(45) NULL, PRIMARY KEY (id));
CREATE TABLE `test`.`user` (`user_id` INT NOT NULL,`user_name` VARCHAR(45) NULL, PRIMARY KEY (`user_id`));
ALTER TABLE bookstore ADD year INTEGER;
ALTER TABLE user CHANGE COLUMN id id INT(11) NOT NULL AUTO_INCREMENT;
DROP TABLE user;

#DML
INSERT INTO user (name, age) VALUES ('Anton', 27);
DELETE FROM user;
UPDATE user SET name = 'Santa' WHERE id = 1;

#PrepareStatement
INSERT INTO user (name, age) VALUES (?, ?);
UPDATE user SET name = ? WHERE id = ?;
SELECT * from user WHERE name = ?;

