package com.webservice.baseservice.domain.entities;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Documents")
public class Document extends BaseEntity {

    @JoinColumn(referencedColumnName="id", nullable=false)
    @OneToOne
    private Partner partner;

    @JoinColumn(referencedColumnName="id", nullable=false)
    @OneToOne
    private Document document;
    private String documentType;
    private String description;

    @PrePersist
    private void onPrePersist(){
        if(this.getId()== null){
            this.setId("document_"+ UUID.randomUUID().toString());
        }
        this.setCreated_at(new Date());
    }
}

