package com.webservice.baseservice.domain.dto.brand;


import lombok.*;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BrandDetails {
    private String id;
    private Long version;
    private Date created_at;
    private String brandCode;
    private String name;
    private Integer rank;


}
