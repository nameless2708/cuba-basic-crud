package com.company.infopro.web.screens.petfood;

import com.company.infopro.entity.PetFood;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.Form;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;

@UiController("inforpro_PetfoodMaintanceScreen")
@UiDescriptor("petfood-maintance-screen.xml")
@LoadDataBeforeShow
public class PetfoodMaintanceScreen extends Screen {

    @Inject
    private Form petFoodForm;

    @Inject
    private Button saveBt;

    @Inject
    private Button cancelBt;

    @Inject
    private DataManager dataManager;

    @Inject
    private InstanceContainer<PetFood> petFoodDc;

    @Inject
    private CollectionLoader<PetFood> petFoodsDl;

    @Subscribe("petFoodsTableCreateBtn")
    public void onPetFoodsTableCreateBtnClick(Button.ClickEvent event) {
        enableEdit(true);
        PetFood petFood = dataManager.create(PetFood.class);
        petFoodDc.setItem(petFood);
    }


    @Subscribe("saveBt")
    public void onSaveBtClick(Button.ClickEvent event) {
        dataManager.commit(petFoodDc.getItem());
        enableEdit(false);
        petFoodDc.setItem(null);
        petFoodsDl.load();
    }

    @Subscribe("cancelBt")
    public void onCancelBtClick(Button.ClickEvent event) {
        enableEdit(false);
    }

    private void enableEdit(boolean enable) {
        petFoodForm.setEditable(true);
        saveBt.setEnabled(true);
        cancelBt.setEnabled(true);
    }
}