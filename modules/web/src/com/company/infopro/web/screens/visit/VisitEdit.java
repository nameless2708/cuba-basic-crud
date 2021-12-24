package com.company.infopro.web.screens.visit;

import com.company.infopro.entity.Consumable;
import com.company.infopro.service.VisitService;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.infopro.entity.Visit;

import javax.inject.Inject;
import java.util.Objects;

@UiController("inforpro_Visit.edit")
@UiDescriptor("visit-edit.xml")
@EditedEntityContainer("visitDc")
@LoadDataBeforeShow
public class VisitEdit extends StandardEditor<Visit> {
    @Inject
    protected VisitService visitService;

    @Subscribe(id = "consumableDc", target = Target.DATA_CONTAINER)
    public void onConsumableDcCollectionChange(CollectionContainer.CollectionChangeEvent<Consumable> event) {
        calculateAmount();
    }

    @Subscribe(id = "visitDc", target = Target.DATA_CONTAINER)
    public void onVisitDcItemPropertyChange(InstanceContainer.ItemPropertyChangeEvent<Visit> event) {
        String property = event.getProperty();
        if (property.equals("hourSpent") || property.equals("veterinarian")) {
            calculateAmount();
        }
    }


    
    

    private void calculateAmount() {
        Visit visit = getEditedEntity();
        visit.setAmount(visitService.calculateAmount(visit));
    }
}