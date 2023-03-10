package com.swms.wms.warehouse.work_station.domain.entity;

import lombok.Data;

import java.util.List;

@Data
public class PutWallSlot {
    private Long id;
    private String putWallCode;
    private String stationCode;

    private String slotCode;
    private String groupCode;
    private Integer level;
    private Integer bay;
    private boolean enable;

    private List<Long> orderIds;

    private String transferContainerCode;
}
