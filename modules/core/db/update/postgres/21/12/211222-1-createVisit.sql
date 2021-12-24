create table INFORPRO_VISIT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    VISIT_DATE timestamp not null,
    DESCRIPTION text,
    AMOUNT decimal(19, 2) not null,
    PET_ID uuid not null,
    VETERINARIAN_ID uuid not null,
    --
    primary key (ID)
);