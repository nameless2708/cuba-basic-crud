package com.company.untitled.web.screens.pettype;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled.entity.PetType;

@UiController("untitled_PetType.browse")
@UiDescriptor("pet-type-browse.xml")
@LookupComponent("petTypesTable")
@LoadDataBeforeShow
public class PetTypeBrowse extends StandardLookup<PetType> {
}