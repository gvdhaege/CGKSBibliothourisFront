ALTER TABLE USERS
ADD COLUMN ROLE VARCHAR(100),
ADD COLUMN PASSWORD VARCHAR(100);

INSERT USERS (NAME,PASSWORD,ROLE)
VALUES('Test User','password','USER'),('Test Librarian','password','LIBRARIAN'),('Test Admin','password','ADMIN');