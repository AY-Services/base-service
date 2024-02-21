package com.webservice.baseservice.domain.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table( name = "TOKENSERIE",
        uniqueConstraints={
                @UniqueConstraint(name="PK_TOKENSERIE", columnNames={"TOKENSERIE_CODE"})
        }
)
public class TokenSerie extends BaseEntity  {

    @Id
    @Column(name = "TOKENSERIE_CODE", nullable=false)
    @TableGenerator(name = "ControlTokenGenerator", table = "TOKENSERIE",
            pkColumnName = "TOKENSERIE_CODE", valueColumnName = "TOKEN", pkColumnValue = "ControlSerie")
    protected String tokenSerieCode;


    @Column(name = "NAME", length = 140, nullable=false)
    protected String name;

    @Column(name = "DIGITSINCOUNTER", nullable=false)
    protected Integer digitsInCounter;

    @Column(name = "SERVICEPREFIX", nullable=false)
    protected String servicePrefix;

    @Column(name = "SERVICENEXTNUMBER", nullable=false)
    protected Integer serviceNextNumber;

    @Column(name = "SORDERPREFIX", nullable=false)
    protected String sorderPrefix;

    @Column(name = "SORDERNEXTNUMBER", nullable=false)
    protected Integer sorderNextNumber;

    @Column(name = "SDELIVERYNOTEPREFIX", nullable=false)
    protected String sdeliveryNotePrefix;

    @Column(name = "SDELIVERYNOTENEXTNUMBER", nullable=false)
    protected Integer sdeliveryNoteNextNumber;

    @Column(name = "SINVOICEPREFIX", nullable=false)
    protected String sinvoicePrefix;

    @Column(name = "SINVOICENEXTNUMBER", nullable=false)
    protected Integer sinvoiceNextNumber;

    @Column(name = "BONUSPREFIX", nullable=false)
    protected String bonusPrefix;

    @Column(name = "BONUSNEXTNUMBER", nullable=false)
    protected Integer bonusNextNumber;

    @Column(name = "PAYMENTPREFIX", nullable=false)
    protected String paymentPrefix;

    @Column(name = "PAYMENTNEXTNUMBER", nullable=false)
    protected Integer paymentNextNumber;

    @Column(name = "VISITPREFIX", nullable=false)
    protected String visitPrefix;

    @Column(name = "VISITNEXTNUMBER", nullable=false)
    protected Integer visitNextNumber;

    @Column(name = "LOADPREFIX", nullable=false)
    protected String loadPrefix;

    @Column(name = "LOADNEXTNUMBER", nullable=false)
    protected Integer loadNextNumber;

    @Column(name = "INVENTORYPREFIX", nullable=false)
    protected String inventoryPrefix;

    @Column(name = "INVENTORYNEXTNUMBER", nullable=false)
    protected Integer inventoryNextNumber;

    @Column(name = "FACINGPREFIX", nullable=false)
    protected String facingPrefix;

    @Column(name = "FACINGNEXTNUMBER", nullable=false)
    protected Integer facingNextNumber;

    @Column(name = "INTERVIEWPREFIX", nullable=false)
    protected String interviewPrefix;

    @Column(name = "INTERVIEWNEXTNUMBER", nullable=false)
    protected Integer interviewNextNumber;

    @Column(name = "PARTNERPREFIX", nullable=false)
    protected String partnerPrefix;

    @Column(name = "PARTNERNEXTNUMBER", nullable=false)
    protected Integer partnerNextNumber;

    @Column(name = "EQUIPMENTPREFIX", nullable=false)
    protected String equipmentPrefix;

    @Column(name = "EQUIPMENTNEXTNUMBER", nullable=false)
    protected Integer equipmentNextNumber;

    @Column(name = "WAREHOUSETRANSFERTPREFIX", nullable=false)
    protected String warehouseTransfertPrefix;

    @Column(name = "WAREHOUSETRANSFERTNEXTNUMBER", nullable=false)
    protected Integer warehouseTransfertNextNumber;

    @Column(name = "WAREHOUSEINVENTORYPREFIX", nullable=false)
    protected String warehouseInventoryPrefix;

    @Column(name = "WAREHOUSEINVENTORYNEXTNUMBER", nullable=false)
    protected Integer warehouseInventoryNextNumber;

    @Column(name = "SQUOTEPREFIX", nullable=false)
    protected String squotePrefix;

    @Column(name = "SQUOTENEXTNUMBER", nullable=false)
    protected Integer squoteNextNumber;

    @Column(name = "EXPENSEPREFIX", nullable=false)
    protected String expensePrefix;

    @Column(name = "EXPENSENEXTNUMBER", nullable=false)
    protected Integer expenseNextNumber;

    @Column(name = "FOLDERPREFIX", nullable=false)
    protected String folderPrefix;

    @Column(name = "FOLDERNEXTNUMBER", nullable=false)
    protected Integer folderNextNumber;

    @Column(name = "ASSETROLEASSIGNMENTPREFIX", nullable=false)
    protected String assetRoleAssignmentPrefix;

    @Column(name = "ASSETROLEASSIGNMENTNEXTNUMBER", nullable=false)
    protected Integer assetRoleAssignmentNextNumber;

    @Column(name = "ASSETPARTNERASSIGNMENTPREFIX", nullable=false)
    protected String assetPartnerAssignmentPrefix;

    @Column(name = "ASSETPARTNERASSIGNMENTNEXTNUMBER", nullable=false)
    protected Integer assetPartnerAssignmentNextNumber;

    @Column(name = "CREDITSLIPPREFIX", nullable=false)
    protected String creditSlipPrefix;

    @Column(name = "CREDITSLIPNEXTNUMBER", nullable=false)
    protected Integer creditSlipNextNumber;

    @Column(name = "ASSETMWSASSIGNMENTPREFIX", nullable=false)
    protected String assetMwsAssignmentPrefix;

    @Column(name = "ASSETMWSASSIGNMENTNEXTNUMBER", nullable=false)
    protected Integer assetMwsAssignmentNextNumber;


}
