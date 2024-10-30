package com.payplus.thymeleafData.controller;

import com.payplus.thymeleafData.Model.Division;
import com.payplus.thymeleafData.service.DivisionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class Division_controller {
    private final DivisionService service;

    @GetMapping("/divisionData/{division_id}")
    @ResponseBody
    public ResponseEntity<Optional<Division>> getDivisionById(
            @PathVariable("division_id") int division_id
    ){
        return ResponseEntity.ok(service.getDivisionByID(division_id));
    }

    @GetMapping("/division")
    public String divisionPage() {
        return "division"; // Render division.html via Thymeleaf
    }

}
