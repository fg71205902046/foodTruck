package com.city.truck.exceptionhandler;

import com.city.truck.exception.BaseException;
import com.city.truck.exception.ErrorResponse;
import com.city.truck.exception.FoodTruckErrorCode;
import com.city.truck.exception.FoodTruckException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * business exception
     * @param ex
     * @param request
     * @return ErrorResponse
     */
    @ExceptionHandler(BaseException.class)
    public ErrorResponse handleBusinessException(BaseException ex,
                                                 HttpServletRequest request) {
        log.error("Business exception：url:{}，parameter：{}",
                request.getRequestURI(), request.getQueryString(), ex);
        return new ErrorResponse(ex, request.getRequestURI());
    }

    /**
     * Exception
     * @param ex
     */
    @ExceptionHandler({Exception.class})
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse exceptionHandler(Exception ex, HttpServletRequest request) {
        log.error("Exception：url:{}，parameters：{}",
                request.getRequestURI(), request.getQueryString(), ex);
        return this.handleBusinessException(
                new FoodTruckException(FoodTruckErrorCode.INTERNAL_SERVER_ERROR,
                ex.getMessage()),request);
    }
}