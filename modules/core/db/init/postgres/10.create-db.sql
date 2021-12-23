-- begin UNTITLED_PET
create table UNTITLED_PET (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    TYPE_ID uuid not null,
    OWNER_ID uuid not null,
    --
    primary key (ID)
)^
-- end UNTITLED_PET
-- begin UNTITLED_PET_TYPE
create table UNTITLED_PET_TYPE (
    ID uuid,
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
    ID uuid,
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
-- begin UNTITLED_VISIT
create table UNTITLED_VISIT (
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
    HOUR_SPENT bigint not null,
    DESCIPTION text,
    AMOUNT decimal(19, 2) not null,
    PET_ID uuid not null,
    VATERINARIAN_ID uuid not null,
    --
    primary key (ID)
)^
-- end UNTITLED_VISIT
-- begin UNTITLED_CONSUMABLE
create table UNTITLED_CONSUMABLE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TITLE varchar(255) not null,
    DESCTIPTION text,
    PRICATE decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end UNTITLED_CONSUMABLE
-- begin UNTITLED_VETERINARIAN
create table UNTITLED_VETERINARIAN (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    USER_ID uuid not null,
    HOURLY_RATE decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end UNTITLED_VETERINARIAN
-- begin UNTITLED_VISIT_CONSUMABLE_LINK
create table UNTITLED_VISIT_CONSUMABLE_LINK (
    VISIT_ID uuid,
    CONSUMABLE_ID uuid,
    primary key (VISIT_ID, CONSUMABLE_ID)
)^
-- end UNTITLED_VISIT_CONSUMABLE_LINK
-- begin UNTITLED_PET_FOOD
create table UNTITLED_PET_FOOD (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    DESCRIPTION text,
    MANUFACTURE varchar(255) not null,
    PRICE decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end UNTITLED_PET_FOOD
