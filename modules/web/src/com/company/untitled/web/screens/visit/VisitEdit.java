package com.company.untitled.web.screens.visit;

import com.company.untitled.entity.Consumable;
import com.company.untitled.service.VisitService;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.untitled.entity.Visit;

import javax.inject.Inject;

@UiController("untitled_Visit.edit")
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
        if (event.getProperty().equals("hourSpent") || event.getProperty().equals("vaterinarian")){
            calculateAmount();
        }
    }



    
    
    private void calculateAmount(){
        Visit visit = getEditedEntity();
        visit.setAmount(visitService.calculateAmount(visit));
    }
}