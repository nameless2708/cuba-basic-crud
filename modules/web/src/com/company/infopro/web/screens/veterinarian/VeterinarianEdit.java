package com.company.infopro.web.screens.veterinarian;

import com.haulmont.cuba.gui.screen.*;
import com.company.infopro.entity.Veterinarian;

@UiController("inforpro_Veterinarian.edit")
@UiDescriptor("veterinarian-edit.xml")
@EditedEntityContainer("veterinarianDc")
@LoadDataBeforeShow
public class VeterinarianEdit extends StandardEditor<Veterinarian> {
}