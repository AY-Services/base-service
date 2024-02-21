package com.webservice.baseservice.domain.entities;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="ASSETPRODUCT")
public class AssetProduct extends BaseEntity {

    @Id
    @Column(name = "ASSETPRODUCT_CODE", nullable = false)
    private String assetProductCode;

    @Column(name = "ID")
    private Long _id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "LONGDESCRIPTION")
    private String longDescription;

    @Column(name = "RANK")
    private Integer rank;

    @Column(name = "BARCODE_LENGTH")
    private Integer barCodeLength;

    @Column(name = "SERIALNUMBER_LENGTH")
    private Integer serialNumberLength;

    @Column(name = "VOLUME")
    private Integer volume;


    @Column(name = "SPARE")
    private Boolean spare;

    @Column(name = "UNITPRICE")
    private Double unitPrice;


    @Column(name = "HOLD")
    private Boolean hold;

    @Column(name = "HOLD_REASON")
    private String holdReason;

    @Column(name = "SUPPLIERREFERENCE")
    private String supplierReference;

    @Transient
    private Double amount;

    @Transient
    private Double quantity;

    @JoinColumn(name = "ASSETPRODUCTCATEGORY_CODE", referencedColumnName = "assetProductCategoryCode")
    @OneToOne
    private AssetProductCategory assetProductCategory;

}

