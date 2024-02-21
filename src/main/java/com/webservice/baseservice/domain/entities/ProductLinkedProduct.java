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
@Table(name="PRODUCT_LINKEDPRODUCT")
public class ProductLinkedProduct extends BaseEntity {
    private static final long serialVersionUID = 1L;


    @Id
    @JoinColumn(name="PRODUCT_CODE", referencedColumnName="productCode")
    @OneToOne
    private Product product;


    @Id
    @JoinColumn(name="LINKEDPRODUCT_CODE", referencedColumnName="productCode")
    @OneToOne
    private Product linkedProduct;


    @Column(name="LINKTYPE")
    private Integer linkType;

    @Column(name="RANK")
    private Integer rank;



}
