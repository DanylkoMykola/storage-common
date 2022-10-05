package com.danylko.storagecommon.dto;


import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    private Long id;
    private String name;
    private BigDecimal cost;
    private Integer amount;
    private String storage;
}
