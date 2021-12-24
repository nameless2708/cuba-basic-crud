package com.company.infopro.web.screens.consumable;

import com.haulmont.cuba.gui.screen.*;
import com.company.infopro.entity.Consumable;

@UiController("inforpro_Consumable.browse")
@UiDescriptor("consumable-browse.xml")
@LookupComponent("consumablesTable")
@LoadDataBeforeShow
public class ConsumableBrowse extends StandardLookup<Consumable> {
}