package com.webservice.baseservice.domain.entities;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name="VAT")
public class Vat extends BaseEntity {

    @Id
    @Column(name="VAT_CODE")
    private String vatCode;

    @Column(name="NAME")
    private String name;

    @Column(name="RANK")
    private Integer rank;

    @Column(name="VATRATE")
    private Double vatRate;

}