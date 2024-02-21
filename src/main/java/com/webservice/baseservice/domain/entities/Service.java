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

    @JoinColumn(name="ROLE_CODE",  referencedColumnName="roleCode")
    @OneToOne
    protected Role role;

    @JoinColumn(name="SETTLEMENT_CODE",  referencedColumnName="settlementCode")
    @OneToOne
    protected Settlement settlement;

    @JoinColumn(name="ITINERARY_CODE",  referencedColumnName="itineraryCode")
    @OneToOne
    protected Itinerary itinerary;

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


    public String getServiceCode() {
        return serviceCode;
    }
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }



    public String getBranchCode() {
        return branchCode;
    }


    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }




    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }

    public Itinerary getItinerary() {
        return itinerary;
    }
    public void setItinerary(Itinerary itinerary) {
        this.itinerary = itinerary;
    }

    public String getPeriodCode() {
        return periodCode;
    }


    public void setPeriodCode(String periodCode) {
        this.periodCode = periodCode;
    }


    public String getPersonCode() {
        return personCode;
    }


    public void setPersonCode(String personCode) {
        this.personCode = personCode;
    }


    public String getProfileCode() {
        return profileCode;
    }


    public void setProfileCode(String profileCode) {
        this.profileCode = profileCode;
    }


    public String getClosedByRoleCode() {
        return closedByRoleCode;
    }


    public Settlement getSettlement() {
        return settlement;
    }
    public void setSettlement(Settlement settlement) {
        this.settlement = settlement;
    }
    public void setClosedByRoleCode(String closedByRoleCode) {
        this.closedByRoleCode = closedByRoleCode;
    }


    public String getClosedByPersonCode() {
        return closedByPersonCode;
    }


    public void setClosedByPersonCode(String closedByPersonCode) {
        this.closedByPersonCode = closedByPersonCode;
    }


    public Double getMaximumDamagedStockValue() {
        return maximumDamagedStockValue;
    }


    public void setMaximumDamagedStockValue(Double maximumDamagedStockValue) {
        this.maximumDamagedStockValue = maximumDamagedStockValue;
    }


    public Double getMaximumDamagedStockValue1() {
        return maximumDamagedStockValue1;
    }


    public void setMaximumDamagedStockValue1(Double maximumDamagedStockValue1) {
        this.maximumDamagedStockValue1 = maximumDamagedStockValue1;
    }


    public String getServiceTypeCode() {
        return serviceTypeCode;
    }


    public void setServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
    }


    public String getVanCode() {
        return vanCode;
    }


    public void setVanCode(String vanCode) {
        this.vanCode = vanCode;
    }


    public Date getCreationDate() {
        return creationDate;
    }


    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }


    public Date getNextVisitDate() {
        return nextVisitDate;
    }


    public void setNextVisitDate(Date nextVisitDate) {
        this.nextVisitDate = nextVisitDate;
    }


    public Integer getPeriodRemainingVisits() {
        return periodRemainingVisits;
    }


    public void setPeriodRemainingVisits(Integer periodRemainingVisits) {
        this.periodRemainingVisits = periodRemainingVisits;
    }


    public Date getPeriodActiveDay() {
        return periodActiveDay;
    }


    public void setPeriodActiveDay(Date periodActiveDay) {
        this.periodActiveDay = periodActiveDay;
    }


    public Date getClosingDate() {
        return closingDate;
    }


    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }


    public Date getDepartureTime() {
        return departureTime;
    }


    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }


    public Date getReturnTime() {
        return returnTime;
    }


    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }


    public Integer getDepartureMilage() {
        return departureMilage;
    }


    public void setDepartureMilage(Integer departureMilage) {
        this.departureMilage = departureMilage;
    }


    public Integer getReturnMilage() {
        return returnMilage;
    }


    public void setReturnMilage(Integer returnMilage) {
        this.returnMilage = returnMilage;
    }


    public String getDeviceSerialNumber() {
        return deviceSerialNumber;
    }


    public void setDeviceSerialNumber(String deviceSerialNumber) {
        this.deviceSerialNumber = deviceSerialNumber;
    }


    public Integer getProgressLevel() {
        return progressLevel;
    }


    public void setProgressLevel(Integer progressLevel) {
        this.progressLevel = progressLevel;
    }


    public Date getTranserDate() {
        return transerDate;
    }


    public void setTranserDate(Date transerDate) {
        this.transerDate = transerDate;
    }


    public Integer getTranserBatchCode() {
        return transerBatchCode;
    }


    public void setTranserBatchCode(Integer transerBatchCode) {
        this.transerBatchCode = transerBatchCode;
    }


    public String getUpServiceCode() {
        return upServiceCode;
    }


    public void setUpServiceCode(String upServiceCode) {
        this.upServiceCode = upServiceCode;
    }


    public Integer getItineraryPartnersNumber() {
        return itineraryPartnersNumber;
    }


    public void setItineraryPartnersNumber(Integer itineraryPartnersNumber) {
        this.itineraryPartnersNumber = itineraryPartnersNumber;
    }


    public String getUserfield1() {
        return userfield1;
    }


    public void setUserfield1(String userfield1) {
        this.userfield1 = userfield1;
    }


    public String getUserfield2() {
        return userfield2;
    }
    public void setUserfield2(String userfield2) {
        this.userfield2 = userfield2;
    }


    public Double getSalesAmount() {
        return salesAmount;
    }
    public void setSalesAmount(Double salesAmount) {
        this.salesAmount = salesAmount;
    }


    private static final long serialVersionUID = 1L;


}
