package com.webservice.baseservice.domain.Support;

import com.webservice.baseservice.domain.entities.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
public class ProductSearch {

    private String id;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date createdAt;


    private Long version;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date created_at;
    private String	productCode	;

    private String		name	;

    private String longDescription	;

    private Integer rank;

    private Double salesPrice	;


    private Double purchasePrice	;

    private Double returnPrice	;


    private String currencyCode	;


    private Brand brand;

    private Boolean hold	;

    private String holdReason	;

    private Integer purchasePacking	;

    private Integer loadPacking	;

    private Integer salesPacking	;

    private Boolean loadable	;

    private Boolean salable	;

    private Boolean returnable	;

    private Boolean expirable	;

    private Boolean inventoryable	;

    private Boolean inventoryable2	;

    private Boolean inventoryable3	;

    private Boolean presenceCheckable	;

    private Boolean presenceCheckable2	;

    private Boolean facingable	;

    private Boolean apos	;

    private Boolean bonus	;

    private Boolean freeGood	;

    private Boolean slowMoving	;

    private Boolean virtualProduct	;

    private Boolean assetProduct	;

    private Boolean consignmentProduct	;

    private Boolean loyaltyProduct	;

    private Integer loyaltyProgramNumber	;

    private Integer promoSequence	;

    private Double promoRate	;

    private Double weight	;

    private Double volume	;

    private Double facingFactor	;

    private Double statUnitRate	;


    private Boolean idealOrderable	;

    private Double idealOrderFactor	;

    private String colorCode	;

    private String photo	;

    private Integer decimalPrecision	;

    private String userField1	;

    private String userField2	;

    private String barcode	;

    private String unitCode	;

    private Double targetUnitRate;


    private Double loyaltyProgramScoreWhenAvailable;

    private Double loyaltyProgramScoreWhenOutStock;

    private String productCategoryCode;


    private String productCategoryTypeCode;


    private String photo2;

    private Double availableQuantity;


    private Double damagedQuantity1;


    private Double damagedQuantity2;



    private Double quantity;


    private String photoUrl;




}
