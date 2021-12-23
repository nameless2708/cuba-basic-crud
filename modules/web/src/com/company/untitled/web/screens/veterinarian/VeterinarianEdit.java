package com.company.untitled.web.screens.veterinarian;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled.entity.Veterinarian;

@UiController("untitled_Veterinarian.edit")
@UiDescriptor("veterinarian-edit.xml")
@EditedEntityContainer("veterinarianDc")
@LoadDataBeforeShow
public class VeterinarianEdit extends StandardEditor<Veterinarian> {
}