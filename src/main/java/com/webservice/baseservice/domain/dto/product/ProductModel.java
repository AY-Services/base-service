package com.webservice.baseservice.domain.dto.product;

import com.webservice.baseservice.domain.entities.*;
import jakarta.persistence.*;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProductModel {

    private String productCode	;
    private String name;
    private String description	;
    private Integer rank;
    private Double salesPrice;
    private Double purchasePrice;
    private Double returnPrice;
    private String currencyCode;
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
    private byte[]	photo;
    private String productCategoryCode;
    private String productCategoryTypeCode;
    private Double availableQuantity;
    private Double damagedQuantity;
    private String photoUrl;
    private Partner partner;

}
