package com.webservice.baseservice.domain.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@JsonInclude(Include.NON_NULL)
@Entity
@Table(name="COMPANY")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Company extends BaseEntity {
    @Column(name="COMPANY_CODE")
    private String companyCode;

    @JoinColumn(name="CURRENCY_CODE", 	referencedColumnName="CURRENCY_CODE")
    @OneToOne
    private Currency currency	;

    @Column(name="NAME")
    private String name;

    @Column(name="RANK")
    private Integer rank;


}

