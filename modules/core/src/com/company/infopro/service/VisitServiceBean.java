package com.company.infopro.service;

import com.company.infopro.entity.Consumable;
import com.company.infopro.entity.Visit;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Objects;

@Service(VisitService.NAME)
public class VisitServiceBean implements VisitService {


    @Override
    public BigDecimal calculateAmount(Visit visit) {
        BigDecimal amount = BigDecimal.ZERO;
        if (null != visit.getConsumable() && !visit.getConsumable().isEmpty()) {
            for (Consumable consumable : visit.getConsumable()) {
                amount = amount.add(consumable.getPrice());
            }
        }

        if (null != visit.getHourSpent() && Objects.nonNull(visit.getVeterinarian())) {
            amount = amount.add(visit.getVeterinarian().getHourlyRate().multiply(new BigDecimal(visit.getHourSpent())));
        }
        return amount;
    }
}