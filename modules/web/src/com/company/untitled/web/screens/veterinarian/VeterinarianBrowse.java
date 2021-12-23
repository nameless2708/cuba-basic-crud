package com.company.untitled.web.screens.veterinarian;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled.entity.Veterinarian;

@UiController("untitled_Veterinarian.browse")
@UiDescriptor("veterinarian-browse.xml")
@LookupComponent("veterinariansTable")
@LoadDataBeforeShow
public class VeterinarianBrowse extends StandardLookup<Veterinarian> {
}