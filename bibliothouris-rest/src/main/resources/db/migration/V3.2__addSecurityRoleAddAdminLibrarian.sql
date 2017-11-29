ALTER TABLE USERS
ADD COLUMN ROLE VARCHAR(100),
ADD COLUMN PASSWORD VARCHAR(100);

INSERT USERS (NAME,PASSWORD,ROLE, FIRST_NAME)
VALUES('Test User','password','USER', 'testuser'),('Test Librarian','password','LIBRARIAN', 'Mattia'),('Test Admin','password','ADMIN', 'Ralph');