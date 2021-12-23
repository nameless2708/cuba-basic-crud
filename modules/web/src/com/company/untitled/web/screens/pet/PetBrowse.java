package com.company.untitled.web.screens.pet;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled.entity.Pet;

@UiController("untitled_Pet.browse")
@UiDescriptor("pet-browse.xml")
@LookupComponent("petsTable")
@LoadDataBeforeShow
public class PetBrowse extends StandardLookup<Pet> {
}