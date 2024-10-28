package com.payplus.thymeleafData.controller;

import com.payplus.thymeleafData.Model.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.payplus.thymeleafData.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

@Controller
public class Search_controller {

    @Autowired
    private DataService dataService;

    @GetMapping("/search")
    public String searchData(
            @RequestParam Optional<String> storeId,
            @RequestParam Optional<String> orderId,
            @RequestParam Optional<LocalDate> startDate,
            @RequestParam Optional<LocalDate> endDate,
            @RequestParam(defaultValue = "0") int page,
            Model model) {

        // Define the pagination
        Pageable pageable = PageRequest.of(page, 10); // 10 items per page

        // Fetch data based on filters (adapt to your data repository)
        Page<Data> dataPage = dataService.searchWithFilters(storeId, orderId, startDate, endDate, pageable);

        // Add attributes to the model for Thymeleaf
        model.addAttribute("dataList", dataPage.getContent());
        model.addAttribute("page", dataPage);
        model.addAttribute("totalElements", dataPage.getTotalElements());

        return "search";
    }
}
