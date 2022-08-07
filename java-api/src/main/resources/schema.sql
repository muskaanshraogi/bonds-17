DROP TABLE IF EXISTS dogs;
  
CREATE TABLE dogs (
id INT NOT NULL,
NAME VARCHAR(250) NOT NULL,
age INT NOT NULL
);

DROP TABLE IF EXISTS Book;
  
CREATE TABLE Book (
Id INT PRIMARY KEY,
Bookname VARCHAR(250) NOT NULL UNIQUE
);

/*
 we can look after login testing 
Drop table if EXISTS Login
create table login (
	username

);
*/
DROP TABLE IF EXISTS USER;

CREATE TABLE USER(
Id INT PRIMARY KEY,
NAME VARCHAR(100) NOT NULL ,
Email VARCHAR(100) NOT NULL UNIQUE,
ROLE VARCHAR(100) NOT NULL,
-- we need to remove later
PASSWORD VARCHAR (100) NOT NULL
);
 

 DROP TABLE IF EXISTS Bookuser;
  
CREATE TABLE Bookuser (
 
 Bookid INT,
 Userid INT,
 FOREIGN KEY (Bookid) REFERENCES Book(Id),
 FOREIGN KEY (Userid) REFERENCES USER(Id)
);

  DROP TABLE IF EXISTS SECURITY;
  CREATE TABLE SECURITY(
    Id INT PRIMARY KEY,
    Isin VARCHAR(12),
    Cusip VARCHAR(9),
    ISSUER VARCHAR(100),
    Maturitydate DATE,
    Coupon FLOAT,
    TYPE VARCHAR (50),
    Facevalue FLOAT,
    STATUS BOOLEAN DEFAULT FALSE
  );
  
  DROP TABLE IF EXISTS Counterparty;
  CREATE TABLE Counterparty(
    Id INT PRIMARY KEY,
    NAME VARCHAR(100) NOT NULL 
  );
  
DROP TABLE IF EXISTS Trade;
  CREATE TABLE TRADE(
  Id INT PRIMARY KEY,
    Bookid INT,
    Counterpartyid INT,
    Securityid INT,
    Quantity INT,
    STATUS BOOLEAN DEFAULT FALSE,
    Price FLOAT ,
    Buy_sell VARCHAR(4) ,
    Tradedate DATE,
    Settlementdate DATE  ,
    FOREIGN KEY (Bookid) REFERENCES Book(Id),
    FOREIGN KEY (Counterpartyid) REFERENCES Counterparty(Id),
    FOREIGN KEY (Securityid) REFERENCES SECURITY(Id)
  );
  
