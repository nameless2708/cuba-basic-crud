package com.company.untitled.web.screens.consumable;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled.entity.Consumable;

@UiController("untitled_Consumable.edit")
@UiDescriptor("consumable-edit.xml")
@EditedEntityContainer("consumableDc")
@LoadDataBeforeShow
public class ConsumableEdit extends StandardEditor<Consumable> {
}