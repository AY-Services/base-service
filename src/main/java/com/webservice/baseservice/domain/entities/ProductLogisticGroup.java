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
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="PRODUCTLOGISTICGROUP")
public class ProductLogisticGroup extends BaseEntity {

    @Id
    @Column(name="PRODUCTLOGISTICGROUP_CODE")
    private String productLogisticGroupCode;

    @Column(name="NAME")
    private String name;

    @Column(name="RANK")
    private Integer rank;
}