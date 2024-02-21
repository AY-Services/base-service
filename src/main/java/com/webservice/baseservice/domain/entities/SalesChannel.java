package com.webservice.baseservice.domain.entities;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The persistent class for the SALESCHANNEL database table.
 *
 */
@JsonInclude(Include.NON_NULL)
@Entity
@Table(name="SALESCHANNEL")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SalesChannel extends BaseEntity {

    @Id
    @Column(name="SALESCHANNEL_CODE")
    private String salesChannelCode;

    @Column(name="ICON_CODE")
    private String iconCode;

    @Column(name="NAME")
    private String name;

    @Column(name="RANK")
    private Integer rank;


}