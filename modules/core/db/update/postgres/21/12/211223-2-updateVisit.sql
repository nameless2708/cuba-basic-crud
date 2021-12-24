alter table INFORPRO_VISIT add column HOUR_SPEN integer ^
update INFORPRO_VISIT set HOUR_SPEN = 0 where HOUR_SPEN is null ;
alter table INFORPRO_VISIT alter column HOUR_SPEN set not null ;
