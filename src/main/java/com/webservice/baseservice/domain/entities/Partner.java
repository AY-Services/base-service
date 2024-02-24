package com.webservice.baseservice.domain.entities;

import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;

@JsonInclude(Include.NON_NULL)
@Entity
@Table(name="PARTNER")
public class Partner extends BaseEntity {

    @Id
    @Column(name="ID", nullable=false)
    private Long	id;

    @Column(name="PARTNER_CODE", nullable=false)
    private String partnerCode;

    @Column(name="NAME", nullable=false)
    private String name;

    @Column(name="NAME2", nullable=true)
    private String name2;

    @JoinColumn(name="UPPARTNER_CODE", referencedColumnName="PARTNER_CODE")
    @OneToOne
    private Partner upPartner;

    @JoinColumn(name="ROOTPARTNER_CODE", referencedColumnName="PARTNER_CODE")
    @OneToOne
    private Partner rootPartner;


    @Column(name="BARCODE", nullable=true)
    private String barcode;

    @Column(name="PARTNERID", nullable=true)
    private String partnerid;

    @Column(name="FISCALID", nullable=true)
    private String fiscalId;

    @Column(name="PARTNERIDTYPE_CODE", nullable=true)
    private String partneridtypeCode;

    @Column(name="PARTNERSTATUS_CODE", nullable=false)
    private String partnerStatusCode;

    @Column(name="NOTES", nullable=true)
    private String notes;


    @Column(name="PARTNERTARGETTEMPLATE_CODE")
    private String partnerTargetTemplateCode;

    @Column(name="QUESTIONNAIREGROUP_CODE")
    private String questionnaireGroupCode;


    @JoinColumn(name="SALESCHANNEL_CODE", referencedColumnName="SALESCHANNEL_CODE")
    @OneToOne
    private SalesChannel salesChannel;

    @JoinColumn(name="GEOAREA_CODE", referencedColumnName="GEOAREA_CODE")
    @OneToOne
    private GeoArea geoArea;

    @Column(name="RANK", nullable=false)
    private Integer rank;


    @Column(name="PARTNERSUBCLUSTER_CODE", nullable=false)
    private String partnerSubClusterCode;


    @JoinColumn(name="PARTNERANALYSISGROUP1_CODE", referencedColumnName="PARTNERANALYSISGROUP_CODE")
    @OneToOne
    protected PartnerAnalysisGroup partnerAnalysisGroup;

    @Column(name="NUM", nullable=true)
    private String num;

    @Column(name="STREETNAME1", nullable=true)
    private String streetName1;

    @Column(name="STREETNAME2", nullable=true)
    private String streetName2;

    @Column(name="EXTENDEDADDRESS", nullable=true)
    private String extendedaddress;

    @Column(name="POSTALCODE", nullable=true)
    private String postalCode;

    @Column(name="CITY", nullable=true)
    private String city;

    @Column(name="STATE", nullable=true)
    private String state;

    @Column(name="COUNTRY", nullable=true)
    private String country;

    @Column(name="PHONE1", nullable=true)
    private String phone1;

    @Column(name="PHONE2", nullable=true)
    private String phone2;

    @Column(name="FAX", nullable=true)
    private String fax;

    @Column(name="EMAIL", nullable=true)
    private String email;

    @Column(name="WEBADDRESS", nullable=true)
    private String webAddress;

    @JoinColumn(name="ROLE_CODE", referencedColumnName="ROLE_CODE")
    @OneToOne
    protected Role role;

    @JoinColumn(name="CREATEDBYROLE_ID", referencedColumnName="id")
    @OneToOne
    protected Role createdByRole;

    @JoinColumn(name="CREATEDBYPERSON_ID", referencedColumnName="id")
    @OneToOne
    protected Person createdByPerson;

    @Column(name="CREATIONDATE", nullable=true)
    private Date creationDate;



    @JoinColumn(name="CURRENCY_CODE", referencedColumnName="CURRENCY_CODE")
    @OneToOne
    private Currency currency;

    @JoinColumn(name="PAYMENTTERM_CODE", referencedColumnName="PAYMENTTERM_CODE")
    @OneToOne
    protected PaymentTerm paymentTerm;

    @Column(name="VAT1_EXONERATION", nullable=false)
    private Boolean vat1Exoneration;

    @Column(name="VAT2_EXONERATION", nullable=false)
    private Boolean vat2Exoneration;

    @Column(name="FIXEDTAX_EXONERATION", nullable=false)
    private Boolean fixedTaxExoneration;

    @Column(name="CREDITLIMIT_COMMMERCIAL", nullable=false)
    private Double creditLimitCommercial;

    @Column(name="CREDITBALANCE_COMMMERCIAL", nullable=false)
    private Double creditBalanceCommercial;

    @Column(name="CREDITLIMIT_FINANCIAL", nullable=false)
    private Double creditLimitFinancial;

    @Column(name="CREDITBALANCE_FINANCIAL", nullable=false)
    private Double creditBalanceFinancial;

    @Column(name="ARABICNAME", nullable=true)
    private String arabicName;

    @Column(name="LOYALTYPROGRAMSCORE", nullable=false)
    private Double loyaltyProgramScore;

    @Column(name="LOYALTYPROGRAM1SCORE", nullable=false)
    private Double loyaltyProgram1Score;

    @Column(name="LOYALTYPROGRAM2SCORE", nullable=false)
    private Double loyaltyProgram2Score;

    @Column(name="LOYALTYPROGRAM3SCORE", nullable=false)
    private Double loyaltyProgram3Score;

    @Column(name="LOYALTYPROGRAM4SCORE", nullable=false)
    private Double loyaltyProgram4Score;

    @Column(name="LOYALTYPROGRAM5SCORE", nullable=false)
    private Double loyaltyProgram5Score;

    @Column(name="HOLD", nullable=false)
    private Boolean hold;

    @Column(name="HOLD_REASON", nullable=true)
    private String holdReason;

    @Column(name="COMMON", nullable=false)
    private Boolean common;

    @Column(name="DELIVERYPREFERENCE", nullable=true)
    private String deliveryPreference;

    @Column(name="BACKOFFICEINVOICING", nullable=false)
    private Boolean backOfficeInvoicing;

    @Column(name="PRIVILEGE", nullable=false)
    private Boolean privilege;

    @Column(name="PRIVILEGEREGISTRATIONDATE", nullable=false)
    private Date privilegeRegistrationDate;

    @Column(name="TARGETASSIGNED", nullable=false)
    private Boolean targetAssigned;

    @Column(name="TARGETACHIEVED", nullable=false)
    private Boolean targetAchieved;

    @Column(name="TARGETACHIEVEMENTCALCULATIONDATE", nullable=true)
    private Date targetAchievementCalculationDate;

    @Column(name="CURRENTSERVICEVISITRESULT", nullable=false)
    private Integer currentServiceVisitResult;

    @Column(name="LASTVISITDATE", nullable=true)
    private Date lastVisitDate;

    @Column(name="LASTSORDERDATE", nullable=true)
    private Date lastSOrderDate;

    @Column(name="LASTSINVOICEDATE", nullable=true)
    private Date lastSInvoiceDate;

    @Column(name="LONGITUDE", nullable=true)
    private Double longitude;

    @Column(name="LATITUDE", nullable=true)
    private Double latitude;

    @JoinColumn(name="WAREHOUSE_CODE", referencedColumnName="WAREHOUSE_CODE")
    @OneToOne
    private Warehouse warehouse;

    @Column(name="PARTNERVISITSTATUS", nullable=false)
    private Integer partnerVisitStatus;

    @Column(name="FINALTAXEXONERATION", nullable=false)
    private Boolean finalTaxExoneration;

    @Column(name="MAXIMUMCREDIT", nullable=false)
    private Double maximumCredit;

    @Column(name="CURRENTCREDIT", nullable=false)
    private Double currentCredit;

    @Column(name="MAXIMUMCREDIT2", nullable=false)
    private Double maximumCredit2;

    @Column(name="CURRENTCREDIT2", nullable=false)
    private Double currentCredit2;


    @JoinColumn(name="BANK_CODE", referencedColumnName="BANK_CODE")
    @OneToOne
    private Bank bank;


    @Column(name="IBAN", nullable=true)
    private String iban;

    @Column(name="USERFIELD1", nullable=true)
    private String userField1;

    @Column(name="USERFIELD2", nullable=true)
    private String userField2;

    @Column(name="SECURITYLEVEL", nullable=false)
    private Integer securityLevel;

    @Column(name="LASTUPDATE", nullable=true)
    private Date lastUpdate;

    @Column(name="USER_CODE", nullable=true)
    private String userCode;

    @Column(name="KPI1LABEL", nullable=true)
    private String kpi1Label;

    @Column(name="KPI1VALUE", nullable=true)
    private String kpi1Value;

    @Column(name="KPI2LABEL", nullable=true)
    private String kpi2Label;

    @Column(name="KPI2VALUE", nullable=true)
    private String kpi2Value;

    @Column(name="KPI3LABEL", nullable=true)
    private String kpi3Label;

    @Column(name="KPI3VALUE", nullable=true)
    private String kpi3Value;

    @Column(name="KPI4LABEL", nullable=true)
    private String kpi4Label;

    @Column(name="KPI4VALUE", nullable=true)
    private String kpi4Value;

    @Column(name="KPI5LABEL", nullable=true)
    private String kpi5Label;

    @Column(name="KPI5VALUE", nullable=true)
    private String kpi5Value;

    @Column(name="KPI6LABEL", nullable=true)
    private String kpi6Label;

    @Column(name="KPI6VALUE", nullable=true)
    private String kpi6Value;

    @Column(name="KPI10VALUE", nullable=true)
    private String kpi10Value;

    @Column(name="KPI20VALUE", nullable=true)
    private String kpi20Value;

    @Column(name="KPI30VALUE", nullable=true)
    private String kpi30Value;

    @Column(name="KPI40VALUE", nullable=true)
    private String kpi40Value;

    @Column(name="KPI50VALUE", nullable=true)
    private String kpi50Value;

    @Column(name="KPI60VALUE", nullable=true)
    private String kpi60Value;

    @Column(name="PROGRESSLEVEL", nullable=false)
    private Integer progressLevel;

    @Column(name="PHOTOLATITUDE")
    private Double photoLatitude	;

    @Column(name="PHOTOLONGITUDE")
    private Double photoLongitude	;

    @Column(name="PHOTO")
    private String photo;
    @Transient
    private Double amount;

    @Transient
    private Double volume;

    @Transient
    private Double weight;

    @Transient
    private Boolean prospect;

    @Transient
    private List<PartnerDocument> partnerDocuments;

    @Transient
    private List<PartnerSite> partnerSites;


}
