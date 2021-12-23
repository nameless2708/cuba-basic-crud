package com.company.untitled.service;

import com.company.untitled.entity.Visit;

import java.math.BigDecimal;

public interface VisitService {
    String NAME = "untitled_VisitService";

    public BigDecimal calculateAmount(Visit visit);
}