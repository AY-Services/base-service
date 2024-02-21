package com.webservice.baseservice.domain.entities;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name="ASSETCATEGORY")
public class AssetCategory extends BaseEntity {

    @Id
    @Column(name="ASSETCATEGORY_CODE")
    private String assetCategoryCode;

    @Column(name="NAME")
    private String name;

    @Column(name="RANK")
    private Integer rank;

    @Column(name="UPASSETCATEGORY_CODE")
    private String upAssetCategoryCode;

}
