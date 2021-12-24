package com.company.infopro.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;

@Table(name = "INFORPRO_VETERINARIAN")
@Entity(name = "inforpro_Veterinarian")
public class Veterinarian extends StandardEntity {
    private static final long serialVersionUID = 3013417100601875617L;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID")
    private User user;

    @NotNull
    @Column(name = "HOURLY_RATE", nullable = false)
    @PositiveOrZero
    @DecimalMin("10")
    @DecimalMax("150")
    private BigDecimal hourlyRate;

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}