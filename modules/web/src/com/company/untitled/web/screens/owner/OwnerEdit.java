package com.company.untitled.web.screens.owner;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled.entity.Owner;

@UiController("untitled_Owner.edit")
@UiDescriptor("owner-edit.xml")
@EditedEntityContainer("ownerDc")
@LoadDataBeforeShow
public class OwnerEdit extends StandardEditor<Owner> {
}