package com.webservice.baseservice.domain.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name="GEOAREATYPE")
public class GeoAreaType extends BaseEntity {

    @Id
    @Column(name="GEOAREATYPE_CODE", nullable=false)
    private String geoAreaTypeCode	;

    @Column(name="NAME", nullable=false)
    private String name	;

    @Column(name="RANK", nullable=false)
    private Long rank	;

}

