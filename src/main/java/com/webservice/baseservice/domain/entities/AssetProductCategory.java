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
@Table(name="ASSETPRODUCTCATEGORY")
public class AssetProductCategory extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ASSETPRODUCTCATEGORY_CODE")
    private String assetProductCategoryCode;

    @Column(name = "NAME")
    private String name;

    @Column(name = "RANK")
    private Integer rank;


    @Transient
    private Long availableInBranch;

    @Transient
    private Long available;


}

