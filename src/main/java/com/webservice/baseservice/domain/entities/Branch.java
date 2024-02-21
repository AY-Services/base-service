package com.webservice.baseservice.domain.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table( name = "BRANCH", uniqueConstraints={
                @UniqueConstraint(name="PK_BRANCH_CODE", columnNames={"BRANCH_CODE"})
        }
)
public class Branch extends BaseEntity {
    @Column(name = "BRANCH_CODE", nullable=false)
    @TableGenerator(name = "ControlTokenGenerator", table = "TOKENSERIE",
            pkColumnName = "TOKENSERIE_CODE", valueColumnName = "TOKEN", pkColumnValue = "ControlSerie")
    protected String branchCode;

    @Column(name = "NAME", length = 140, nullable=false)
    protected String name;
    @Column(name = "HEADER1", length = 140, nullable=false)
    protected String header1;
    @Column(name = "HEADER2" , length = 60)
    private String header2;
    @Column(name = "HEADER3" , length = 60)
    private String header3;
    @Column(name = "HEADER4" , length = 60)
    private String header4;
    @Column(name = "HEADER5" , length = 60)
    private String header5;

    @Column(name = "HEADER6" , length = 60)
    private String header6;
    @Column(name = "FOOTER1", length = 140, nullable=false)
    protected String footer1;
    @Column(name = "FOOTER2" , length = 60)
    private String footer2;
    @Column(name = "FOOTER3" , length = 60)
    private String footer3;
    @Column(name = "FOOTER4" , length = 60)
    private String footer4;

    @Column(name = "FOOTER5" , length = 60)
    private String footer5;

    @Column(name = "FOOTER6" , length = 60)
    private String footer6;

    @Column(name = "USERFIELD1" , length = 60)
    private String userField1;


    @Column(name = "USERFIELD2" , length = 60)
    private String userField2;

    @Column(name = "USERFIELD3" , length = 60)
    private String userField3;

    @Column(name = "USERFIELD4" , length = 60)
    private String userField4;

    @Column(name = "USERFIELD5" , length = 60)
    private String userField5;

    @Column(name = "USERFIELD6" , length = 60)
    private String userField6;

    @Column(name="LONGITUDE", nullable=true)
    private Double longitude;


    @Column(name="LATITUDE", nullable=true)
    private Double latitude;

    @JoinColumn(name="GEOAREA_CODE", referencedColumnName="geoAreaCode")
    private GeoArea geoArea;



}