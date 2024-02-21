package com.webservice.baseservice.domain.dto;

import lombok.*;
import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RoleDetails {
    private String id;
    private String description;
    private BigDecimal price;
    private Date created_at;
}
