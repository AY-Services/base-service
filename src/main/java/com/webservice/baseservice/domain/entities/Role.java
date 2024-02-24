package com.webservice.baseservice.domain.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.UUID;


@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "ROLE", uniqueConstraints={
                @UniqueConstraint(name="PK_ROLE_CODE", columnNames={"ROLE_CODE"})
        }
)
public class Role extends BaseEntity {
    @Column(name = "ROLE_CODE", nullable = false)
    @TableGenerator(name = "ControlTokenGenerator", table = "TOKENSERIE",
            pkColumnName = "TOKENSERIE_CODE", valueColumnName = "TOKEN", pkColumnValue = "ControlSerie")
    protected String roleCode;


    @Column(name = "NAME", length = 140, nullable = false)
    protected String name;

    @JoinColumn(name = "UPROLE_CODE", referencedColumnName = "ROLE_CODE")
    @OneToOne
    private Role upRole;


    private String profile;

    @JoinColumn(name = "GeoArea_CODE", referencedColumnName = "GeoArea_CODE")
    @OneToOne
    private GeoArea geoArea;

    @JoinColumn(name = "PERSON_CODE", referencedColumnName = "PERSON_CODE")
    @OneToOne
    private Person person;

    @JoinColumn(name = "WAREHOUSE_CODE", referencedColumnName = "WAREHOUSE_CODE")
    @OneToOne
    protected Warehouse warehouse;

    @JoinColumn(name = "FEEDEDFROMWAREHOUSE_CODE", referencedColumnName = "WAREHOUSE_CODE")
    @OneToOne
    protected Warehouse feededFromWarehouse;

    @Column(name = "CURRENTCREDIT", nullable = false)
    private Double currentCredit;

    @Column(name = "MAXIMUMCREDIT", nullable = false)
    private Double maximumCredit;

    @Column(name = "ONLINE", nullable = false)
    private Boolean online;

    @JoinColumn(name = "LASTSERVICE_CODE", referencedColumnName = "SERVICE_CODE")
    @OneToOne
    protected Service lastService;

    @Column(name = "USERFIELD1", nullable = true)
    private String userField1;

    @Column(name = "USERFIELD2", nullable = true)
    private String userField2;

    @Column(name = "USERFIELD3", nullable = true)
    private String userField3;

    @Column(name = "USERFIELD4", nullable = true)
    private String userField4;

    @Column(name = "PHONE", nullable = true)
    private String phone;

    @Column(name = "SECURITYLEVEL", nullable = true)
    private Integer securityLevel;


    @Column(name = "MAINDEVICESERIALNUMBER", nullable = true)
    private String mainDeviceSerialNumber;

    @Transient
    private Date kpisDate;

    @Transient
    private List<Kpi> kpis;

    @Transient
    private List<Role> subRoles;

    @Transient
    private int[] firstOrLast = {0, 0, 0, 0};

    @Column(name = "HOLD", nullable = true)
    private Boolean hold;

    @Column(name = "DEVICESERIALNUMBER")
    private String deviceSerialNumber;


    @PrePersist
    public void onPrePersiste() {
        if (this.getId() == null) {
            this.setId("role_" + UUID.randomUUID().toString());
        }
        this.setCreated_at(new Date());
    }
}
