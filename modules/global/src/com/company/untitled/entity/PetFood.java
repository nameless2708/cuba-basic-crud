package com.company.untitled.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;

@Table(name = "UNTITLED_PET_FOOD")
@Entity(name = "untitled_PetFood")
@NamePattern("%s|name")
public class PetFood extends StandardEntity {
    private static final long serialVersionUID = 7337996825653906320L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @Lob
    @Column(name = "DESCRIPTION")
    private String description;

    @NotNull
    @Column(name = "MANUFACTURE", nullable = false)
    private String manufacture;

    @Column(name = "PRICE", nullable = false)
    @NotNull
    @PositiveOrZero
    private BigDecimal price;

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}