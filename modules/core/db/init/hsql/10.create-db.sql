-- begin UNTITLED_PET
create table UNTITLED_PET (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    TYPE_ID varchar(36) not null,
    OWNER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end UNTITLED_PET
-- begin UNTITLED_PET_TYPE
create table UNTITLED_PET_TYPE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end UNTITLED_PET_TYPE
-- begin UNTITLED_OWNER
create table UNTITLED_OWNER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    EMAIL varchar(255),
    PHONE_NUMBER varchar(255) not null,
    --
    primary key (ID)
)^
-- end UNTITLED_OWNER
