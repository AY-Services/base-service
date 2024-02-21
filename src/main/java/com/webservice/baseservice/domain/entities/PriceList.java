package com.webservice.baseservice.domain.entities;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@JsonInclude(Include.NON_NULL)

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="PRICELIST")
public class PriceList extends BaseEntity {

    @Id
    @Column(name="PRICELIST_CODE")
    private String priceListCode;

    @Column(name="NAME")
    private String name;

    @Column(name="RANK")
    private Integer rank;


    @Transient
    @OneToMany
    private List<PriceListLine> priceListLines;

}
