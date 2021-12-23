package com.company.untitled.web.screens.consumable;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled.entity.Consumable;

@UiController("untitled_Consumable.browse")
@UiDescriptor("consumable-browse.xml")
@LookupComponent("consumablesTable")
@LoadDataBeforeShow
public class ConsumableBrowse extends StandardLookup<Consumable> {
}