package com.webservice.baseservice.domain.dto.wareHouse;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class WareHouseDetails {
    private String id;
    private Long version;
    private Date created_at;
    private String warehouseCode;
    private String name;
    private Double globalVolume;
    private Double globalWeight;
    private Boolean isManaged;
    private Boolean useWarehousePacking;
    private Boolean ongoingInventory;

}

