package com.webservice.baseservice.domain.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="PROFILE")
public class Profile extends BaseEntity {

    @Column(name="PROFILE_CODE", nullable=false)
    private String profileCode	;

    @Column(name="PROFILECATEGORY_Code", nullable=false)
    @OneToOne
    private ProfileCategory profileCategory	;

    @Column(name="NAME", nullable=false)
    private String name	;

    @Column(name="DISCOUNTRULESMODEL_CODE", nullable=true)
    private String discountRulesModelCode	;

    @Column(name="SYNCHROTABLESET_CODE", nullable=false)
    private String synchroTableSetCode	;

    @Column(name="PASSWORD_REGEX", nullable=false)
    private String passwordRegex	;

    @Transient
    private List<ProfileAssabilMenu> profileAssabilMenus;

    @Transient
    private List<ProfileProductPage>  profileProductPages;

    @PrePersist
    public void onPrePersiste() {
        if (this.getId() == null) {
            this.setId("profile_" + UUID.randomUUID().toString());
        }
        this.setCreated_at(new Date());
    }
}