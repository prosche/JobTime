 drop table users;
create table users(
 uuid Integer(10) primary key auto_increment not null,
 id Integer(10) not null,
 name varchar(50) not null,
 english_name varchar(50) not null,
 compact varchar(50) not null,
 status varchar(50) DEFAULT '1'
);

ALTER table users add status varchar(50) DEFAULT '1';

 
drop table holidays;
create table holidays	(
  uuid Integer(10) primary key auto_increment not null,
  op_month Integer(10) not null,
  user_id Integer(10) not null,
  all_annual_leave double DEFAULT 0,
  use_annual_leave double DEFAULT 0,
  unused_annual_leave double DEFAULT 0,
  all_sick_leave double DEFAULT 0,
  use_sick_leave double DEFAULT 0,
  unused_sick_leave double DEFAULT 0,
  status varchar(50) DEFAULT '1'
);

ALTER TABLE holidays ADD FOREIGN KEY(user_id) REFERENCES users(id); 

drop table leave_days;
create table  leave_days	(
  uuid Integer(10) primary key auto_increment not null,
  user_id Integer(10) not null,
  leave_day varchar(50),
  leave_time int(10) DEFAULT 0,
  reason_id varchar(50),
  reason varchar(50),
  create_date timestamp NOT NULL DEFAULT NOW(),
  deal_date timestamp NOT NULL DEFAULT NOW(),
  status varchar(50) DEFAULT '0'
);

ALTER TABLE leave_days ADD FOREIGN KEY(user_id) REFERENCES users(id); 

create table attendances (
  uuid Integer(10) primary key auto_increment not null,
  op_month Integer(10) not null,
  user_id Integer(10) not null,
  data1 varchar(5) default '',
  data2 varchar(5) default '',
  data3 varchar(5) default '',
  data4 varchar(5) default '',
  data5 varchar(5) default '',
  data6 varchar(5) default '',
  data7 varchar(5) default '',
  data8 varchar(5) default '',
  data9 varchar(5) default '',
  data10 varchar(5) default '',
  data11 varchar(5) default '',
  data12 varchar(5) default '',
  data13 varchar(5) default '',
  data14 varchar(5) default '',
  data15 varchar(5) default '',
  data16 varchar(5) default '',
  data17 varchar(5) default '',
  data18 varchar(5) default '',
  data19 varchar(5) default '',
  data20 varchar(5) default '',
  data21 varchar(5) default '',
  data22 varchar(5) default '',
  data23 varchar(5) default '',
  data24 varchar(5) default '',
  data25 varchar(5) default '',
  data26 varchar(5) default '',
  data27 varchar(5) default '',
  data28 varchar(5) default '',
  data29 varchar(5) default '',
  data30 varchar(5) default '',
  data31 varchar(5) default ''
);

ALTER TABLE attendances ADD FOREIGN KEY(user_id) REFERENCES users(id); 

 select * from users  ;
 select * from Holidays ;
 select * from leave_days ;
 where date_format(create_date,'%Y-%m') = '2017-03' ;
SELECT * FROM LEAVE_DAYS WHERE  date_format(create_date,'%Y-%m') = "2017-03" ;
 update users set status =0 where  id = 521 ;
 commit;
 INSERT INTO users(NAME, ENGLISH_NAME, COMPACT) VALUES( "点点" ,"yuki","2015-01-01");
 commit;
 
 alter TABLE users delete unused_sick_leave
 
 select * from attendances ;