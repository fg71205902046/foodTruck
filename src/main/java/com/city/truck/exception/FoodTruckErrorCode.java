package com.city.truck.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum FoodTruckErrorCode implements BaseErrorCode{
    /**
     * success request
     */
    OK(100000, HttpStatus.BAD_REQUEST, "success"),

    /**
     * bad request
     */
    BAD_REQUEST(100001, HttpStatus.BAD_REQUEST, "bad request"),

    /**
     * entity not found
     */
    ENTITY_NOT_FOUND(100002, HttpStatus.NOT_FOUND, "resource not found"),

    /**
     * server internal error
     */
    INTERNAL_SERVER_ERROR(100003, HttpStatus.INTERNAL_SERVER_ERROR, "internal server error"),

    /**
     * rate limit error
     */
    TOO_MANY_REQUESTS(100004, HttpStatus.TOO_MANY_REQUESTS, "rate limit error"),

    /**
     * 超过API一天访问次数
     */
    DAILY_TOO_MANY_REQUESTS(100005, HttpStatus.FORBIDDEN, "access forbidden");

    private final int code;

    private final HttpStatus status;

    private final String msg;

    FoodTruckErrorCode(int code, HttpStatus status, String msg) {
        this.code = code;
        this.status = status;
        this.msg = msg;
    }
}
