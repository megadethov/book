/*A table is in third normal form when the following conditions are met:
It is in second normal form.
All nonprimary fields are dependent on the primary key.

The dependency of nonprimary fields is between the data. For example, in the below table,
street name, city, and state are unbreakably bound to the zip code.
*/

CREATE TABLE CUSTOMERS(
  CUST_ID       INT              NOT NULL,
  CUST_NAME     VARCHAR (20)      NOT NULL,
  DOB           DATE,
  STREET        VARCHAR(200),
  CITY          VARCHAR(100),
  STATE         VARCHAR(100),
  ZIP           VARCHAR(12),
  EMAIL_ID      VARCHAR(256),
  PRIMARY KEY (CUST_ID)
);
/*The dependency between zip code and address is called a transitive dependency.
To comply with third normal form, all you need to do is move the Street,
City, and State fields into their own table, which you can call the Zip
Code table:
*/
CREATE TABLE ADDRESS(
  ZIP           VARCHAR(12),
  STREET        VARCHAR(200),
  CITY          VARCHAR(100),
  STATE         VARCHAR(100),
  PRIMARY KEY (ZIP)
);
# Next, alter the CUSTOMERS table as follows:
CREATE TABLE CUSTOMERS(
  CUST_ID       INT              NOT NULL,
  CUST_NAME     VARCHAR (20)      NOT NULL,
  DOB           DATE,
  ZIP           VARCHAR(12),
  EMAIL_ID      VARCHAR(256),
  PRIMARY KEY (CUST_ID)
);

