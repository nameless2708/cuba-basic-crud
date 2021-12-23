alter table UNTITLED_PET add constraint FK_UNTITLED_PET_ON_TYPE foreign key (TYPE_ID) references UNTITLED_PET_TYPE(ID);
alter table UNTITLED_PET add constraint FK_UNTITLED_PET_ON_OWNER foreign key (OWNER_ID) references UNTITLED_OWNER(ID);
create index IDX_UNTITLED_PET_ON_TYPE on UNTITLED_PET (TYPE_ID);
create index IDX_UNTITLED_PET_ON_OWNER on UNTITLED_PET (OWNER_ID);
