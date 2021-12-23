alter table UNTITLED_VISIT add column HOUR_SPENT bigint ^
update UNTITLED_VISIT set HOUR_SPENT = 0 where HOUR_SPENT is null ;
alter table UNTITLED_VISIT alter column HOUR_SPENT set not null ;
