CREATE  TABLE  IF NOT EXISTS bookstore (id INT NOT NULL , name VARCHAR(45) NULL, PRIMARY KEY (id));
CREATE TABLE `test`.`bookstore` (`bookstore_id` INT NOT NULL,`bookstore_name` VARCHAR(45) NULL, PRIMARY KEY (`bookstore_id`));
ALTER TABLE bookstore ADD year INTEGER;
DROP TABLE bookstore;
