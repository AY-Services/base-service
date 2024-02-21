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
@Table(name="ASSABILMENU")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AssabilMenu extends BaseEntity {

    @Id
    @Column(name="ASSABILMENU_CODE")
    private String assabilMenuCode;

    @Column(name="NAME")
    private String name;

}