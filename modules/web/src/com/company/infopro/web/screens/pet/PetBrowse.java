package com.company.infopro.web.screens.pet;

import com.haulmont.cuba.gui.screen.*;
import com.company.infopro.entity.Pet;

@UiController("inforpro_Pet.browse")
@UiDescriptor("pet-browse.xml")
@LookupComponent("petsTable")
@LoadDataBeforeShow
public class PetBrowse extends StandardLookup<Pet> {
}