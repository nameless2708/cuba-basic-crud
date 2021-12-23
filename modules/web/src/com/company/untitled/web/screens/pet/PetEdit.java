package com.company.untitled.web.screens.pet;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled.entity.Pet;

@UiController("untitled_Pet.edit")
@UiDescriptor("pet-edit.xml")
@EditedEntityContainer("petDc")
@LoadDataBeforeShow
public class PetEdit extends StandardEditor<Pet> {
}