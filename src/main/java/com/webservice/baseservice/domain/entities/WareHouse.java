package com.webservice.baseservice.domain.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WareHouse extends BaseEntity {
    private String warehouseCode;
    @Column(length = 140, nullable=false)
    private String name;
    private Double globalVolume;
    private Double globalWeight;
    private Boolean isManaged;
    private Boolean useWarehousePacking;
    private Boolean ongoingInventory;

    @PrePersist
    public void onPrePersiste(){
        if(this.warehouseCode == null){
            this.setWarehouseCode("warehouseCode_"+ UUID.randomUUID().toString());
        }
        if(this.getId() == null){
            this.setId("wareHouse_"+UUID.randomUUID().toString());
        }
        this.setCreated_at(new Date());
    }
}

