package com.webservice.baseservice.domain.entities;

import java.math.BigDecimal;
import java.util.Date;



import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@JsonInclude(Include.NON_NULL)
@Entity
@Table(name="CURRENCY")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Currency extends BaseEntity {

    @Id
    @Column(name="CURRENCY_CODE")
    private String currencyCode;

    @Column(name="NAME")
    private String name;

    @Column(name="RANK")
    private Integer rank;

    @Column(name="THERATE")
    private BigDecimal therate;

    @Column(name="LASTUPDATE")
    private Date lastupdate;


}