package com.webservice.baseservice.domain.entities;



import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(Include.NON_NULL)

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="PRICELIST_LINE_DETAIL")
public class PriceListLineDetail extends BaseEntity {


    @Id
    @JoinColumns({
            @JoinColumn(name="PRICELIST_CODE", referencedColumnName = "priceList.priceListCode"),
            @JoinColumn(name="PRICELIST_LINE_NUMBER", referencedColumnName = "priceListLineNumber")
    })
    @OneToOne
    private PriceListLine priceListLine	;

    @Id
    @JoinColumn(name="PRODUCT_CODE", referencedColumnName = "productCode")
    @OneToOne
    private Product product	;


    @Column(name="SALESPRICE", nullable=false)
    private Double salesPrice	;

    @Column(name="RETURNPRICE", nullable=false)
    private Double returnPrice	;

}

