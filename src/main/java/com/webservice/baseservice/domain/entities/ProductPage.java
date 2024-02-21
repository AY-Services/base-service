package com.webservice.baseservice.domain.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name="PRODUCTPAGE")
public class ProductPage extends BaseEntity {

    @Id
    @Column(name="PRODUCTPAGE_CODE")
    private String productPageCode;

    @Column(name="APOS")
    private Boolean apos;

    @Column(name="BONUS")
    private Boolean bonus;

    @Column(name="CONSIGNMENT")
    private Boolean consignment;

    @Column(name="FACINGABLE")
    private Boolean facingable;

    @Column(name="FREEGOOD")
    private Boolean freegood;

    @Column(name="INVENTORYABLE")
    private Boolean inventoryable;

    @Column(name="INVENTORYABLE2")
    private Boolean inventoryable2;

    @Column(name="INVENTORYABLE3")
    private Boolean inventoryable3;

    @Column(name="LOADABLE")
    private Boolean loadable;

    @Column(name="NAME")
    private String name;

    @Column(name="PRESENCECHECKABLE")
    private Boolean presenceCheckable;

    @Column(name="PRESENCECHECKABLE2")
    private Boolean presenceCheckable2;

    @Column(name="RANK")
    private Integer rank;

    @Column(name="SALABLE")
    private Boolean salable;

}