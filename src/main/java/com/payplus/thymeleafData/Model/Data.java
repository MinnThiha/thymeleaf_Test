package com.payplus.thymeleafData.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Entity
@Getter
@Setter
public class Data {
    @Id
    private long id;
    private String storeId;
    private String orderId;
    @Column(name = "click_time") // Adjust column name to match your table
    private LocalDate clickTime;
}
