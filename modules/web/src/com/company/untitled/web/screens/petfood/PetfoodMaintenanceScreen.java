package com.company.untitled.web.screens.petfood;

import com.company.untitled.entity.PetFood;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Collection;

@UiController("untitled_PetfoodMaintenanceScreen")
@UiDescriptor("petfood-maintenance-screen.xml")
@LoadDataBeforeShow
public class PetfoodMaintenanceScreen extends Screen {
    @Inject
    private Form petFoodForm;

    @Inject
    private Button saveBtn;

    @Inject
    private Button cancelBtn;

    @Inject
    private DataManager dataManager;

    @Inject
    private InstanceContainer<PetFood> petFoodDc;

    @Inject
    private CollectionLoader<PetFood> petFoodsDl;

    @Inject
    private Table<PetFood> petFoodsTable;

    @Inject
    private Button petFoodsTableRemoveBtn;

    @Inject
    private Button petFoodsTableEditBtn;

    @Subscribe("petFoodsTableCreateBtn")
    public void onPetFoodsTableCreateBtnClick(Button.ClickEvent event) {
        enableEdit(true);
        PetFood petFood = dataManager.create(PetFood.class);
        petFoodDc.setItem(petFood);
    }

    @Subscribe("cancelBtn")
    public void onCancelBtnClick(Button.ClickEvent event) {
        enableEdit(false);
    }

    @Subscribe("saveBtn")
    public void onSaveBtnClick(Button.ClickEvent event) {
        dataManager.commit(petFoodDc.getItem());
//        getScreenData().getDataContext().commit();
        petFoodDc.setItem(null);
        petFoodsDl.load();
        enableEdit(false);
    }

    @Subscribe("petFoodsTable")
    public void onPetFoodsTableSelection(Table.SelectionEvent<PetFood> event) {
        enableTableBtn(true);
    }


    @Subscribe("petFoodsTableRemoveBtn")
    public void onPetFoodsTableRemoveBtnClick(Button.ClickEvent event) {
        PetFood petFood = dataManager.load(PetFood.class)
                .id(petFoodsTable.getSingleSelected().getId()).one();
        dataManager.remove(petFood);
        petFoodsDl.load();
    }

    @Subscribe("petFoodsTableEditBtn")
    public void onPetFoodsTableEditBtnClick(Button.ClickEvent event) {
        enableEdit(true);
        PetFood petFood = dataManager.load(PetFood.class)
                .id(petFoodsTable.getSingleSelected().getId()).one();
        petFoodDc.setItem(petFood);
    }

    public void enableEdit(boolean enable){
        petFoodForm.setEditable(enable);
        saveBtn.setEnabled(enable);
        cancelBtn.setEnabled(enable);
    }

    private void enableTableBtn(boolean enable){
        petFoodsTableEditBtn.setEnabled(enable);
        petFoodsTableRemoveBtn.setEnabled(enable);
    }


}