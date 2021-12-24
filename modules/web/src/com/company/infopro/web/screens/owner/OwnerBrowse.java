package com.company.infopro.web.screens.owner;

import com.haulmont.cuba.gui.screen.*;
import com.company.infopro.entity.Owner;

@UiController("inforpro_Owner.browse")
@UiDescriptor("owner-browse.xml")
@LookupComponent("ownersTable")
@LoadDataBeforeShow
public class OwnerBrowse extends StandardLookup<Owner> {
}