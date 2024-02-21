package com.webservice.baseservice.domain.entities;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="ASSET")
public class Asset  extends BaseEntity {

    @Id
    @Column(name="ASSET_CODE", nullable=false)
    private 	String		assetCode	;

    @Column(name="NAME", nullable=false)
    private 	String		name	;

    @JoinColumn(name="ASSETPRODUCT_CODE", referencedColumnName="assetProductCode")
    @OneToOne
    private AssetProduct assetProduct;


    @Column(name="ASSETSTATUS_CODE")
    private String		assetStatusCode	;


    @Column(name="TICKETSNUMBER")
    private Integer		ticketsNumber;



    @Column(name="UPASSET_CODE")
    private 	String		upassetCode	;


    @Column(name="ASSETTRANSFER_CODE")
    private 	String		assetTransferCode	;


    @Column(name="ASSETINVENTORY_CODE")
    private 	String		assetInventory_Code	;


    @JoinColumn(name="BRANCH_CODE", referencedColumnName="branchCode")
    @OneToOne
    private Branch branch;


    @JoinColumn(name="PARTNER_CODE", 		referencedColumnName="partnerCode")
    @OneToOne
    private Partner partner;

    @JoinColumn(name="PARTNERSITE_CODE", 		referencedColumnName="partnerSiteCode")
    @OneToOne
    private PartnerSite partnerSite;


    @JoinColumn(name="PARTNERCONTACT_CODE", 		referencedColumnName="partnerContactCode")
    @OneToOne
    private PartnerContact	partnerContact;


    @JoinColumn(name="MNT_PARTNERCONTACT_CODE", 		referencedColumnName="partnerContactCode")
    @OneToOne
    private PartnerContact	mntPartnerContact;

    @JoinColumn(name="CONTRACT_CODE", 		referencedColumnName="contractCode")
    @OneToOne
    private Contract	contract;


    @JoinColumn(name="MNT_CONTRACT_CODE", 		referencedColumnName="contractCode")
    @OneToOne
    private Contract	mntContract;


    @JoinColumns(
            {
                    @JoinColumn(name="ASSETCATEGORY_CODE", 		referencedColumnName="assetCategory.assetCategoryCode"),
                    @JoinColumn(name="ASSETCATEGORYTYPE_CODE", 	referencedColumnName="assetCategoryTypeCode"),
            })
    @OneToOne
    private AssetCategoryType	assetCategoryType;




    @Column(name="SERIALNUMBER", nullable=false)
    private 	String		serialNumber	;

    @Column(name="BARCODE", nullable=false)
    private 	String		barCode	;

    @Column(name="NOTES", nullable=true)
    private 	String		notes	;


    @Column(name="ASSETORDER_CODE", nullable=false)
    private 	String		assetOrderCode	;



    @Column(name="MEASUREVALUE1", nullable=true)
    private 	Double		measureValue1	;

    @Column(name="MEASUREVALUE2", nullable=false)
    private 	Double		measureValue2	;

    @Column(name="MEASUREVALUE3", nullable=false)
    private 	Double		measureValue3	;

    @Column(name="MEASUREVALUE4", nullable=false)
    private 	Double		measureValue4	;

    @Column(name="MEASUREVALUE5", nullable=true)
    private 	Double		measureValue5	;

    @Column(name="MEASUREVALUE6", nullable=false)
    private 	Double		measureValue6	;

    @Column(name="MEASUREVALUE7", nullable=false)
    private 	Double		measureValue7	;

    @Column(name="MEASUREVALUE8", nullable=false)
    private 	Double		measureValue8	;

    @Column(name="MEASUREVALUE9", nullable=true)
    private 	Double		measureValue9	;

    @Column(name="MEASUREVALUE10", nullable=false)
    private 	Double		measureValue10	;

    @Column(name="CLOSED", nullable=false)
    private 	Boolean		closed	;

    @Column(name="BOOKINGREFERENCE", nullable=false)
    private 	String		bookingReference	;


    @Column(name="INVENTORYCAMPAIN_CODE", nullable=true)
    private 	String		inventoryCampainCode	;

    @Column(name="SERVICE_CODE", nullable=false)
    private 	String		serviceCode	;

    @Column(name="USERFIELD1", nullable=false)
    private 	String		userField1	;

    @Column(name="USERFIELD2", nullable=false)
    private 	String		userField2	;

    @Column(name="SECURITYLEVEL", nullable=true)
    private 	String		securityLevel	;

    @Column(name="LASTUPDATE", nullable=false)
    private 	String		lastUpdate	;

    @Column(name="USER_CODE", nullable=false)
    private 	String		userCode	;


    @Transient
    private 	Boolean rejected	;

    @Transient
    private String rejectionReason	;

    @Transient
    private Boolean inventoried;

    @Transient
    private Date receptionDate	;

    @Transient
    private Date exitDate	;

}

