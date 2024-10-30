package com.payplus.thymeleafData.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cbip_tbl_division")
public class Division {

    @Id
    private int division_id;
    private String description;
    private String division_code;
}
