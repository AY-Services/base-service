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
@Table( name = "DEVICE",
        uniqueConstraints={
                @UniqueConstraint(name="PK_DEVICESERIALNUMBER", columnNames={"DEVICESERIALNUMBER"})
        }
)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Device extends BaseEntity {

    @Id
    @Column(name = "DEVICESERIALNUMBER", nullable=false)
    private String deviceSerialNumber;

    @JoinColumn(name="BRANCH_CODE", referencedColumnName="branchCode")
    @OneToOne
    private Branch branch;

    @Column(name = "FCM_ADDRESS", length = 250, nullable=true)
    private String fcmAddress;

    @Column(name = "PRINTERIPADDRESS")
    private String printerIpAddress;

    @JoinColumn(name="PRINTERMODEL_CODE", referencedColumnName="printerModelCode")
    @OneToOne
    private PrinterModel printerModel;

    @Column(name = "LASTDOWNLOADDATE")
    private Date lastDownloadDate;

    @Column(name = "LASTTRANSFERDATE")
    private Date lastTransferDate;

    @Column(name = "LASTSUCCESSFULTRANSFER")
    private Boolean lastSuccessfulTransfer;

    @Column(name = "UPLOADINPROGRESS")
    private Boolean uploadInProgress;

    @Column(name = "DEVICEPHYSICALID", length = 250, nullable=true)
    private String  devicePhysicalId;

    @Column(name = "DEVICEIDDIGEST", length = 250, nullable=true)
    private String  deviceIdDigest;

    @Column(name = "DEVICEMODEL_CODE", length = 250, nullable=true)
    private String  deviceModelCode;

}
