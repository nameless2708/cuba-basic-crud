package com.company.untitled.web.screens.pettype;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled.entity.PetType;

@UiController("untitled_PetType.edit")
@UiDescriptor("pet-type-edit.xml")
@EditedEntityContainer("petTypeDc")
@LoadDataBeforeShow
public class PetTypeEdit extends StandardEditor<PetType> {
}