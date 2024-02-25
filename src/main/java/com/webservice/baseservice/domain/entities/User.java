package com.webservice.baseservice.domain.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
public class User extends BaseEntity {

    private String userCode	;
    private String name	;
    private String firstName	;
    private String phone	;
    private String cellularPhone	;
    private String fax	;
    private String email	;
    private String password	;
    private Integer remainingAttempts	;
    private Date suspiciousAttempt1Time	;
    private Date suspiciousAttempt2Time	;
    private Date suspiciousAttempt3Time	;
    private Date passwordExpiryDate;
    private String passwordDigest;
    private String login;
    private Date lastConnectionDate;
    private String profile;
    @JoinColumn(referencedColumnName="languageCode")
    @OneToOne
    private Language language;
    private Integer requiredControlNumber	;
    private Boolean hold	;
    private String hold_reason	;
    @JoinColumn(referencedColumnName="id")
    @OneToOne
    protected User createdByUser;
    private String userField1	;
    private String userField2	;
    private Integer securityLevel	;
    private Date lastupdate	;
    @Transient
    private String token;
    @Transient
    private Double longitude;
    @Transient
    private Double latitude;
    public String getCompleteName() {
        String completeName = "";
        String sep =  "";
        if (this.firstName != null ) 	{completeName += this.firstName; sep = " ";};
        if (this.name != null ) 		completeName += sep + this.name;

        return completeName;
    }

    @PrePersist
    private void onPrePersist(){
        if(this.getId()== null){
            this.setId("user_"+ UUID.randomUUID().toString());
        }
        this.setCreated_at(new Date());
    }

}
