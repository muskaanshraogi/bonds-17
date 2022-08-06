DROP TABLE IF EXISTS dogs;
  
CREATE TABLE dogs (
id INT NOT NULL,
name VARCHAR(250) NOT NULL,
age INT NOT NULL
);

DROP TABLE IF EXISTS Book;
  
CREATE TABLE BOOK (
Id INT PRIMARY KEY,
BookName VARCHAR(250) NOT NULL UNIQUE
);
/*
 we can look after login testing 
Drop table if EXISTS Login
create table login (
	username

);
*/
DROP TABLE IF EXISTS UserD;

CREATE TABLE UserD(
Id INT PRIMARY KEY,
Name VARCHAR(100) NOT NULL ,
Email VARCHAR(100) NOT NULL UNIQUE,
Role VARCHAR(100) NOT NULL,
-- we need to remove later
Password varchar (100) not null
);
 

 DROP TABLE IF EXISTS BookUser;
  
CREATE TABLE BookUser (
 
 BookId INT,
 UserId INT,
 FOREIGN KEY (BookId) REFERENCES Book(Id),
 FOREIGN KEY (UserId) REFERENCES UserD(Id)
);

  DROP TABLE IF EXISTS SECURITY;
  CREATE TABLE SECURITY(
    Id INT PRIMARY KEY,
    Isin VARCHAR(12),
    Cusip VARCHAR(9),
    Issuer VARCHAR(100),
    MaturityDate DATE,
    Coupon FLOAT,
    TYPE VARCHAR (50),
    FaceValue FLOAT,
    STATUS BOOLEAN DEFAULT FALSE
  );
  
  DROP TABLE IF EXISTS CounterParty;
  CREATE TABLE CounterParty(
    Id INT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL 
  );
  
DROP TABLE IF EXISTS Trade;
  CREATE TABLE TRADE(
  ID INT PRIMARY KEY,
    BookID INT,
    CounterPartyId INT,
    SecurityId INT,
    Quantity INT,
    Status BOOLEAN DEFAULT FALSE,
    Price FLOAT ,
    Buy_Sell VARCHAR(4) ,
    TradeDate DATE,
    SettlementDate DATE  ,
    FOREIGN KEY (BookId) REFERENCES Book(Id),
    FOREIGN KEY (CounterPartyId) REFERENCES CounterParty(Id),
    FOREIGN KEY (SecurityId) REFERENCES SECURITY(Id)
  );
  
