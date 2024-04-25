package com.city.truck.exception;

import lombok.Getter;

@Getter
public abstract class BaseException extends RuntimeException{
    private BaseErrorCode error;

    private Object data;
    public BaseException(BaseErrorCode error, Object data) {
        super(error.getMsg());
        this.error = error;
        this.data = data;
    }

    protected BaseException(BaseErrorCode error, Object data, Throwable throwable) {
        super(error.getMsg(), throwable);
        this.error = error;
        this.data = data;
    }
}
