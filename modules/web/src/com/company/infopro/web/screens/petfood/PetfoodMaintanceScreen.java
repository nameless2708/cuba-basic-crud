package com.company.infopro.web.screens.petfood;

import com.company.infopro.entity.PetFood;
import com.google.common.base.Strings;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.Form;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;

@UiController("inforpro_PetfoodMaintanceScreen")
@UiDescriptor("petfood-maintance-screen.xml")
@EditedEntityContainer("petFoodDc")
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
    @Inject
    private Button petFoodsTableEditBtn;
    @Inject
    private Button petFoodsTableRemoveBtn;
    @Inject
    private Table<PetFood> petFoodsTable;
    @Inject
    private CollectionContainer<PetFood> petFoodsDc;
    @Inject
    private TextField<String> textNameId;

    @Subscribe("petFoodsTableCreateBtn")
    public void onPetFoodsTableCreateBtnClick(Button.ClickEvent event) {
        enableModify(true, false);
        PetFood petFood = dataManager.create(PetFood.class);
        petFoodDc.setItem(petFood);
    }

    @Subscribe("petFoodsTableRemoveBtn")
    public void onPetFoodsTableRemove(Button.ClickEvent event) {
        dataManager.remove(petFoodsTable.getSingleSelected());
        petFoodsDl.load();
    }

    @Subscribe("petFoodsTableEditBtn")
    public void onPetFoodsTableEditBtnClick(Button.ClickEvent event) {
        enableModify(true, true);
        PetFood petFoodEdit = dataManager.load(PetFood.class).id(petFoodsTable.getSingleSelected().getId()).one();
        petFoodDc.setItem(petFoodEdit);
    }





    @Subscribe("petFoodsTable")
    public void onPetFoodsTableSelection(Table.SelectionEvent<PetFood> event) {
        if (event.getSelected() != null) {
            petFoodsTableEditBtn.setEnabled(true);
            petFoodsTableRemoveBtn.setEnabled(true);
        }
    }

    @Subscribe("saveBt")
    public void onSaveBtClick(Button.ClickEvent event) {
        dataManager.commit(petFoodDc.getItem());
        enableModify(false, false);
        petFoodDc.setItem(null);
        petFoodsDl.load();
    }


    @Subscribe("cancelBt")
    public void onCancelBtClick(Button.ClickEvent event) {
        enableModify(false, false);
    }

    @Subscribe("searchBtn")
    public void onSearchBtnClick(Button.ClickEvent event) {
        String textNameIdValue = textNameId.getValue();
        if (!Strings.isNullOrEmpty(textNameIdValue)) {
            petFoodsDl.setParameter("name", "(?i)%" + textNameIdValue + "%");
        } else{ petFoodsDl.removeParameter("name");}

        String manufactureNameIdValue = manufactureNameId.getValue();
        if (!Strings.isNullOrEmpty(manufactureNameIdValue)) {
            petFoodsDl.setParameter("manufacture", manufactureNameIdValue );
        } else{ petFoodsDl.removeParameter("manufacture");}

        petFoodsDl.load();
    }

    @Inject
    private TextField<String> manufactureNameId;

    private void enableModify(boolean enable, boolean isUpdate) {
        if (isUpdate) {
            saveBt.setCaption("Update");
        }
        petFoodForm.setVisible(enable);
        saveBt.setEnabled(enable);
        cancelBt.setEnabled(enable);
    }
}