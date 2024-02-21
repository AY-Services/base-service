package com.webservice.baseservice.domain.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name="PROFILECATEGORY")
public class ProfileCategory extends BaseEntity {

    @Id
    @Column(name="PROFILECATEGORY_CODE")
    private String profileCategoryCode;

    @Column(name="NAME")
    private String name;

    @Column(name="RANK")
    private Integer rank;

    public ProfileCategory() {
    }

}
