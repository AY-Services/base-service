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
@Table(name="PRODUCTCATEGORYTYPE")
public class ProductCategoryType extends BaseEntity {

    @Id
    @Column(name="PRODUCTCATEGORYTYPE_CODE")
    private String productCategoryTypeCode;

    @JoinColumn(name="PRODUCTCATEGORY_CODE", 		referencedColumnName="productCategoryCode")
    @OneToOne
    private ProductCategory productCategory;

    @Column(name="NAME")
    private String name;

    @Column(name="RANK")
    private Integer rank;


    //----------------------------------------------------------------------------------------------------------
    //@Column(name="PHOTO")
    @Transient
    private byte[]	photo;
    //----------------------------------------------------------------------------------------------------------

}