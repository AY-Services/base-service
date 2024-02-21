package com.webservice.baseservice.domain.entities;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;

import java.util.List;

/**
 * The persistent class for the PARTNERCATEGORY database table.
 *
 */
@JsonInclude(Include.NON_NULL)
@Entity
@Table(name="PARTNERCATEGORY")
public class PartnerCategory extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="PARTNERCATEGORY_CODE")
    private String partnerCategoryCode;

    @Column(name="NAME")
    private String name;

    @Column(name="RANK")
    private Integer rank;


    @JoinColumn(name="UPPARTNERCATEGORY_CODE", 	referencedColumnName="partnerCategoryCode")
    @OneToOne
    private PartnerCategory upPartnerCategory;


    @Transient
    @OneToMany
    List<PartnerCategoryType> partnerCategoryTypes;



}
