
/*

TRUNCATE TABLE bookuser;
TRUNCATE TABLE book;
TRUNCATE TABLE user;
Truncate table trade;
truncate table security;
truncate table counterparty;
*/

INSERT INTO Book (id, BookName)
VALUES (101,'Book1');

INSERT INTO USER (id, NAME, Email, Role)
VALUES (201,'Ravi Jain', 'jainravi9915@gmail.com' , 'Analyst');

INSERT INTO BookUser (Bookid, Userid)
VALUES (101,201);

INSERT INTO SECURITY (Id, ISIN, CUSIP ,ISSUER , maturityDate, coupon, TYPE, facevalue, STATUS)
VALUES (301, '12AlphaNumer' ,'9lettrnum', 'Deutsche Bank', '2022-08-06', 2, 'government' , 10000, TRUE);

INSERT INTO counterparty (id,NAME) 
VALUES (201, 'Ravi Jain');

INSERT INTO trade (id,counterpartyid, securityid, quantity, STATUS, price, buy_sell,TradeDate,SettlementDate)
VALUES (401,201,301,1,TRUE,1000,'buy','2022-08-05','2022-08-06');

