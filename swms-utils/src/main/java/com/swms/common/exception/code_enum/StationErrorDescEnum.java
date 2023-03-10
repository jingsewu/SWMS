package com.swms.common.exception.code_enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StationErrorDescEnum implements IBaseError {

    //station error SAT01
    STATION_BASE_ERROR("SAT010001", "station base error"),

    //work station location error SAT02


    //put wall error SAT03
    PUT_WALL_SLOT_ORDERS_EXIST("SAT030001", "put wall slot orders exist"),


    //work station config error SAT04


    //work station rules error SAT05

    ;


    private final String code;
    private final String desc;
}
