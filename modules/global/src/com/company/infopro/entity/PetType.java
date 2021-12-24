package com.company.infopro.entity;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Table(name = "INFORPRO_PET_TYPE")
@Entity(name = "inforpro_PetType")
@NamePattern("%s|name")
public class PetType extends StandardEntity {
    private static final long serialVersionUID = -5033014854716474913L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @Transient
    @MetaProperty
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}