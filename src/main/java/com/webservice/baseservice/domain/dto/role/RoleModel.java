package com.webservice.baseservice.domain.dto.role;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RoleModel {
    private String description;
    private BigDecimal price;
}