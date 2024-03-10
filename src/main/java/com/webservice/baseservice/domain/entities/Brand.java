package com.webservice.baseservice.domain.entities;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Brand extends BaseEntity {

    private String brandCode;
    private String name;
    private Integer rank;

    @PrePersist
    public void onPrePersiste(){
        if(this.getBrandCode() == null){
            this.setBrandCode("brandCode_"+ UUID.randomUUID().toString());
        }
        if(this.getId() == null){
            this.setId("brand_"+ UUID.randomUUID().toString());
        }
        this.setCreated_at(new Date());
    }

}
