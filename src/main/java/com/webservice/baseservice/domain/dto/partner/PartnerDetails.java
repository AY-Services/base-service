package com.webservice.baseservice.domain.dto.partner;

import com.webservice.baseservice.domain.dto.bank.BankDetails;
import com.webservice.baseservice.domain.dto.document.DocumentDetails;
import com.webservice.baseservice.domain.dto.product.ProductDetails;
import com.webservice.baseservice.domain.dto.wareHouse.WareHouseDetails;
import lombok.*;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PartnerDetails {
    private String id;
    private Long version;
    private Date created_at;
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
    private WareHouseDetails warehouse;
    private BankDetails bank;
    private List<DocumentDetails> documents;
    private List<ProductDetails> productList;

}
