package com.webservice.baseservice.domain.entities;



import java.util.Date;
import java.util.List;

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
@Table(name="PRICELIST_LINE")
public class PriceListLine extends BaseEntity {


    private static final long serialVersionUID = 1L;

    @Id
    @JoinColumn(name="PRICELIST_CODE", referencedColumnName = "priceListCode")
    @OneToOne
    private PriceList priceList	;

    @Id
    @Column(name="PRICELIST_LINE_NUMBER", nullable=false)
    private Integer priceListLineNumber	;

    @Column(name="NAME", nullable=false)
    private String name	;

    @Column(name="STARTDATE", nullable=false)
    private Date startDate	;

    @Column(name="ENDDATE", nullable=false)
    private Date endDate	;

    @Column(name="CLOSED", nullable=false)
    private Boolean closed	;

    @Transient
    private List<PriceListLineDetail> priceListLineDetails;
}
