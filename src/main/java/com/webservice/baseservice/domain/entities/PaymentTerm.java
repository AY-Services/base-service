package com.webservice.baseservice.domain.entities;



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
@Table(name="PAYMENTTERM")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentTerm extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="PAYMENTTERM_CODE")
    private String paymentTermCode;

    @Column(name="DISCOUNT")
    private Double discount;

    @Column(name="FIXEDTAXAPPLYABLE")
    private Boolean fixedTaxApplyable;

    @Column(name="FIXEDTAXMAXIMUM")
    private Double fixedTaxMaximum;

    @Column(name="FIXEDTAXMINIMUM")
    private Double fixedTaxMinimum;

    @Column(name="FIXEDTAXRATE")
    private Double fixedTaxRate;

    @Column(name="FIXEDTAXROUNDINGDECIMAL")
    private Integer fixedTaxRoundingDecimal;

    @Column(name="IMPACTFINANCIALBALANCE")
    private Boolean impactFinancialBalance;

    @Column(name="MAXIMUMAMOUNT")
    private Double maximumAmount;

    @Column(name="MINIMUMAMOUNT")
    private Double minimumAmount;

    @Column(name="NAME")
    private String name;

    @Column(name="RANK")
    private Integer rank;



}