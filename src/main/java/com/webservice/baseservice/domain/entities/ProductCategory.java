package com.webservice.baseservice.domain.entities;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="PRODUCTCATEGORY")
public class ProductCategory extends BaseEntity {

    @Id
    @Column(name="PRODUCTCATEGORY_CODE")
    private String productCategoryCode;

    @Column(name="NAME")
    private String name;

    @Column(name="RANK")
    private Integer rank;

    @Column(name="UPPRODUCTCATEGORY_CODE")
    private String upProductCategoryCode;


    @Column(name="ASSETPRODUCTCATEGORY")
    private Boolean assetProductCategory;


    //----------------------------------------------------------------------------------------------------------
    //@Column(name="PHOTO")
    @Transient
    private byte[]	photo;
    //----------------------------------------------------------------------------------------------------------

    @Transient
    List<ProductCategoryType> productCategoryTypes;

    @Transient
    private Integer count;

}
