package com.webservice.baseservice.domain.entities;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name="ROLECATEGORYTYPE")
public class RoleCategoryType extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ROLECATEGORY_CODE", nullable=false)
    protected String roleCategoryCode;

    @Id
    @Column(name = "ROLECATEGORYTYPE_CODE", nullable=false)
    protected String roleCategoryTypeCode;

    @Column(name = "NAME", length = 140, nullable=false)
    protected String name;

    @Column(name = "RANK")
    protected Integer rank;
}

