package com.webservice.baseservice.domain.entities;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="PARTNERCONTACT")
public class PartnerContact extends BaseEntity {

    @Id
    @Column(name="PARTNERCONTACT_CODE", nullable=false)
    private String partnerContactCode	;


    @JoinColumns({@JoinColumn(name="PARTNERSITE_CODE", referencedColumnName="PARTNERSITE_CODE")})
    @OneToOne
    private PartnerSite partnerSite;


    @Column(name="TITLE", nullable=false)
    private String title	;

    @Column(name="LASTNAME", nullable=false)
    private String lastname	;

    @Column(name="FIRSTNAME", nullable=false)
    private String firstname	;

    @Column(name="CONTACTCATEGORY_CODE", nullable=false)
    private String contactcategoryCode	;

    @Column(name="CONTACTTYPE_CODE", nullable=false)
    private String contacttypeCode	;

    @Column(name="JOBTITLE_CODE", nullable=false)
    private String jobtitleCode	;

    @Column(name="PARTNER_DEPARTMENT_CODE", nullable=false)
    private String partner_departmentCode	;

    @Column(name="PERSON_CODE", nullable=false)
    private String personCode	;

    @Column(name="SPECIFICADDRESS", nullable=false)
    private Boolean specificaddress	;

    @Column(name="ADDRESS", nullable=false)
    private String address	;

    @Column(name="ZIPCODE", nullable=false)
    private String zipcode	;

    @Column(name="CITY", nullable=false)
    private String city	;

    @Column(name="STATE", nullable=false)
    private String state	;

    @Column(name="COUNTRY", nullable=false)
    private String country	;

    @Column(name="PHONE", nullable=false)
    private String phone	;

    @Column(name="FAX", nullable=false)
    private String fax	;

    @Column(name="EMAIL", nullable=false)
    private String email	;

    @Column(name="MOBILEPHONE", nullable=false)
    private String mobilephone	;

    @Column(name="OFFICEPHONE", nullable=false)
    private String officephone	;

    @Column(name="PERSONALPHONE", nullable=false)
    private String personalphone	;

    @Column(name="ASSISTANTNAME", nullable=false)
    private String assistantname	;

    @Column(name="ASSISTANTPHONE", nullable=false)
    private String assistantphone	;

    @Column(name="NOTES", nullable=false)
    private String notes	;

    @Column(name="USERFIELD1", nullable=false)
    private String userfield1	;

    @Column(name="USERFIELD2", nullable=false)
    private String userfield2	;



    @Column(name="LASTUPDATE", nullable=false)
    private String lastupdate	;

    @Column(name="USER_CODE", nullable=false)
    private String userCode;

}
