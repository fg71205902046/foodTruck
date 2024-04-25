package com.city.truck.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;


@Builder
@Getter
@ApiModel(value = "the model of food truck")
public class FoodTruck {
    @ApiModelProperty(value = "the identification of food truck")
    private Long locationId;

    @ApiModelProperty(value = "the applicant of food truck")
    private String applicant;

    @ApiModelProperty(value = "the facility type of food truck")
    private String facilityType;


    @ApiModelProperty(value = "the description of location")
    private String locationDescription;

    @ApiModelProperty(value = "the address of food truck")
    private String address;

    @ApiModelProperty(value = "the status of food truck")
    private String status;

    @ApiModelProperty(value = "the items of food")
    private String foodItems;

    @ApiModelProperty(value = "the latitude of location")
    private String latitude;

    @ApiModelProperty(value = "the longitude of location")
    private String longitude;

    @ApiModelProperty(value = "the zip codes of location")
    private String zipCodes;
}
