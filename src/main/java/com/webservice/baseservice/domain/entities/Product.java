package com.webservice.baseservice.domain.entities;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product extends BaseEntity {

    private String productCode	;
    private String name;
    private String description	;
    private Integer rank;
    private Double salesPrice;
    private Double purchasePrice;
    private Double returnPrice;
    private String currencyCode;
    @JoinColumn(referencedColumnName="id")
    @OneToOne
    private Brand brand;
    private Boolean hold;
    private String holdReason;
    private Integer purchasePacking;
    private Integer loadPacking;
    private Integer salesPacking;
    private Boolean loadable;
    private Boolean salable;
    private Boolean returnable;
    private Boolean expirable;
    private Boolean inventory;
    private Boolean presenceCheckable;
    private Boolean virtualProduct;
    private Boolean assetProduct;
    private Integer promoSequence;
    private Double promoRate;
    private Double weight;
    private Double volume;
    private Double facingFactor;
    private Double statUnitRate;
    private String colorCode;
    private Integer decimalPrecision;
    private String barcode;
    private String unitCode;
    private Double targetUnitRate;
    @Transient
    private byte[]	photo;
    @Transient
    private String productCategoryCode;
    @Transient
    private String productCategoryTypeCode;
    @Transient
    private Double availableQuantity;
    @Transient
    private Double damagedQuantity;
    @Transient
    private String photoUrl;
    @ManyToOne
    private Partner partner;

    @PrePersist
    private void onPrePersist(){
        if(this.getId()== null){
            this.setId("product_"+ UUID.randomUUID().toString());
        }
        this.setCreated_at(new Date());
    }

}
