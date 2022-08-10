
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
VALUES (101,'DB');

INSERT INTO Book (id, Bookname)
VALUES (102,'B Coal');

INSERT INTO Userd (id, NAME, Email, ROLE,PASSWORD)
VALUES (201,'Ravi Jain', 'jainravi@gmail.com' , 'Analyst','ravi1');

INSERT INTO Userd (id, NAME, Email, ROLE,PASSWORD)
VALUES (202,'Sakshi Jain', 'jainsakshi@gmail.com' , 'Analyst','sakshi1');

INSERT INTO Userd (id, NAME, Email, ROLE,PASSWORD)
VALUES (203,'Muskaan Shraogi', 'muskaanshraogi@gmail.com' , 'Analyst','muskaan1');


INSERT INTO Bookuser (Bookid, Userid)
VALUES (101, 201);

INSERT INTO Bookuser (Bookid, Userid)
VALUES (101, 202);

INSERT INTO SECURITY (Id, Isin, Cusip ,ISSUER , maturitydate, coupon, TYPE, facevalue, STATUS)
VALUES (301, 'INE123456AB1' ,'012ABCXYZ', 'Deutsche Bank', '2022-08-11', 2.65, 'government' , 90000, TRUE);

INSERT INTO SECURITY (Id, Isin, Cusip ,ISSUER , maturitydate, coupon, TYPE, facevalue, STATUS)
VALUES (302, 'INE321658KT4' ,'019YTF6CV', 'Deutsche Bank', '2022-08-12', 3.90, 'corporate' , 80000, FALSE);

INSERT INTO SECURITY (Id, Isin, Cusip ,ISSUER , maturitydate, coupon, TYPE, facevalue, STATUS)
VALUES (303, 'INO890GVT80S' ,'154UI90BH', 'Deutsche Bank', '2022-09-11', 4.78, 'corporate' , 90000, TRUE);

INSERT INTO SECURITY (Id, Isin, Cusip ,ISSUER , maturitydate, coupon, TYPE, facevalue, STATUS)
VALUES (304, 'IN907TYB4261' ,'89IYB67C3', 'Deutsche Bank', '2022-09-12', 5.25, 'corporate' , 70000, FALSE);

INSERT INTO SECURITY (Id, Isin, Cusip ,ISSUER , maturitydate, coupon, TYPE, facevalue, STATUS)
VALUES (305, 'IN907T78G266' ,'89IYB90G', 'Deutsche Bank', '2022-08-10', 3.33, 'government' , 100000, TRUE);

INSERT INTO SECURITY (Id, Isin, Cusip ,ISSUER , maturitydate, coupon, TYPE, facevalue, STATUS)
VALUES (306, 'IN786TRB7Y' ,'099UUT87S', 'Deutsche Bank', '2022-09-12', 5.25, 'corporate' , 70000, TRUE);

INSERT INTO counterparty (id,NAME) 
VALUES (501, 'Ram Jain');

INSERT INTO counterparty (id,NAME) 
VALUES (502, 'Sakshi Jain');

INSERT INTO counterparty (id,NAME) 
VALUES (503, 'Maulina');

INSERT INTO counterparty (id,NAME) 
VALUES (504, 'Shantanu');

INSERT INTO trade (id,bookid,counterpartyid, securityid, quantity, STATUS, price, buy_sell,Tradedate,Settlementdate)
VALUES (401,101,501,301,1,TRUE,1000,'buy','2022-08-08','2022-08-11');

INSERT INTO trade (id,bookid,counterpartyid, securityid, quantity, STATUS, price, buy_sell,Tradedate,Settlementdate)
VALUES (403,101,502,301,4,TRUE,783.8,'sell','2022-08-10','2022-08-11');

INSERT INTO trade (id,bookid,counterpartyid, securityid, quantity, STATUS, price, buy_sell,Tradedate,Settlementdate)
VALUES (402,101,504,301,1,TRUE,987.3,'sell','2022-08-10','2022-08-11');

INSERT INTO trade (id,bookid,counterpartyid, securityid, quantity, STATUS, price, buy_sell,Tradedate,Settlementdate)
VALUES (404,101,502,301,4,TRUE,1000,'sell','2022-08-10','2022-08-11');


INSERT INTO trade (id,bookid,counterpartyid, securityid, quantity, STATUS, price, buy_sell,Tradedate,Settlementdate)
VALUES (405,101,501,302,1,TRUE,1000,'buy','2022-08-08','2022-08-11');

INSERT INTO trade (id,bookid,counterpartyid, securityid, quantity, STATUS, price, buy_sell,Tradedate,Settlementdate)
VALUES (406,101,502,302,4,FALSE,783.8,'sell','2022-08-10','2022-08-11');

INSERT INTO trade (id,bookid,counterpartyid, securityid, quantity, STATUS, price, buy_sell,Tradedate,Settlementdate)
VALUES (407,101,504,302,1,TRUE,987.3,'sell','2022-08-10','2022-08-11');

INSERT INTO trade (id,bookid,counterpartyid, securityid, quantity, STATUS, price, buy_sell,Tradedate,Settlementdate)
VALUES (408,101,502,302,4,TRUE,1000,'sell','2022-08-10','2022-08-11');


INSERT INTO trade (id,bookid,counterpartyid, securityid, quantity, STATUS, price, buy_sell,Tradedate,Settlementdate)
VALUES (409,101,501,303,1,TRUE,1000,'buy','2022-08-08','2022-08-11');

INSERT INTO trade (id,bookid,counterpartyid, securityid, quantity, STATUS, price, buy_sell,Tradedate,Settlementdate)
VALUES (410,101,502,303,4,TRUE,783.8,'sell','2022-08-10','2022-08-11');

INSERT INTO trade (id,bookid,counterpartyid, securityid, quantity, STATUS, price, buy_sell,Tradedate,Settlementdate)
VALUES (411,101,504,303,1,TRUE,987.3,'sell','2022-08-10','2022-08-11');

INSERT INTO trade (id,bookid,counterpartyid, securityid, quantity, STATUS, price, buy_sell,Tradedate,Settlementdate)
VALUES (412,101,502,303,4,TRUE,1000,'sell','2022-08-10','2022-08-11');

INSERT INTO trade (id,bookid,counterpartyid, securityid, quantity, STATUS, price, buy_sell,Tradedate,Settlementdate)
VALUES (413,102,502,303,1,TRUE,1000,'buy','2022-08-05','2022-08-12');


INSERT INTO trade (id,bookid,counterpartyid, securityid, quantity, STATUS, price, buy_sell,Tradedate,Settlementdate)
VALUES (414,101,503,304,1,FALSE,1000,'sell','2022-08-05','2022-08-13');

INSERT INTO trade (id,bookid,counterpartyid, securityid, quantity, STATUS, price, buy_sell,Tradedate,Settlementdate)
VALUES (415,101,501,304,1,TRUE,1000,'buy','2022-08-08','2022-08-11');

INSERT INTO trade (id,bookid,counterpartyid, securityid, quantity, STATUS, price, buy_sell,Tradedate,Settlementdate)
VALUES (416,101,502,304,4,TRUE,783.8,'sell','2022-08-10','2022-08-11');

INSERT INTO trade (id,bookid,counterpartyid, securityid, quantity, STATUS, price, buy_sell,Tradedate,Settlementdate)
VALUES (417,101,504,304,1,TRUE,987.3,'sell','2022-08-10','2022-08-11');

INSERT INTO trade (id,bookid,counterpartyid, securityid, quantity, STATUS, price, buy_sell,Tradedate,Settlementdate)
VALUES (418,101,502,304,4,TRUE,1000,'sell','2022-08-10','2022-08-11');


INSERT INTO trade (id,bookid,counterpartyid, securityid, quantity, STATUS, price, buy_sell,Tradedate,Settlementdate)
VALUES (419,101,501,305,1,TRUE,1000,'buy','2022-08-08','2022-08-11');

INSERT INTO trade (id,bookid,counterpartyid, securityid, quantity, STATUS, price, buy_sell,Tradedate,Settlementdate)
VALUES (420,101,502,305,4,TRUE,783.8,'sell','2022-08-10','2022-08-11');

INSERT INTO trade (id,bookid,counterpartyid, securityid, quantity, STATUS, price, buy_sell,Tradedate,Settlementdate)
VALUES (421,101,504,306,1,TRUE,987.3,'sell','2022-08-10','2022-08-11');

INSERT INTO trade (id,bookid,counterpartyid, securityid, quantity, STATUS, price, buy_sell,Tradedate,Settlementdate)
VALUES (422,101,502,306,4,TRUE,1000,'sell','2022-08-10','2022-08-11');

