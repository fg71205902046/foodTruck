package com.city.truck.exception;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

@Data
public class ErrorResponse {

    private int code;

    @JsonIgnore
    private int status;

    private String msg;

    private String path;

    private Date dateTime;

    private Object data = new Object();

    private Boolean success=false;

    public ErrorResponse() {
    }

    /**
     * unknown error, non-business error
     * @param msg error message
     * @param path interface path
     */
    public ErrorResponse(String msg,String path) {
        this(100000, 500, msg, path, null);
    }

    public ErrorResponse(BaseException ex, String path) {
        this(ex.getError().getCode(), ex.getError().getStatus().value(),
                ex.getError().getMsg(), path, ex.getData());
    }

    public ErrorResponse(int code, int status, String message, String path, Object data) {
        this.code = code;
        this.status = status;
        this.msg = message;
        this.path = path;
        this.dateTime = new Date();
        this.data=data;
    }
}