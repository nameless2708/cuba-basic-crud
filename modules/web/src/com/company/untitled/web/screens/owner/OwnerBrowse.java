package com.company.untitled.web.screens.owner;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled.entity.Owner;

@UiController("untitled_Owner.browse")
@UiDescriptor("owner-browse.xml")
@LookupComponent("ownersTable")
@LoadDataBeforeShow
public class OwnerBrowse extends StandardLookup<Owner> {
}