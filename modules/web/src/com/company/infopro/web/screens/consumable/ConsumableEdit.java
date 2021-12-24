package com.company.infopro.web.screens.consumable;

import com.haulmont.cuba.gui.screen.*;
import com.company.infopro.entity.Consumable;

@UiController("inforpro_Consumable.edit")
@UiDescriptor("consumable-edit.xml")
@EditedEntityContainer("consumableDc")
@LoadDataBeforeShow
public class ConsumableEdit extends StandardEditor<Consumable> {
}