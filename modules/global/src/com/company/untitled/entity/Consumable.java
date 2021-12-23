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

@Table(name = "UNTITLED_CONSUMABLE")
@Entity(name = "untitled_Consumable")
@NamePattern("%s|title")
public class Consumable extends StandardEntity {
    private static final long serialVersionUID = 1024204296510519304L;

    @NotNull
    @Column(name = "TITLE", nullable = false, unique = true)
    private String title;

    @Lob
    @Column(name = "DESCTIPTION")
    private String desctiption;

    @NotNull
    @Column(name = "PRICATE", nullable = false)
    @PositiveOrZero
    private BigDecimal pricate;

    public BigDecimal getPricate() {
        return pricate;
    }

    public void setPricate(BigDecimal pricate) {
        this.pricate = pricate;
    }

    public String getDesctiption() {
        return desctiption;
    }

    public void setDesctiption(String desctiption) {
        this.desctiption = desctiption;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}