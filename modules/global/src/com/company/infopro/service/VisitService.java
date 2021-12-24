package com.company.infopro.service;

import com.company.infopro.entity.Visit;

import java.math.BigDecimal;

public interface VisitService {
    String NAME = "inforpro_VisitService";

    BigDecimal calculateAmount(Visit visit);
}