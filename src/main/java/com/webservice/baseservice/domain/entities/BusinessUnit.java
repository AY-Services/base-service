package com.webservice.baseservice.domain.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;


@JsonInclude(Include.NON_NULL)
@Entity
@Table(name="BUSINESSUNIT")
public class BusinessUnit extends BaseEntity {
    @JoinColumn(name="COMPANY_ID", 	referencedColumnName="id")
    @OneToOne
    private Company company	;

    @Column(name="BUSINESSUNIT_CODE")
    private String businessUnitCode;

    @Column(name="NAME")
    private String name;

    @Column(name="RANK")
    private Integer rank;

    public BusinessUnit() {
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getBusinessUnitCode() {
        return businessUnitCode;
    }

    public void setBusinessUnitCode(String businessUnitCode) {
        this.businessUnitCode = businessUnitCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

}

