package com.webservice.baseservice.domain.entities;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="PARTNERSITE")
public class PartnerSite extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="PARTNERSITE_CODE")
    private String partnerSiteCode;

    @JoinColumns({@JoinColumn(name="PARTNER_CODE", referencedColumnName="partnerCode")})
    @OneToOne
    private Partner partner;

    @Column(name="NAME")
    private String name;

    @Column(name="BRANCH_CODE")
    private String branchCode;

    @Column(name="NUM")
    private String num;

    @Column(name="STREETNAME1")
    private String streetName1;

    @Column(name="STREETNAME2")
    private String streetName2;

    @Column(name="CITY")
    private String city;

    @Column(name="PHONE1")
    private String phone1;

    @Column(name="PHONE2")
    private String phone2;

    @Column(name="SITECATEGORY_CODE")
    private String siteCategoryCode;

    @Column(name="SITECATEGORYTYPE_CODE")
    private String siteCategoryTypeCode;

    @Column(name="GEOAREA_CODE")
    private String geoAreaCode;

    @Column(name="LATITUDE")
    private Double latitude;

    @Column(name="LONGITUDE")
    private Double longitude;

    @Column(name="DISTANCETOBRANCH")
    private Double distanceToBranch;

    @Column(name="TIMETOBRANCH")
    private Integer timeToBranch;


    @Transient
    private List<Asset> assets;

    @Transient
    private List<PartnerContact> partnerContacts;

}
