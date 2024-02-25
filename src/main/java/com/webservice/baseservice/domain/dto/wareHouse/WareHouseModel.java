package com.webservice.baseservice.domain.dto.wareHouse;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class WareHouseModel {
    private String warehouseCode;
    private String name;
    private Double globalVolume;
    private Double globalWeight;
    private Boolean isManaged;
    private Boolean useWarehousePacking;
    private Boolean ongoingInventory;

}

