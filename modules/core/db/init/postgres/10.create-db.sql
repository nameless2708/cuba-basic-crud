-- begin INFORPRO_PET_TYPE
create table INFORPRO_PET_TYPE (
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
-- end INFORPRO_PET_TYPE
-- begin INFORPRO_VISIT
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
    HOUR_SPEN integer not null,
    DESCRIPTION text,
    AMOUNT decimal(19, 2) not null,
    PET_ID uuid not null,
    VETERINARIAN_ID uuid not null,
    --
    primary key (ID)
)^
-- end INFORPRO_VISIT
-- begin INFORPRO_VETERINARIAN
create table INFORPRO_VETERINARIAN (
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
-- end INFORPRO_VETERINARIAN
-- begin INFORPRO_PET
create table INFORPRO_PET (
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
    OWNER_ID uuid,
    --
    primary key (ID)
)^
-- end INFORPRO_PET
-- begin INFORPRO_OWNER
create table INFORPRO_OWNER (
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
    EMAIL varchar(255) not null,
    PHONE_NUMBER varchar(255) not null,
    --
    primary key (ID)
)^
-- end INFORPRO_OWNER
-- begin INFORPRO_CONSUMABLE
create table INFORPRO_CONSUMABLE (
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
    DESCRIPTION varchar(255),
    PRICE decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end INFORPRO_CONSUMABLE
-- begin INFORPRO_VISIT_CONSUMABLE_LINK
create table INFORPRO_VISIT_CONSUMABLE_LINK (
    CONSUMABLE_ID uuid,
    VISIT_ID uuid,
    primary key (CONSUMABLE_ID, VISIT_ID)
)^
-- end INFORPRO_VISIT_CONSUMABLE_LINK
-- begin INFORPRO_PET_FOOD
create table INFORPRO_PET_FOOD (
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
-- end INFORPRO_PET_FOOD
