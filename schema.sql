DROP TABLE IF EXISTS dogs;
  
CREATE TABLE dogs (
id INT NOT NULL,
name VARCHAR(250) NOT NULL,
age INT NOT NULL
);
 DROP TABLE IF EXISTS Book;
  
CREATE TABLE Book (
id INT PRIMARY KEY,
BookName VARCHAR(250) NOT NULL UNIQUE
);
 


DROP TABLE IF EXISTS User;

CREATE TABLE User(
Id INT PRIMARY KEY,
NAME VARCHAR(250) NOT NULL UNIQUE,
Email VARCHAR(250) NOT NULL UNIQUE,
Role VARCHAR(250) NOT NULL UNIQUE
);
 
 DROP TABLE IF EXISTS BookUser;
  
CREATE TABLE BookUser (
 
 BookId INT,
UserId Int,
 FOREIGN KEY (BookId) REFERENCES Book(id),
 FOREIGN KEY (UserId) REFERENCES User(id)
);

  Drop Table if Exists Security;
  create Table Security(
    Id int primary key,
    ISIN varchar(12),
    CUSIP varchar(9),
    Issuer varchar(100),
    MaturityDate date,
    Coupon varchar(100),
    Type varchar (50),
    FaceValue float,
    Status boolean default false
  );
  
  Drop Table If Exists CounterParty;
  create Table CounterParty(
    id int primary key,
    Name varchar(100) NOT NULL
  
  
  );
Drop table if exists Trade;
  CREATE TABLE TRADE(
  ID INT PRIMARY KEY,
    BookID INT,
    CounterPartyId INT,
    SecurityId INT,
    Quantity INT,
    Status boolean default false,
    Price float ,
    Buy_Sell varchar(4) ,
    TradeDate Date,
    SettlementDate Date  ,
    FOREIGN KEY (BookId) REFERENCES Book(id),
    FOREIGN KEY (CounterPartyId) REFERENCES CounterParty(id),
    FOREIGN KEY (SecurityId) REFERENCES Security(id)
  );
