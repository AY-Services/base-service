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
@Table(name="PRODUCT")
public class Product extends BaseEntity {

    @Column(name="PRODUCT_CODE", nullable=false)
    private String	productCode	;

    @Column(name="NAME", nullable=false)
    private String		name	;

    @Column(name="LONGDESCRIPTION")
    private String longDescription	;

    @Column(name="RANK")
    private Integer rank;

    @Column(name="SALESPRICE")
    private Double salesPrice	;


    @Column(name="PURCHASEPRICE")
    private Double purchasePrice	;

    @Column(name="RETURNPRICE")
    private Double returnPrice	;


    @Column(name="CURRENCY_CODE")
    private String currencyCode	;

    @JoinColumn(name="BRAND_CODE", 		referencedColumnName="BRAND_CODE")
    @OneToOne
    private Brand brand;

    @JoinColumn(name="VAT1_CODE", 		referencedColumnName="VAT_CODE")
    @OneToOne
    private Vat vat1;

    @JoinColumn(name="VAT2_CODE", 		referencedColumnName="VAT_CODE")
    @OneToOne
    private Vat vat2;

    @Column(name="HOLD")
    private Boolean hold	;

    @Column(name="HOLD_REASON")
    private String holdReason	;

    @Column(name="PURCHASEPACKING")
    private Integer purchasePacking	;

    @Column(name="LOADPACKING")
    private Integer loadPacking	;

    @Column(name="SALESPACKING")
    private Integer salesPacking	;

    @Column(name="LOADABLE")
    private Boolean loadable	;

    @Column(name="SALABLE")
    private Boolean salable	;

    @Column(name="RETURNABLE")
    private Boolean returnable	;

    @Column(name="EXPIRABLE")
    private Boolean expirable	;

    @Column(name="INVENTORYABLE")
    private Boolean inventoryable	;

    @Column(name="INVENTORYABLE2")
    private Boolean inventoryable2	;

    @Column(name="INVENTORYABLE3")
    private Boolean inventoryable3	;

    @Column(name="PRESENCECHECKABLE")
    private Boolean presenceCheckable	;

    @Column(name="PRESENCECHECKABLE2")
    private Boolean presenceCheckable2	;

    @Column(name="FACINGABLE")
    private Boolean facingable	;

    @Column(name="APOS")
    private Boolean apos	;

    @Column(name="BONUS")
    private Boolean bonus	;

    @Column(name="FREEGOOD")
    private Boolean freeGood	;

    @Column(name="SLOWMOVING")
    private Boolean slowMoving	;

    @Column(name="VIRTUALPRODUCT")
    private Boolean virtualProduct	;

    @Column(name="ASSETPRODUCT")
    private Boolean assetProduct	;

    @Column(name="CONSIGNMENTPRODUCT")
    private Boolean consignmentProduct	;

    @Column(name="LOYALTYPRODUCT")
    private Boolean loyaltyProduct	;

    @Column(name="LOYALTYPROGRAMNUMBER")
    private Integer loyaltyProgramNumber	;

    @Column(name="PROMOSEQUENCE")
    private Integer promoSequence	;

    @Column(name="PROMORATE")
    private Double promoRate	;

    @Column(name="WEIGHT")
    private Double weight	;

    @Column(name="VOLUME")
    private Double volume	;

    @Column(name="FACINGFACTOR")
    private Double facingFactor	;

    @Column(name="STATUNITRATE")
    private Double statUnitRate	;


    @Column(name="IDEALORDERABLE")
    private Boolean idealOrderable	;

    @Column(name="IDEALORDERFACTOR")
    private Double idealOrderFactor	;

    @Column(name="COLOR_CODE")
    private String colorCode	;

    @Column(name="PHOTO_2")
    private String photo	;

    @Column(name="DECIMALPRECISION")
    private Integer decimalPrecision	;

    @Column(name="USERFIELD1", nullable=true)
    private String userField1	;

    @Column(name="USERFIELD2", nullable=true)
    private String userField2	;

    @Column(name="BARCODE", nullable=true)
    private String barcode	;

    @Column(name="UNIT_CODE", nullable=true)
    private String unitCode	;

    @Column(name="TARGETUNITRATE")
    private Double targetUnitRate;


    @Column(name="LOYALTYPROGRAMSCORE_WHENAVAILABLE")
    private Double loyaltyProgramScoreWhenAvailable;

    @Column(name="LOYALTYPROGRAMSCORE_WHENOUTOFSTOCK")
    private Double loyaltyProgramScoreWhenOutStock;





    // Temporary use
    //----------------------------------------------------------------------------------------------------------
    @Transient
    private byte[]	photo1;

    @Transient
    private String productCategoryCode;

    @Transient
    private String productCategoryTypeCode;

    @Transient
    private String photo2;

    @Transient
    private Double availableQuantity;

    @Transient
    private Double damagedQuantity1;

    @Transient
    private Double damagedQuantity2;


    @Transient
    private Double quantity;

    @Transient
    private String photoUrl;

    @PrePersist
    private void onPrePersist(){

        if(this.getId()== null){
            this.setId("product_"+ UUID.randomUUID().toString());
        }
        this.setCreated_at(new Date());
    }

}
