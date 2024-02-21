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
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="ROLE_ITINERARY")
public class RoleItinerary extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @Id
    @JoinColumn(name="ROLE_CODE", 		referencedColumnName="roleCode")
    @OneToOne
    private Role role;

    @Id
    @JoinColumn(name="ITINERARY_CODE", 		referencedColumnName="itineraryCode")
    @OneToOne
    private Itinerary itinerary;


    @Column(name="RANK")
    private Integer rank;

    @Column(name="THEDATE")
    private Date theDate;

    @Column(name="WEEKDAY")
    private Integer weekDay;

}
