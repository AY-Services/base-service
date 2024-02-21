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
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="PRODUCT_PRODUCTOPTION")
public class ProductProductOption extends BaseEntity {
    private static final long serialVersionUID = 1L;


    @Id
    @JoinColumn(name="PRODUCT_CODE", referencedColumnName="productCode")
    @OneToOne
    private Product product;

    @Id
    @JoinColumn(name="PRODUCTOPTION_CODE", referencedColumnName="productOptionCode")
    @OneToOne
    private ProductOption productOption;


    @Column(name="RANK")
    private Integer rank;


}
