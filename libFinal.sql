--------------------------------------------------------
--  File created - Thursday-July-28-2022   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Sequence BOOKS_COUNTER
--------------------------------------------------------

   CREATE SEQUENCE  "C##AHMAD"."BOOKS_COUNTER"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 41 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence ISSUE_COUNTER
--------------------------------------------------------

   CREATE SEQUENCE  "C##AHMAD"."ISSUE_COUNTER"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 41 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence USERS_COUNTER
--------------------------------------------------------

   CREATE SEQUENCE  "C##AHMAD"."USERS_COUNTER"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 21 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence USER_MOVES_COUNTER
--------------------------------------------------------

   CREATE SEQUENCE  "C##AHMAD"."USER_MOVES_COUNTER"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 41 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Table ADMIN
--------------------------------------------------------

  CREATE TABLE "C##AHMAD"."ADMIN" 
   (	"NAME" VARCHAR2(50 BYTE), 
	"PASSWORD" VARCHAR2(60 BYTE), 
	"EMAIL" VARCHAR2(60 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table BOOKS
--------------------------------------------------------

  CREATE TABLE "C##AHMAD"."BOOKS" 
   (	"ID" NUMBER, 
	"NAME" VARCHAR2(30 BYTE), 
	"STATUS" VARCHAR2(15 BYTE), 
	"QUANTITY" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table ISSUE
--------------------------------------------------------

  CREATE TABLE "C##AHMAD"."ISSUE" 
   (	"USER_ID" NUMBER, 
	"BOOK_ID" NUMBER, 
	"ISSUE_DATE" DATE, 
	"ID" NUMBER, 
	"QUANTITY" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table USERS
--------------------------------------------------------

  CREATE TABLE "C##AHMAD"."USERS" 
   (	"ID" NUMBER, 
	"USERNAME" VARCHAR2(50 BYTE), 
	"PASSWORD" VARCHAR2(50 BYTE), 
	"EMAIL" VARCHAR2(60 BYTE), 
	"DISABLED" VARCHAR2(15 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table USER_MOVES
--------------------------------------------------------

  CREATE TABLE "C##AHMAD"."USER_MOVES" 
   (	"ID" NUMBER, 
	"USER_ID" NUMBER, 
	"BOOK_ID" NUMBER, 
	"TYPE" VARCHAR2(15 BYTE), 
	"MOVE_DATE" DATE, 
	"QUANTITY" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into C##AHMAD.ADMIN
SET DEFINE OFF;
Insert into C##AHMAD.ADMIN (NAME,PASSWORD,EMAIL) values ('admin','admin','ahmadatallah943@gmail.com');
REM INSERTING into C##AHMAD.BOOKS
SET DEFINE OFF;
Insert into C##AHMAD.BOOKS (ID,NAME,STATUS,QUANTITY) values (1,'C How To Program','available',1);
Insert into C##AHMAD.BOOKS (ID,NAME,STATUS,QUANTITY) values (2,'Java How To Program','available',2);
Insert into C##AHMAD.BOOKS (ID,NAME,STATUS,QUANTITY) values (3,'Data Structure','available',7);
Insert into C##AHMAD.BOOKS (ID,NAME,STATUS,QUANTITY) values (4,'Calculus 3','available',5);
Insert into C##AHMAD.BOOKS (ID,NAME,STATUS,QUANTITY) values (22,'Numerical Analysis','available',11);
Insert into C##AHMAD.BOOKS (ID,NAME,STATUS,QUANTITY) values (23,'Circuit theory','available',7);
Insert into C##AHMAD.BOOKS (ID,NAME,STATUS,QUANTITY) values (24,'Digital circuit','available',4);
Insert into C##AHMAD.BOOKS (ID,NAME,STATUS,QUANTITY) values (6,'The Book','unavailable',0);
Insert into C##AHMAD.BOOKS (ID,NAME,STATUS,QUANTITY) values (5,'Calculus 1','available',5);
Insert into C##AHMAD.BOOKS (ID,NAME,STATUS,QUANTITY) values (21,'new book','unavailable',0);
REM INSERTING into C##AHMAD.ISSUE
SET DEFINE OFF;
Insert into C##AHMAD.ISSUE (USER_ID,BOOK_ID,ISSUE_DATE,ID,QUANTITY) values (2,1,to_date('26-JUL-22','DD-MON-RR'),29,1);
Insert into C##AHMAD.ISSUE (USER_ID,BOOK_ID,ISSUE_DATE,ID,QUANTITY) values (2,3,to_date('26-JUL-22','DD-MON-RR'),27,1);
Insert into C##AHMAD.ISSUE (USER_ID,BOOK_ID,ISSUE_DATE,ID,QUANTITY) values (2,5,to_date('26-JUL-22','DD-MON-RR'),28,2);
Insert into C##AHMAD.ISSUE (USER_ID,BOOK_ID,ISSUE_DATE,ID,QUANTITY) values (1,5,to_date('26-JUL-22','DD-MON-RR'),30,1);
Insert into C##AHMAD.ISSUE (USER_ID,BOOK_ID,ISSUE_DATE,ID,QUANTITY) values (2,22,to_date('26-JUL-22','DD-MON-RR'),21,1);
Insert into C##AHMAD.ISSUE (USER_ID,BOOK_ID,ISSUE_DATE,ID,QUANTITY) values (1,22,to_date('26-JUL-22','DD-MON-RR'),26,3);
REM INSERTING into C##AHMAD.USERS
SET DEFINE OFF;
Insert into C##AHMAD.USERS (ID,USERNAME,PASSWORD,EMAIL,DISABLED) values (1,'amrosous','123','amroosous@gmail.com','abled');
Insert into C##AHMAD.USERS (ID,USERNAME,PASSWORD,EMAIL,DISABLED) values (2,'ahmad','ahmad','amroosous@gmail.com','abled');
REM INSERTING into C##AHMAD.USER_MOVES
SET DEFINE OFF;
Insert into C##AHMAD.USER_MOVES (ID,USER_ID,BOOK_ID,TYPE,MOVE_DATE,QUANTITY) values (19,2,5,'issue',to_date('26-JUL-22','DD-MON-RR'),2);
Insert into C##AHMAD.USER_MOVES (ID,USER_ID,BOOK_ID,TYPE,MOVE_DATE,QUANTITY) values (20,2,1,'issue',to_date('26-JUL-22','DD-MON-RR'),1);
Insert into C##AHMAD.USER_MOVES (ID,USER_ID,BOOK_ID,TYPE,MOVE_DATE,QUANTITY) values (17,2,3,'issue',to_date('26-JUL-22','DD-MON-RR'),1);
Insert into C##AHMAD.USER_MOVES (ID,USER_ID,BOOK_ID,TYPE,MOVE_DATE,QUANTITY) values (18,2,22,'issue',to_date('26-JUL-22','DD-MON-RR'),1);
Insert into C##AHMAD.USER_MOVES (ID,USER_ID,BOOK_ID,TYPE,MOVE_DATE,QUANTITY) values (21,2,22,'return',to_date('26-JUL-22','DD-MON-RR'),2);
Insert into C##AHMAD.USER_MOVES (ID,USER_ID,BOOK_ID,TYPE,MOVE_DATE,QUANTITY) values (16,1,22,'issue',to_date('26-JUL-22','DD-MON-RR'),3);
Insert into C##AHMAD.USER_MOVES (ID,USER_ID,BOOK_ID,TYPE,MOVE_DATE,QUANTITY) values (22,1,5,'issue',to_date('26-JUL-22','DD-MON-RR'),1);
--------------------------------------------------------
--  DDL for Index ADMIN_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##AHMAD"."ADMIN_PK" ON "C##AHMAD"."ADMIN" ("NAME") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index BOOKS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##AHMAD"."BOOKS_PK" ON "C##AHMAD"."BOOKS" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index ISSUE_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##AHMAD"."ISSUE_PK" ON "C##AHMAD"."ISSUE" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index USERS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##AHMAD"."USERS_PK" ON "C##AHMAD"."USERS" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index USER_MOVES_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##AHMAD"."USER_MOVES_PK" ON "C##AHMAD"."USER_MOVES" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Trigger ISSUE_TRIGGER
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE TRIGGER "C##AHMAD"."ISSUE_TRIGGER" 
after update of quantity on issue
begin
delete from issue where quantity = 0;
end;
/
ALTER TRIGGER "C##AHMAD"."ISSUE_TRIGGER" ENABLE;
--------------------------------------------------------
--  DDL for Trigger QUANTITY_TRIGGER
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE TRIGGER "C##AHMAD"."QUANTITY_TRIGGER" 
after insert or delete or update on issue 
for each row
begin 
if inserting then
update books set books.quantity = books.quantity - :NEW.quantity where books.id = :NEW.book_id;
end if;
if deleting then
update books set books.quantity = books.quantity + :OLD.quantity where books.id = :OLD.book_id;
end if; 
if updating then
update books set books.quantity = (books.quantity + (:OLD.quantity - :NEW.quantity)) where books.id = :OLD.book_id;
end if;
end;
/
ALTER TRIGGER "C##AHMAD"."QUANTITY_TRIGGER" ENABLE;
--------------------------------------------------------
--  DDL for Trigger STATUS_LISTNER
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE TRIGGER "C##AHMAD"."STATUS_LISTNER" 
after insert or update of quantity on books
begin
update books set status = 'unavailable' where books.quantity = 0;
update books set status = 'available' where books.quantity > 0;
end;
/
ALTER TRIGGER "C##AHMAD"."STATUS_LISTNER" ENABLE;
--------------------------------------------------------
--  DDL for Trigger USER_MOVES_TRIGGER
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE TRIGGER "C##AHMAD"."USER_MOVES_TRIGGER" 
after insert or delete or update on issue 
for each row
begin
if inserting then 
insert into user_moves (id, user_id, book_id, quantity, move_date, type) values
(user_moves_counter.nextval, :NEW.user_id, :NEW.book_id, :NEW.quantity, :NEW.issue_date, 'issue');
end if;
if deleting then
insert into user_moves (id, user_id, book_id, quantity, move_date, type) values
(user_moves_counter.nextval, :OLD.user_id, :OLD.book_id, :OLD.quantity, :OLD.issue_date, 'return');
end if;
if updating and :NEW.quantity < :OLD.quantity then
insert into user_moves (id, user_id, book_id, quantity, move_date, type) values
(user_moves_counter.nextval, :OLD.user_id, :OLD.book_id, :OLD.quantity - :NEW.quantity, :OLD.issue_date, 'return');
end if;
if updating and :NEW.quantity > :OLD.quantity then
insert into user_moves (id, user_id, book_id, quantity, move_date, type) values
(user_moves_counter.nextval, :OLD.user_id, :OLD.book_id, :NEW.quantity - :OLD.quantity, :OLD.issue_date, 'issue');
end if;
end;
/
ALTER TRIGGER "C##AHMAD"."USER_MOVES_TRIGGER" ENABLE;
--------------------------------------------------------
--  Constraints for Table USERS
--------------------------------------------------------

  ALTER TABLE "C##AHMAD"."USERS" MODIFY ("USERNAME" NOT NULL ENABLE);
  ALTER TABLE "C##AHMAD"."USERS" MODIFY ("PASSWORD" NOT NULL ENABLE);
  ALTER TABLE "C##AHMAD"."USERS" MODIFY ("EMAIL" NOT NULL ENABLE);
  ALTER TABLE "C##AHMAD"."USERS" ADD CHECK (disabled in ('abled', 'disabled')) ENABLE;
  ALTER TABLE "C##AHMAD"."USERS" ADD UNIQUE ("USERNAME")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "C##AHMAD"."USERS" ADD CONSTRAINT "USERS_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table USER_MOVES
--------------------------------------------------------

  ALTER TABLE "C##AHMAD"."USER_MOVES" MODIFY ("USER_ID" NOT NULL ENABLE);
  ALTER TABLE "C##AHMAD"."USER_MOVES" MODIFY ("BOOK_ID" NOT NULL ENABLE);
  ALTER TABLE "C##AHMAD"."USER_MOVES" MODIFY ("MOVE_DATE" NOT NULL ENABLE);
  ALTER TABLE "C##AHMAD"."USER_MOVES" ADD CHECK (type in ('issue', 'return')) ENABLE;
  ALTER TABLE "C##AHMAD"."USER_MOVES" ADD CONSTRAINT "USER_MOVES_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "C##AHMAD"."USER_MOVES" MODIFY ("QUANTITY" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table ADMIN
--------------------------------------------------------

  ALTER TABLE "C##AHMAD"."ADMIN" MODIFY ("PASSWORD" NOT NULL ENABLE);
  ALTER TABLE "C##AHMAD"."ADMIN" MODIFY ("EMAIL" NOT NULL ENABLE);
  ALTER TABLE "C##AHMAD"."ADMIN" ADD CONSTRAINT "ADMIN_PK" PRIMARY KEY ("NAME")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table ISSUE
--------------------------------------------------------

  ALTER TABLE "C##AHMAD"."ISSUE" MODIFY ("USER_ID" NOT NULL ENABLE);
  ALTER TABLE "C##AHMAD"."ISSUE" MODIFY ("ISSUE_DATE" NOT NULL ENABLE);
  ALTER TABLE "C##AHMAD"."ISSUE" ADD CONSTRAINT "ISSUE_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "C##AHMAD"."ISSUE" MODIFY ("QUANTITY" NOT NULL ENABLE);
  ALTER TABLE "C##AHMAD"."ISSUE" MODIFY ("BOOK_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table BOOKS
--------------------------------------------------------

  ALTER TABLE "C##AHMAD"."BOOKS" MODIFY ("NAME" NOT NULL ENABLE);
  ALTER TABLE "C##AHMAD"."BOOKS" ADD CHECK ( status IN ('available', 'unavailable')) ENABLE;
  ALTER TABLE "C##AHMAD"."BOOKS" ADD UNIQUE ("NAME")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "C##AHMAD"."BOOKS" ADD CONSTRAINT "BOOKS_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
