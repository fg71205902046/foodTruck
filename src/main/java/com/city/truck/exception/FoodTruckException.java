package com.city.truck.exception;

public class FoodTruckException extends BaseException{
    public FoodTruckException(BaseErrorCode error, Object data) {
        super(error, data);
    }

    public FoodTruckException(BaseErrorCode error) {
        super(error, null);
    }
}
