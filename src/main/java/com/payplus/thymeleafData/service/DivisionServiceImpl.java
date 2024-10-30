package com.payplus.thymeleafData.service;

import com.payplus.thymeleafData.Model.Division;
import com.payplus.thymeleafData.repository.Division_repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DivisionServiceImpl implements DivisionService{
    private final Division_repository repository;
    @Override
    public Optional<Division> getDivisionByID(int division_id) {
        return Optional.ofNullable(repository.findById(division_id).orElseThrow(() ->
                new RuntimeException("id not found")));
    }
}
