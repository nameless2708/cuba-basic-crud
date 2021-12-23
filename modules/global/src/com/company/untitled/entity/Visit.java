package com.company.untitled.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Table(name = "UNTITLED_VISIT")
@Entity(name = "untitled_Visit")
public class Visit extends StandardEntity {
    private static final long serialVersionUID = 3140416156820359861L;

    @NotNull
    @Column(name = "VISIT_DATE", nullable = false)
    private LocalDateTime visitDate;

    @Column(name = "HOUR_SPENT", nullable = false)
    @NotNull
    @Min(1)
    @Max(3)
    @Positive
    private Long hourSpent;

    @Lob
    @Column(name = "DESCIPTION")
    private String desciption;

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
    @JoinColumn(name = "VATERINARIAN_ID")
    private Veterinarian vaterinarian;

    @JoinTable(name = "UNTITLED_VISIT_CONSUMABLE_LINK",
            joinColumns = @JoinColumn(name = "VISIT_ID"),
            inverseJoinColumns = @JoinColumn(name = "CONSUMABLE_ID"))
    @ManyToMany
    private List<Consumable> consumable;

    public void setHourSpent(Long hourSpent) {
        this.hourSpent = hourSpent;
    }

    public Long getHourSpent() {
        return hourSpent;
    }

    public List<Consumable> getConsumable() {
        return consumable;
    }

    public void setConsumable(List<Consumable> consumable) {
        this.consumable = consumable;
    }

    public Veterinarian getVaterinarian() {
        return vaterinarian;
    }

    public void setVaterinarian(Veterinarian vaterinarian) {
        this.vaterinarian = vaterinarian;
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

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public LocalDateTime getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDateTime visitDate) {
        this.visitDate = visitDate;
    }
}