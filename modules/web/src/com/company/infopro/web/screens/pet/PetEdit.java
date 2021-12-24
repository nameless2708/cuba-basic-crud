package com.company.infopro.web.screens.pet;

import com.haulmont.cuba.gui.screen.*;
import com.company.infopro.entity.Pet;

@UiController("inforpro_Pet.edit")
@UiDescriptor("pet-edit.xml")
@EditedEntityContainer("petDc")
@LoadDataBeforeShow
public class PetEdit extends StandardEditor<Pet> {
}