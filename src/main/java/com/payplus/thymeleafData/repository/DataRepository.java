package com.payplus.thymeleafData.repository;

import com.payplus.thymeleafData.Model.Data;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

public interface DataRepository extends JpaRepository<Data, Long> {
    @Query("SELECT d FROM Data d WHERE " +
            "(:storeId IS NULL OR d.storeId = :storeId) AND " +
            "(:orderId IS NULL OR d.orderId = :orderId) AND " +
            "(:startDate IS NULL OR d.clickTime >= :startDate) AND " +
            "(:endDate IS NULL OR d.clickTime <= :endDate)")
    Page<Data> findByFilters(
            @Param("storeId") String storeId,
            @Param("orderId") String orderId,
            @Param("startDate") LocalDate startDate,
            @Param("endDate") LocalDate endDate,
            Pageable pageable
    );

}