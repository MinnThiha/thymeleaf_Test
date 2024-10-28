package com.payplus.thymeleafData.service;

import com.payplus.thymeleafData.Model.Data;
import com.payplus.thymeleafData.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

@Service
public class DataService {

    @Autowired
    private DataRepository dataRepository;

    public Page<Data> searchWithFilters(Optional<String> storeId, Optional<String> orderId,
                                        Optional<LocalDate> startDate, Optional<LocalDate> endDate,
                                        Pageable pageable) {
        return dataRepository.findByFilters(
                storeId.orElse(null),
                orderId.orElse(null),
                startDate.orElse(null),
                endDate.orElse(null),
                pageable
        );
    }
}