package com.webservice.baseservice.domain.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name="GEOAREA")
public class GeoArea extends BaseEntity {

    @Id
    @Column(name="GEOAREA_CODE", nullable=false)
    private String geoAreaCode	;

    @Column(name="NAME", nullable=false)
    private String name	;

    @JoinColumn(name="GEOAREATYPE_CODE", 	referencedColumnName="geoAreaTypeCode")
    @OneToOne
    private GeoAreaType geoAreaType;;

    @JoinColumn(name="UPGEOAREA_CODE", 	referencedColumnName="geoAreaCode")
    @OneToOne
    private GeoArea upGeoArea;

    @Column(name="NOTES", nullable=true)
    private String notes	;

    @Column(name="USERFIELD1", nullable=true)
    private String userField1	;

    @Column(name="USERFIELD2", nullable=true)
    private String userField2	;

    @Transient
    private Date kpisDate;

    @Transient
    private List<Kpi> kpis;

    @Transient
    private List<GeoArea> subGeoAreas;

    @Transient
    private int[] firstOrLast = {0, 0, 0, 0};






}
