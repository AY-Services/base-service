package com.webservice.baseservice.domain.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table( name = "WAREHOUSE",
        uniqueConstraints={
                @UniqueConstraint(name="PK_WAREHOUSE_CODE", columnNames={"WAREHOUSE_CODE"})
        }
)
public class Warehouse extends BaseEntity {

    @Id
    @Column(name = "WAREHOUSE_CODE", nullable=false)
    @TableGenerator(name = "ControlTokenGenerator", table = "TOKENSERIE",
            pkColumnName = "TOKENSERIE_CODE", valueColumnName = "TOKEN", pkColumnValue = "ControlSerie")
    private String warehouseCode;

    @Column(name = "NAME", length = 140, nullable=false)
    private String name;


    @Column(name = "GLOBALVOLUME", nullable=false)
    private Double globalVolume;


    @Column(name = "GLOBALWEIGHT", nullable=false)
    private Double globalWeight;


    @Column(name = "ISMANAGED", nullable=false)
    private Boolean isManaged;


    @Column(name = "USE_WAREHOUSEPACKING", nullable=false)
    private Boolean useWarehousePacking;


    @JoinColumn(name="BRANCH_CODE",  referencedColumnName="branchCode")
    @OneToOne
    private Branch branch;

    @Column(name = "ONGOINGINVENTORY", nullable=false)
    private Boolean ongoingInventory;

}

