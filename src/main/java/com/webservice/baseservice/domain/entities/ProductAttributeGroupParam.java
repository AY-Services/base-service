package com.webservice.baseservice.domain.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name="PRODUCTATTRIBUTEGROUPPARAM")
public class ProductAttributeGroupParam extends BaseEntity {

    @Id
    @Column(name="PRODUCTATTRIBUTEGROUPPARAM_Code")
    private String productAttributeGroupParamCode;

    @Column(name="ALTERNATEGROUPISACTIVE")
    private Boolean alternateGroupIsActive;

    @Column(name="NAME")
    private String name;

}