package com.company.infopro.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Table(name = "INFORPRO_VISIT")
@Entity(name = "inforpro_Visit")
@NamePattern("%s|description")
public class Visit extends StandardEntity {
    private static final long serialVersionUID = 3278497692090618698L;

    @NotNull
    @Column(name = "VISIT_DATE", nullable = false)
    private LocalDateTime visitDate;

    @NotNull
    @Column(name = "HOUR_SPEN", nullable = false)
    @Positive
    @Min(1)
    @Max(3)
    private Integer hourSpent;

    @Lob
    @Column(name = "DESCRIPTION")
    private String description;

    @NotNull
    @Column(name = "AMOUNT", nullable = false)
    @PositiveOrZero
    private BigDecimal amount;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PET_ID")
    private Pet pet;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "VETERINARIAN_ID")
    private Veterinarian veterinarian;

    @JoinTable(name = "INFORPRO_VISIT_CONSUMABLE_LINK",
            joinColumns = @JoinColumn(name = "VISIT_ID"),
            inverseJoinColumns = @JoinColumn(name = "CONSUMABLE_ID"))
    @ManyToMany
    private List<Consumable> consumable;

    public Integer getHourSpent() {
        return hourSpent;
    }

    public void setHourSpent(Integer hourSpent) {
        this.hourSpent = hourSpent;
    }

    public List<Consumable> getConsumable() {
        return consumable;
    }

    public void setConsumable(List<Consumable> consumable) {
        this.consumable = consumable;
    }

    public Veterinarian getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(Veterinarian veterinarian) {
        this.veterinarian = veterinarian;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDateTime visitDate) {
        this.visitDate = visitDate;
    }
}