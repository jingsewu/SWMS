package com.swms.station.business.model;

import com.google.common.collect.Maps;
import com.swms.common.utils.JsonUtils;
import com.swms.station.remote.WorkStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class WorkStationManagement {

    private static final Map<String, WorkStation> workStationMap = Maps.newConcurrentMap();

    @Autowired
    private WorkStationService workStationService;

    public synchronized WorkStation initWorkStation(String stationCode) {

        Object workStationObj = workStationService.queryWorkStation(stationCode);
        WorkStation workStation = JsonUtils.string2Object(JsonUtils.obj2String(workStationObj), WorkStation.class);
        workStationMap.put(stationCode, workStation);

        return workStation;
    }

    public WorkStation getWorkStation(String stationCode) {
        return workStationMap.get(stationCode);
    }

    public void removeWorkStation(String stationCode) {
        workStationMap.remove(stationCode);
    }

}
