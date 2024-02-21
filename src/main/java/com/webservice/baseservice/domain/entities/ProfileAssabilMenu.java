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
@Table(name="PROFILE_ASSABILMENU")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProfileAssabilMenu extends BaseEntity {
    private static final long serialVersionUID = 1L;


    @Id
    @JoinColumn(name="PROFILE_CODE", 	referencedColumnName="profileCode")
    @OneToOne
    private Profile profile;


    @Id
    @JoinColumn(name="ASSABILMENU_CODE", 	referencedColumnName="assabilMenuCode")
    @OneToOne
    private AssabilMenu assabilMenu;


    @Column(name="HOLD")
    private Boolean hold;


    @Column(name="STARTDATE")
    private Date startDate;

    @Column(name="ENDDATE")
    private Date endDate;


}
