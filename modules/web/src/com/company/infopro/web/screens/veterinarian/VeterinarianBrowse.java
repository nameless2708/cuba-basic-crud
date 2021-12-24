package com.company.infopro.web.screens.veterinarian;

import com.haulmont.cuba.gui.screen.*;
import com.company.infopro.entity.Veterinarian;

@UiController("inforpro_Veterinarian.browse")
@UiDescriptor("veterinarian-browse.xml")
@LookupComponent("veterinariansTable")
@LoadDataBeforeShow
public class VeterinarianBrowse extends StandardLookup<Veterinarian> {
}