
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


INSERT INTO Bookuser (Bookid, Userid)
VALUES (101,201);
INSERT INTO Bookuser (Bookid, Userid)
VALUES (101,201);

INSERT INTO SECURITY (Id, Isin, Cusip ,ISSUER , maturitydate, coupon, TYPE, facevalue, STATUS)
VALUES (301, 'INE123456AB1' ,'012ABCXYZ', 'Deutsche Bank', '2022-08-11', 2, 'government' , 90000, TRUE);

INSERT INTO SECURITY (Id, Isin, Cusip ,ISSUER , maturitydate, coupon, TYPE, facevalue, STATUS)
VALUES (302, 'INE321654AB1' ,'012ABCXYB', 'Deutsche Bank', '2022-08-12', 3, 'government' , 80000, FALSE);

INSERT INTO SECURITY (Id, Isin, Cusip ,ISSUER , maturitydate, coupon, TYPE, facevalue, STATUS)
VALUES (303, 'INE123456AB1' ,'012ABCXYZ', 'Deutsche Bank', '2022-09-11', 2, 'government' , 90000, TRUE);

INSERT INTO SECURITY (Id, Isin, Cusip ,ISSUER , maturitydate, coupon, TYPE, facevalue, STATUS)
VALUES (304, 'INE321654AB1' ,'012ABCXYB', 'Deutsche Bank', '2022-09-12', 2, 'government' , 70000, FALSE);

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
VALUES (402,102,502,303,1,TRUE,1000,'buy','2022-08-05','2022-08-12');


INSERT INTO trade (id,bookid,counterpartyid, securityid, quantity, STATUS, price, buy_sell,Tradedate,Settlementdate)
VALUES (403,101,503,302,1,TRUE,1000,'sell','2022-08-05','2022-08-13');

