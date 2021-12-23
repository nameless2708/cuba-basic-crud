alter table UNTITLED_VISIT add constraint FK_UNTITLED_VISIT_ON_PET foreign key (PET_ID) references UNTITLED_PET(ID);
alter table UNTITLED_VISIT add constraint FK_UNTITLED_VISIT_ON_VATERINARIAN foreign key (VATERINARIAN_ID) references UNTITLED_VETERINARIAN(ID);
create index IDX_UNTITLED_VISIT_ON_PET on UNTITLED_VISIT (PET_ID);
create index IDX_UNTITLED_VISIT_ON_VATERINARIAN on UNTITLED_VISIT (VATERINARIAN_ID);