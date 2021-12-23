package com.company.untitled.web.screens.visit;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled.entity.Visit;

@UiController("untitled_Visit.browse")
@UiDescriptor("visit-browse.xml")
@LookupComponent("visitsTable")
@LoadDataBeforeShow
public class VisitBrowse extends StandardLookup<Visit> {
}