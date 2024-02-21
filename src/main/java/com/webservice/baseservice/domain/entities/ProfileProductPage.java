package com.webservice.baseservice.domain.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name="PROFILE_PRODUCTPAGE")
public class ProfileProductPage extends BaseEntity {

    @Id
    @JoinColumn(name="PROFILE_CODE", 	referencedColumnName="profileCode")
    @OneToOne
    private Profile profile;


    @Id
    @JoinColumn(name="PRODUCTPAGE_CODE", 	referencedColumnName="productPageCode")
    @OneToOne
    private ProductPage productPage;


    @Column(name="HOLD")
    private Boolean hold;


    @Column(name="RANK")
    private Integer rank;


}