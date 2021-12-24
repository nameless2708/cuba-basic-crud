package com.company.infopro.web.screens.pettype;

import com.haulmont.cuba.gui.screen.*;
import com.company.infopro.entity.PetType;

@UiController("inforpro_PetType.edit")
@UiDescriptor("pet-type-edit.xml")
@EditedEntityContainer("petTypeDc")
@LoadDataBeforeShow
public class PetTypeEdit extends StandardEditor<PetType> {
}