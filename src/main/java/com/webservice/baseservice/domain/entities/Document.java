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
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="DOCUMENT")
public class Document extends BaseEntity {

    @Id
    @Column(name="ID",nullable = false)
    private Long _id;

    @Column(name="CONTENT_BLOB")
    private String	contentBlob;

    @Column(name="CONTENT_TYPE")
    private String	contentType;

    @Column(name="CREATIONDATE")
    private Date creationDate;

    @Column(name = "LASTUPDATE", nullable=false) @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;


}

