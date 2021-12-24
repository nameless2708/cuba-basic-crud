package com.company.infopro.web.screens.owner;

import com.haulmont.cuba.gui.screen.*;
import com.company.infopro.entity.Owner;

@UiController("inforpro_Owner.edit")
@UiDescriptor("owner-edit.xml")
@EditedEntityContainer("ownerDc")
@LoadDataBeforeShow
public class OwnerEdit extends StandardEditor<Owner> {
}