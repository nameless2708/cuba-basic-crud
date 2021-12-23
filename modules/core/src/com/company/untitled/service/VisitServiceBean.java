package com.company.untitled.service;

import com.company.untitled.entity.Consumable;
import com.company.untitled.entity.Visit;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service(VisitService.NAME)
public class VisitServiceBean implements VisitService {

    @Override
    public BigDecimal calculateAmount(Visit visit) {
        BigDecimal amount = BigDecimal.ZERO;

        if (null != visit.getConsumable() && !visit.getConsumable().isEmpty()){
            for (Consumable consumable : visit.getConsumable()){
                amount = amount.add(consumable.getPricate());
            }
        }

        if (null != visit.getHourSpent() && null != visit.getVaterinarian()){
            amount = amount.add(visit.getVaterinarian().getHourlyRate().multiply(new BigDecimal(visit.getHourSpent())));
        }
        return amount;
    }
}