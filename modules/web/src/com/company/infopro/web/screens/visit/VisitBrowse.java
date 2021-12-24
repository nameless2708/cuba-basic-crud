package com.company.infopro.web.screens.visit;

import com.haulmont.cuba.gui.screen.*;
import com.company.infopro.entity.Visit;

@UiController("inforpro_Visit.browse")
@UiDescriptor("visit-browse.xml")
@LookupComponent("visitsTable")
@LoadDataBeforeShow
public class VisitBrowse extends StandardLookup<Visit> {
}