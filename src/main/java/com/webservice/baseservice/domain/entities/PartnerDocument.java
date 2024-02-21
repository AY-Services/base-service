package com.webservice.baseservice.domain.entities;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="PARTNER_DOCUMENT")
public class PartnerDocument extends BaseEntity {

    @Id
    @Column(name="ID",nullable = false)
    private Long _id;

    @JoinColumn(name="PARTNER_ID", referencedColumnName="id", nullable=false)
    @OneToOne
    private Partner partner;

    @JoinColumn(name="DOCUMENT_ID", referencedColumnName="id", nullable=false)
    @OneToOne
    private Document document;

    @Column(name="DOCUMENT_TYPE")
    private String documentType;

    @Column(name="DESCRIPTION")
    private String description;
}

