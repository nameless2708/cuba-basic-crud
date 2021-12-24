package com.company.infopro.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;
import java.util.List;

@Table(name = "INFORPRO_CONSUMABLE")
@Entity(name = "inforpro_Consumable")
@NamePattern("%s|title")
public class Consumable extends StandardEntity {
    private static final long serialVersionUID = -5249109964017377325L;

    @NotNull
    @Column(name = "TITLE", nullable = false, unique = true)
    private String title;

    @Column(name = "DESCRIPTION")
    private String description;

    @NotNull
    @Column(name = "PRICE", nullable = false)
    @PositiveOrZero
    private BigDecimal price;

    @JoinTable(name = "INFORPRO_VISIT_CONSUMABLE_LINK",
            joinColumns = @JoinColumn(name = "CONSUMABLE_ID"),
            inverseJoinColumns = @JoinColumn(name = "VISIT_ID"))
    @ManyToMany
    private List<Visit> visits;

    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}