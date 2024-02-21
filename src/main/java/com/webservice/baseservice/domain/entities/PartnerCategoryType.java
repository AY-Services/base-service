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
@Table(name="PARTNERCATEGORYTYPE")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PartnerCategoryType extends BaseEntity {


    @Id
    @Column(name="PARTNERCATEGORYTYPE_CODE", nullable=false)
    private String partnerCategoryTypeCode;

    @Id
    @JoinColumn(name="PARTNERCATEGORY_CODE", 	referencedColumnName="partnerCategoryCode")
    @OneToOne
    private PartnerCategory partnerCategory	;


    @Column(name="NAME", nullable=true)
    private String name	;

    @Column(name="RANK", nullable=false)
    private Integer rank	;

    @Column(name="ICON_CODE", nullable=true)
    private String iconCode	;



}

