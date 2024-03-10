package com.webservice.baseservice.domain.dto.user;



import com.webservice.baseservice.domain.dto.language.LanguageDetails;
import lombok.*;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserDetails {
    private String id;
    private Long version;
    private Date created_at;
    private String userCode	;
    private String name	;
    private String firstName;
    private String phone;
    private String cellularPhone;
    private String fax;
    private String email;
    private String password;
    private Integer remainingAttempts;
    private Date suspiciousAttempt1Time;
    private Date suspiciousAttempt2Time;
    private Date suspiciousAttempt3Time;
    private Date passwordExpiryDate;
    private String passwordDigest;
    private String login;
    private Date lastConnectionDate;
    private String profile;
    private LanguageDetails language;
    private Integer requiredControlNumber;
    private Boolean hold;
    private String hold_reason;
    protected UserDetails createdByUser;
    private String userField1;
    private String userField2;
    private Integer securityLevel;
    private Date lastupdate;
    private String token;
    private Double longitude;
    private Double latitude;

}
