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
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="ITINERARY")
public class Itinerary extends BaseEntity {

    @Id
    @Column(name="ITINERARY_CODE", nullable=false)
    private String itineraryCode	;

    @JoinColumn(name="ITINERARYTYPE_CODE", 	referencedColumnName="itineraryTypeCode")
    @OneToOne
    private ItineraryType itineraryType;

    @Column(name="NAME", nullable=false)
    private String name	;

    @JoinColumn(name="BRANCH_CODE", 	referencedColumnName="branchCode")
    @OneToOne
    private Branch branch;

    @JoinColumn(name="SEASON_ID", 	referencedColumnName="id")
    @OneToOne
    private Season season;

    @JoinColumn(name="BUSINESSUNIT_ID", 	referencedColumnName="id")
    @OneToOne
    private BusinessUnit businessUnit;

    @JoinColumn(name="GEOAREA_CODE", 	referencedColumnName="geoAreaCode")
    @OneToOne
    private GeoArea geoArea;

    @Column(name="SECURITYLEVEL", nullable=false)
    private Integer 	securityLevel;

    @Column(name="TREND", nullable=false)
    private Double trend;

    @Column(name="DAYSNUMBERBEFORENEXTVISIT", nullable=false)
    private Integer daysNumberBeforeNextVisit;


    @Transient
    List<ItineraryPartner> itineraryPartners;
}

