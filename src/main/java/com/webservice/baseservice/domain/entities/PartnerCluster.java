package com.webservice.baseservice.domain.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;

/**
 * The persistent class for the PARTNERCLUSTER database table.
 *
 */
@JsonInclude(Include.NON_NULL)
@Entity
@Table(name="PARTNERCLUSTER")
public class PartnerCluster extends BaseEntity {

    @Id
    @Column(name="PARTNERCLUSTER_CODE")
    private String partnerClusterCode;

    @Column(name="NAME")
    private String name;

    @Column(name="RANK")
    private Integer rank;

    @Column(name="UPPARTNERCLUSTER_CODE")
    @OneToOne
    private PartnerCluster upPartnerClusterCode;

}
