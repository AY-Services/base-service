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

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Bank extends BaseEntity {

    private String bankCode;
    private String name;
    private String iban;

    @PrePersist
    public void onPrePersiste(){
        if(this.getBankCode() == null){
            this.setBankCode("bandCode_"+ UUID.randomUUID().toString());
        }
        if(this.getId() == null){
            this.setId("bank_"+ UUID.randomUUID().toString());
        }
        this.setCreated_at(new Date());
    }
}
