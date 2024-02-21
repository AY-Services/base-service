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

@JsonInclude(Include.NON_NULL)
@Entity
@Table(name="PARTNERANALYSISGROUP4")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PartnerAnalysisGroup4 extends BaseEntity {
    @Id
    @Column(name="PARTNERANALYSISGROUP4_CODE")
    private String partnerAnalysisGroup4Code;

    @Column(name="NAME")
    private String name;

    @Column(name="RANK")
    private Integer rank;



}
