package com.company.untitled.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "UNTITLED_OWNER")
@Entity(name = "untitled_Owner")
@NamePattern("%s ( %s )|name,phoneNumber")
public class Owner extends StandardEntity {
    private static final long serialVersionUID = 5624690640100814295L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "EMAIL")
    private String email;

    @NotNull
    @Column(name = "PHONE_NUMBER", nullable = false)
    private String phoneNumber;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "owner")
    private Pet pet;

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}