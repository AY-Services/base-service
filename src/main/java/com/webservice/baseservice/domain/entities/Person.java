package com.webservice.baseservice.domain.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name="PERSON")
public class Person extends BaseEntity {

    @Column(name="PERSON_CODE", nullable=false)
    private String personCode	;

    @Column(name="NAME", nullable=false)
    private String name	;

    @Column(name="FIRSTNAME", nullable=false)
    private String firstName	;

    @Column(name="PHONE", nullable=true)
    private String phone	;

    @Column(name="CELLULARPHONE", nullable=true)
    private String cellularPhone	;

    @Column(name="FAX", nullable=true)
    private String fax	;

    @Column(name="EMAIL", nullable=true)
    private String email	;

    @Column(name="PASSWORD", nullable=true)
    private String password	;

    @Column(name="REMAININGATTEMPTS", nullable=true)
    private Integer remainingAttempts	;

    @Column(name="SUSPICIOUSATTEMPT1TIME", nullable=true)
    private Date suspiciousAttempt1Time	;

    @Column(name="SUSPICIOUSATTEMPT2TIME", nullable=true)
    private Date suspiciousAttempt2Time	;

    @Column(name="SUSPICIOUSATTEMPT3TIME", nullable=true)
    private Date suspiciousAttempt3Time	;

    @Column(name="PASSWORDEXPIRYDATE")
    private Date passwordExpiryDate;

    @Column(name="PASSWORDDIGEST")
    private String passwordDigest;

    @Column(name="LOGIN", nullable=true)
    private String login;

    @Column(name="LASTCONNECTIONDATE")
    private Date lastConnectionDate;


    private String profile;


    @JoinColumn(name="LANGUAGE_CODE",referencedColumnName="LANGUAGE_CODE")
    @OneToOne
    private Language language;

    @Column(name="REQUIREDCONTROLNUMBER", nullable=false)
    private Integer requiredControlNumber	;

    @Column(name="HOLD", nullable=false)
    private Boolean hold	;

    @Column(name="HOLD_REASON", nullable=true)
    private String hold_reason	;

    @JoinColumn(name="CREATEDBYROLE_ID", referencedColumnName="id")
    @OneToOne
    protected Role createdByRole;

    @JoinColumn(name="CREATEDBYPERSON_ID", referencedColumnName="id")
    @OneToOne
    protected Person createdByPerson;

    @Column(name="CREATIONDATE", nullable=true)
    private Date creationDate;

    @Column(name="USERFIELD1", nullable=true)
    private String userField1	;

    @Column(name="USERFIELD2", nullable=true)
    private String userField2	;

    @Column(name="SECURITYLEVEL", nullable=false)
    private Integer securityLevel	;

    @Column(name="LASTUPDATE", nullable=true)
    private Date lastupdate	;

    @Column(name="USER_CODE", nullable=true)
    private String userCode	;

    public Date getLastConnectionDate() {
        return lastConnectionDate;
    }
    public void setLastConnectionDate(Date lastConnectionDate) {
        this.lastConnectionDate = lastConnectionDate;
    }

    @Transient
    private String token;

    @Transient
    private Double longitude;

    @Transient
    private Double latitude;

    @Transient
    private Role role;

    public String getCompleteName() {
        String completeName = "";
        String sep =  "";
        if (this.firstName != null ) 	{completeName += this.firstName; sep = " ";};
        if (this.name != null ) 		completeName += sep + this.name;

        return completeName;
    }

}
