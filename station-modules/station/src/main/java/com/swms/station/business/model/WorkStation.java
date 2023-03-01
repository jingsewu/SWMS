package com.swms.station.business.model;

import com.swms.common.constants.WorkStationOperationTypeEnum;
import com.swms.common.constants.WorkStationStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * definition：a place that operators working, only support one station one Operation Type at a time.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkStation {

    private String stationCode;

    private WorkStationStatusEnum workStationStatus;

    private String warehouseCode;
    private String warehouseAreaCode;
    private String warehouseLogicCode;

    private WorkStationOperationTypeEnum operationType;

    private List<WorkLocation> workLocations;

    private List<PutWall> putWalls;

    private List<OperateTask> operateTasks;

    private WorkStationConfig workStationConfig;

}
