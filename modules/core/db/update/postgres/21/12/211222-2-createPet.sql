alter table INFORPRO_PET add constraint FK_INFORPRO_PET_ON_TYPE foreign key (TYPE_ID) references INFORPRO_PET_TYPE(ID);
alter table INFORPRO_PET add constraint FK_INFORPRO_PET_ON_OWNER foreign key (OWNER_ID) references INFORPRO_OWNER(ID);
create index IDX_INFORPRO_PET_ON_TYPE on INFORPRO_PET (TYPE_ID);
create index IDX_INFORPRO_PET_ON_OWNER on INFORPRO_PET (OWNER_ID);
