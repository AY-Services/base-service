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
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="ROLECATEGORY")
public class RoleCategory extends BaseEntity {

    @Id
    @Column(name = "ROLECATEGORY_CODE", nullable=false)
    protected String roleCategoryCode;

    @Column(name = "NAME", length = 140, nullable=false)
    protected String name;

    @Column(name = "RANK")
    protected Integer rank;

    @JoinColumn(name="UPROLECATEGORY_CODE",  referencedColumnName="roleCategoryCode")
    @OneToOne
    protected RoleCategory upRoleCategory;
}

