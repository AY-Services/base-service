package com.webservice.baseservice.domain.entities;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Partner extends BaseEntity {
    private String partnerCode;
    private String name;
    @JoinColumn(referencedColumnName="id")
    @OneToOne
    private Partner upPartner;
    private String barcode;
    private String fiscalId;
    private String type;
    private String StatusCode;
    private String notes;
    /*@JoinColumn(name="GEOAREA_CODE", referencedColumnName="GEOAREA_CODE")
    @OneToOne
    private GeoArea geoArea;*/
    private Integer rank;
    private String num;
    private String streetName;
    private String extendedAddress;
    private String postalCode;
    private String city;
    private String state;
    private String country;
    private String phone1;
    private String phone2;
    private String fax;
    private String email;
    private String webAddress;
    /*@JoinColumn(name="ROLE_CODE", referencedColumnName="ROLE_CODE")
    @OneToOne
    protected Role role;*/
    /*@JoinColumn(name="CREATEDBYPERSON_ID", referencedColumnName="id")
    @OneToOne
    protected Person createdByPerson;
    @JoinColumn(name="CURRENCY_CODE", referencedColumnName="CURRENCY_CODE")
    @OneToOne
    private Currency currency;
    @JoinColumn(name="PAYMENTTERM_CODE", referencedColumnName="PAYMENTTERM_CODE")
    @OneToOne
    protected PaymentTerm paymentTerm;*/
    private String arabicName;
    private Double loyaltyProgramScore;
    private Boolean hold;
    private String holdReason;
    private Boolean common;
    private Date lastOrderDate;
    @JoinColumn(referencedColumnName="id")
    @OneToOne
    private WareHouse warehouse;
    @JoinColumn(referencedColumnName="id")
    @OneToOne
    private Bank bank;
    @Transient
    private List<Document> documents;
    @OneToMany
    private List<Product> productList;

    @PrePersist
    private void onPrePersist(){
        if(this.getId()== null){
            this.setId("partner_"+ UUID.randomUUID().toString());
        }
        this.setCreated_at(new Date());
    }
}
