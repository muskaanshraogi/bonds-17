
 INSERT INTO dogs (id, NAME, age) VALUES (1, 'Einstein', 3);
 INSERT INTO dogs (id, NAME, age) VALUES (2, 'Kaya', 5);
 
/*
TRUNCATE TABLE bookuser;
TRUNCATE TABLE book;
TRUNCATE TABLE USER;
TRUNCATE TABLE trade;
TRUNCATE TABLE SECURITY;
TRUNCATE TABLE counterparty;
*/



INSERT INTO Book (id, Bookname)
VALUES (101,'Book1');

INSERT INTO USER (id, NAME, Email, ROLE,PASSWORD)
VALUES (201,'Ravi Jain', 'jainravi9915@gmail.com' , 'Analyst','password1');

INSERT INTO USER (id, NAME, Email, ROLE,PASSWORD)
VALUES (202,'Rajat Jain', 'jainravi@gmail.com' , 'Analyst','password1');

INSERT INTO Bookuser (Bookid, Userid)
VALUES (101,201);

INSERT INTO SECURITY (Id, Isin, Cusip ,ISSUER , maturitydate, coupon, TYPE, facevalue, STATUS)
VALUES (301, '12AlphaNumer' ,'9lettrnum', 'Deutsche Bank', '2022-08-06', 2, 'government' , 10000, TRUE);

INSERT INTO counterparty (id,NAME) 
VALUES (501, 'Ram Jain');

INSERT INTO counterparty (id,NAME) 
VALUES (502, 'Rajat Jain');

INSERT INTO trade (id,bookid,counterpartyid, securityid, quantity, STATUS, price, buy_sell,Tradedate,Settlementdate)
VALUES (402,101,501,301,1,TRUE,1000,'buy','2022-08-05','2022-08-07');

