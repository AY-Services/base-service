package com.webservice.baseservice.domain.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name="SERVICE")
public class Service extends BaseEntity {

    @Id
    @Column(name = "SERVICE_CODE", nullable=false)
    @TableGenerator(name = "ControlTokenGenerator", table = "TOKENSERIE",
            pkColumnName = "TOKENSERIE_CODE", valueColumnName = "SERVICENEXTNUMBER", pkColumnValue = "ControlSerie")

    protected String serviceCode;


    @Column(name = "BRANCH_CODE", nullable=false)
    protected String branchCode;

    @JoinColumn(name="ROLE_CODE",  referencedColumnName="ROLE_CODE")
    @OneToOne
    protected Role role;

    @JoinColumn(name="SETTLEMENT_CODE",  referencedColumnName="SETTLEMENT_CODE")
    @OneToOne
    protected Settlement settlement;

    @Column(name = "PERIOD_CODE", nullable = false)
    protected String periodCode;

    @Column(name = "PERSON_CODE", nullable = false)
    protected String personCode;

    @Column(name = "PROFILE_CODE", nullable = false)
    protected String profileCode;

    @Column(name = "CLOSEDBYROLE_CODE")
    protected String closedByRoleCode;

    @Column(name = "CLOSEDBYPERSON_CODE")
    protected String closedByPersonCode;

    @Column(name = "MAXIMUMDAMAGEDSTOCKVALUE")
    protected Double maximumDamagedStockValue;

    @Column(name = "MAXIMUMDAMAGEDSTOCKVALUE1")
    protected Double maximumDamagedStockValue1;

    @Column(name = "SERVICETYPE_CODE")
    protected String serviceTypeCode;

    @Column(name = "VAN_CODE")
    protected String vanCode;

    @Column(name = "CREATIONDATE")
    protected Date creationDate;

    @Column(name = "NEXTVISITDATE")
    protected Date nextVisitDate;

    @Column(name = "PERIODREMAININGVISITS")
    protected Integer periodRemainingVisits;

    @Column(name = "PERIODACTIVEDAY")
    protected Date periodActiveDay;

    @Column(name = "CLOSINGDATE")
    protected Date closingDate;

    @Column(name = "DEPARTURETIME")
    protected Date departureTime;

    @Column(name = "RETURNTIME")
    protected Date returnTime;

    @Column(name = "DEPARTUREMILAGE")
    protected Integer departureMilage;

    @Column(name = "RETURNMILAGE")
    protected Integer returnMilage;

    @Column(name = "DEVICESERIALNUMBER")
    protected String deviceSerialNumber;

    @Column(name = "PROGRESSLEVEL")
    protected Integer progressLevel;

    @Column(name = "TRANSERDATE")
    protected Date transerDate;

    @Column(name = "TRANSERBATCH_CODE")
    protected Integer transerBatchCode;

    @Column(name = "UPSERVICE_CODE")
    protected String upServiceCode;

    @Column(name = "ITINERARYPARTNERSNUMBER")
    protected Integer itineraryPartnersNumber;

    @Column(name = "USERFIELD1")
    protected String userfield1;

    @Column(name = "USERFIELD2")
    protected String userfield2;


    @Transient
    private Double salesAmount;
}
