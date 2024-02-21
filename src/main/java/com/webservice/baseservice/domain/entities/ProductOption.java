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
@Table(name="PRODUCTOPTION")
public class ProductOption extends BaseEntity {

    @Id
    @Column(name="PRODUCTOPTION_CODE")
    private String productOptionCode;


    @Column(name="NAME", nullable=false)
    private String		name	;


    @Column(name="RANK")
    private Integer rank;


    @JoinColumns(
            {
                    @JoinColumn(name="PRODUCTCATEGORY_CODE", 		referencedColumnName="productCategory.productCategoryCode"),
                    @JoinColumn(name="PRODUCTCATEGORYType_CODE", 	referencedColumnName="productCategoryTypeCode"),
            })
    @OneToOne
    private ProductCategoryType productCategoryType;


}
