package com.city.truck.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "food_truck")
@Data
@ToString
public class FoodTruckEntity {
    @Id
    @Column(name = "location_id")
    @Schema(description = "the identification of food truck")
    private Long locationId;

    @Column(name = "applicant")
    @Schema(description = "the applicant of food truck")
    private String applicant;

    @Column(name = "facility_type")
    @Schema(description = "the facility type of food truck")
    private String facilityType;


    @Column(name = "location_description")
    @Schema(description = "the description of location")
    private String locationDescription;

    @Column(name = "address")
    @Schema(description = "the address of food truck")
    private String address;

    @Column(name = "status")
    @Schema(description = "the status of food truck")
    private String status;

    @Column(name = "food_items")
    @Schema(description = "the items of food")
    private String foodItems;

    @Column(name = "latitude")
    @Schema(description = "the latitude of location")
    private String latitude;

    @Column(name = "longitude")
    @Schema(description = "the longitude of location")
    private String longitude;

    @Column(name = "zip_codes")
    @Schema(description = "the zip codes of location")
    private String zipCodes;
}
