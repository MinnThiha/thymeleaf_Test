package com.payplus.thymeleafData.service;

import com.payplus.thymeleafData.Model.Division;

import java.util.Optional;

public interface DivisionService {
    Optional<Division> getDivisionByID(int division_id);

}
