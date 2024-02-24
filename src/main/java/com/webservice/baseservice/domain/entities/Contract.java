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
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="CONTRACT")
public class Contract extends BaseEntity {

    @Id
    @Column(name="CONTRACT_CODE", nullable=false)
    private String	contractCode	;

    @Column(name="NAME", nullable=false)
    private 	String	name	;

    @Column(name="CONTRACTCATEGORY_CODE", nullable=false)
    private 	String	contractcategoryCode	;

    @Column(name="CONTRACTCATEGORYTYPE_CODE", nullable=false)
    private 	String	contractcategorytypeCode	;

    @Column(name="PARTNER_CODE", nullable=true)
    private 	String	partnerCode	;

    @Column(name="CONTACT_CODE", nullable=true)
    private 	String	contactCode	;

    @Column(name="SLA_CODE", nullable=true)
    private 	String	slaCode	;

    @Column(name="STARTDATE", nullable=false)
    private Date startDate	;

    @Column(name="ENDDATE", nullable=false)
    private 	Date	endDate	;

    @Column(name="ROLE_CODE", nullable=false)
    private 	String	roleCode	;

    @Column(name="EXTERNALREFERENCE1", nullable=true)
    private 	String	externalReference1	;

    @Column(name="EXTERNALREFERENCE2", nullable=true)
    private 	String	externalReference2	;

    @Column(name="DOCUMENTNAME", nullable=true)
    private 	String	documentName	;

    @Column(name="UPCONTRACT_CODE", nullable=true)
    private 	String	upContractCode	;

    @Column(name="HOLD", nullable=false)
    private 	Boolean	hold;

    @Column(name="HOLD_REASON", nullable=true)
    private 	String	holdReason	;


}

