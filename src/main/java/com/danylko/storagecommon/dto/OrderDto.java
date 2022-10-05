package com.danylko.storagecommon.dto;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    private Long id;
    private String products;
    private BigDecimal price;
    private LocalDateTime orderDate;
    private CustomerDto customer;
    private Map<Integer, Integer> productAmount;
}
