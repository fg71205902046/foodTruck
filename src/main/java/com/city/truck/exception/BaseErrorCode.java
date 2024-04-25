package com.city.truck.exception;

import org.springframework.http.HttpStatus;

public interface BaseErrorCode {
    /**
     * get error code
     * @return
     */
    int getCode();

    /**
     * get error message
     * @return
     */
    String getMsg();

    /**
     * get error status
     * @return
     */
    HttpStatus getStatus();
}
