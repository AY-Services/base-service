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

    @JoinColumn(name = "UPROLE_CODE", referencedColumnName = "roleCode")
    @OneToOne
    private Role upRole;

    @JoinColumn(name = "PROFILE_CODE", referencedColumnName = "profileCode")
    @OneToOne
    private Profile profile;


    @JoinColumn(name = "DEVICESERIALNUMBER", referencedColumnName = "deviceSerialNumber")
    @OneToOne
    private Device device;


    @JoinColumn(name = "GeoArea_CODE", referencedColumnName = "geoAreaCode")
    @OneToOne
    private GeoArea geoArea;

    @JoinColumn(name = "BRANCH_CODE", referencedColumnName = "branchCode")
    @OneToOne
    private Branch branch;

    @JoinColumn(name = "PERSON_CODE", referencedColumnName = "personCode")
    @OneToOne
    private Person person;

    @JoinColumn(name = "TOKENSERIE_CODE", referencedColumnName = "tokenSerieCode")
    @OneToOne
    protected TokenSerie tokenSerie;

    @JoinColumn(name = "WAREHOUSE_CODE", referencedColumnName = "warehouseCode")
    @OneToOne
    protected Warehouse warehouse;

    @JoinColumn(name = "FEEDEDFROMWAREHOUSE_CODE", referencedColumnName = "warehouseCode")
    @OneToOne
    protected Warehouse feededFromWarehouse;

    @Column(name = "CURRENTCREDIT", nullable = false)
    private Double currentCredit;

    @Column(name = "MAXIMUMCREDIT", nullable = false)
    private Double maximumCredit;

    @Column(name = "ONLINE", nullable = false)
    private Boolean online;

    @JoinColumn(name = "LASTSERVICE_CODE", referencedColumnName = "serviceCode")
    @OneToOne
    protected Service lastService;

    @JoinColumn(name = "PRICELIST_CODE", referencedColumnName = "priceListCode")
    @OneToOne
    protected PriceList priceList;

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

//	@Column(name="ROLECATEGORY_CODE", nullable=true)
//	private String roleCetegoryCode;

    @JoinColumn(name = "ROLECATEGORY_CODE", referencedColumnName = "roleCategoryCode")
    @OneToOne
    private RoleCategory roleCategory;

    @JoinColumn(name = "ROLECATEGORYTYPE_CODE", referencedColumnName = "roleCategoryTypeCode")
    @OneToOne
    private RoleCategoryType roleCategoryType;

//	@Column(name="ROLECATEGORYTYPE_CODE", nullable=true)
//	private String roleCetegoryTypeCode;

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
    private List<RoleItinerary> roleItinerarys;

    @Transient
    private int[] firstOrLast = {0, 0, 0, 0};

    @Column(name = "HOLD", nullable = true)
    private Boolean hold;

    @JoinColumn(name = "ROLEANALYSISGROUP1_CODE", referencedColumnName = "roleAnalysisGroup1Code")
    @OneToOne
    protected RoleAnalysisGroup roleAnalysisGroup1;

    @JoinColumn(name = "ROLEANALYSISGROUP2_CODE", referencedColumnName = "roleAnalysisGroup2Code")
    @OneToOne
    protected RoleAnalysisGroup roleAnalysisGroup2;

    @JoinColumn(name = "ROLEANALYSISGROUP3_CODE", referencedColumnName = "roleAnalysisGroup3Code")
    @OneToOne
    protected RoleAnalysisGroup roleAnalysisGroup3;

    @JoinColumn(name = "ROLEANALYSISGROUP4_CODE", referencedColumnName = "roleAnalysisGroup4Code")
    @OneToOne
    protected RoleAnalysisGroup roleAnalysisGroup4;

    @JoinColumn(name = "ROLEANALYSISGROUP5_CODE", referencedColumnName = "roleAnalysisGroup5Code")
    @OneToOne
    protected RoleAnalysisGroup roleAnalysisGroup5;

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
