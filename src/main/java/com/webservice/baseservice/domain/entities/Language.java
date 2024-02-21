package com.webservice.baseservice.domain.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name="LANGUAGE")
public class Language extends BaseEntity {

    @Column(name="LANGUAGE_CODE")
    private String languageCode;

    @Column(name="NAME")
    private String name;

    @Column(name="RANK")
    private Integer rank;


}
