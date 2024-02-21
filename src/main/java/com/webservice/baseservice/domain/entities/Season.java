package com.webservice.baseservice.domain.entities;

import java.util.Date;



import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@JsonInclude(Include.NON_NULL)
@Entity
@Table(name="SEASON")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Season extends BaseEntity {

    @Column(name="SEASON_CODE")
    private String seasonCode;

    @Column(name="NAME")
    private String name;

    @Column(name="RANK")
    private Integer rank;

    @Column(name="START_DATE")
    private Date startDate;

    @Column(name="END_DATE")
    private Date endtDate;

}
