package com.company.infopro.web.screens.pettype;

import com.haulmont.cuba.gui.screen.*;
import com.company.infopro.entity.PetType;

@UiController("inforpro_PetType.browse")
@UiDescriptor("pet-type-browse.xml")
@LookupComponent("petTypesTable")
@LoadDataBeforeShow
public class PetTypeBrowse extends StandardLookup<PetType> {
}