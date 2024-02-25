package com.webservice.baseservice.domain.dto.partner;

import com.webservice.baseservice.domain.entities.Bank;
import com.webservice.baseservice.domain.entities.Document;
import com.webservice.baseservice.domain.entities.Product;
import com.webservice.baseservice.domain.entities.WareHouse;
import lombok.*;

import java.util.Date;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PartnerModel{
    private String partnerCode;
    private String name;

    private PartnerDetails upPartner;
    private String barcode;
    private String fiscalId;
    private String type;
    private String StatusCode;
    private String notes;
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
    private String arabicName;
    private Double loyaltyProgramScore;
    private Boolean hold;
    private String holdReason;
    private Boolean common;
    private Date lastOrderDate;
    private WareHouse warehouse;

    private Bank bank;

    private List<Document> documents;

    private List<Product> productList;

}
