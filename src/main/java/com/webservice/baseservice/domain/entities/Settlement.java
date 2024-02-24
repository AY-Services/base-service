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
@Table( name = "SETTLEMENT",
        uniqueConstraints={
                @UniqueConstraint(name="PK_SETTLEMENT_CODE", columnNames={"SETTLEMENT_CODE"})
        }
)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Settlement extends BaseEntity {


    @Id
    @Column(name = "SETTLEMENT_CODE", nullable=false)
    @TableGenerator(name = "ControlTokenGenerator", table = "TOKENSERIE",
            pkColumnName = "TOKENSERIE_CODE", valueColumnName = "TOKEN", pkColumnValue = "ControlSerie")
    private String settlementCode;


    @JoinColumn(name="ROLE_CODE",  referencedColumnName="ROLE_CODE")
    @OneToOne
    private Role role;

    @JoinColumn(name="PERSON_CODE",  referencedColumnName="PERSON_CODE")
    @OneToOne
    private Person person;

    @JoinColumn(name="DONEBYROLE_CODE",  referencedColumnName="ROLE_CODE")
    @OneToOne
    private Role doneByRole;

    @JoinColumn(name="DONEBYPERSON_CODE",  referencedColumnName="PERSON_CODE")
    @OneToOne
    private Person doneByPerson;

    @Column(name="THEDATE")
    private Date theDate;

    @Column(name="CURRENTCREDIT", nullable=false)
    protected Double currentCredit;

    @Column(name="CASH_AMOUNT", nullable=false)
    protected Double cashAmount;

    @Column(name="NON_CASH_AMOUNT", nullable=false)
    protected Double nonCashAmount;


    @Column(name="CANCELED")
    private Boolean canceled;

}


