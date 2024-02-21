package com.webservice.baseservice.domain.entities;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name="ASSETCATEGORYTYPE")
public class AssetCategoryType extends BaseEntity {

    @Id
    @Column(name="ASSETCATEGORYTYPE_CODE")
    private String assetCategoryTypeCode;

    @Id
    @JoinColumns(
            {
                    @JoinColumn(name="ASSETCATEGORY_CODE", referencedColumnName="assetCategoryCode")
            })
    @OneToOne
    private AssetCategory assetCategory;


    @Column(name="NAME")
    private String name;

    @Column(name="RANK")
    private Integer rank;

}
