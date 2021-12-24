create table INFORPRO_VISIT_CONSUMABLE_LINK (
    CONSUMABLE_ID uuid,
    VISIT_ID uuid,
    primary key (CONSUMABLE_ID, VISIT_ID)
);
