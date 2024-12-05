package io.mosip.pms.device.authdevice.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@SqlResultSetMapping(
        name = "Mapping.SbiSummaryEntity",
        classes = { @ConstructorResult(
                targetClass = SbiSummaryEntity.class,
                columns = {
                        @ColumnResult(name = "partnerId", type = String.class),
                        @ColumnResult(name = "orgName", type = String.class),
                        @ColumnResult(name = "partnerType", type = String.class),
                        @ColumnResult(name = "sbiId", type = String.class),
                        @ColumnResult(name = "sbiVersion", type = String.class),
                        @ColumnResult(name = "status", type = String.class),
                        @ColumnResult(name = "isActive", type = Boolean.class),
                        @ColumnResult(name = "sbiCreatedDateTime", type = LocalDateTime.class),
                        @ColumnResult(name = "sbiExpiryDateTime", type = LocalDateTime.class),
                        @ColumnResult(name = "createdDateTime", type = LocalDateTime.class),
                        @ColumnResult(name = "countOfAssociatedDevices", type = Long.class),
                        @ColumnResult(name = "sbiExpiryStatus", type = String.class)
                })
        }
)
public class SbiSummaryEntity {

    public SbiSummaryEntity(String partnerId, String orgName, String partnerType, String sbiId, String sbiVersion,
                            String status, Boolean isActive, LocalDateTime sbiCreatedDateTime,
                            LocalDateTime sbiExpiryDateTime, LocalDateTime createdDateTime,
                            Long countOfAssociatedDevices, String sbiExpiryStatus) {
        this.partnerId = partnerId;
        this.orgName = orgName;
        this.partnerType = partnerType;
        this.sbiId = sbiId;
        this.sbiVersion = sbiVersion;
        this.status = status;
        this.isActive = isActive;
        this.sbiCreatedDateTime = sbiCreatedDateTime;
        this.sbiExpiryDateTime = sbiExpiryDateTime;
        this.createdDateTime = createdDateTime;
        this.countOfAssociatedDevices = countOfAssociatedDevices;
        this.sbiExpiryStatus = sbiExpiryStatus;
    }

    // No-argument constructor
    public SbiSummaryEntity() {
        super();
    }

    private String partnerId;

    private String orgName;

    private String partnerType;

    @Id
    private String sbiId;

    private String sbiVersion;

    private String status;

    private Boolean isActive;

    private LocalDateTime sbiCreatedDateTime;

    private LocalDateTime sbiExpiryDateTime;

    private LocalDateTime createdDateTime;

    private Long countOfAssociatedDevices;

    private String sbiExpiryStatus;
}
