package com.city.truck.mapper;

import com.city.truck.entity.FoodTruckEntity;
import com.city.truck.pojo.FoodTruck;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class FoodTruckMapper implements BaseMapper<FoodTruckEntity, FoodTruck>{
    @Override
    public FoodTruckEntity toEntity(FoodTruck pojo) {
        return null;
    }

    @Override
    public List<FoodTruckEntity> toEntities(List<FoodTruck> pojoList) {
        return null;
    }

    @Override
    public FoodTruck toPoJo(FoodTruckEntity entity) {
        return FoodTruck.builder()
                .locationId(entity.getLocationId())
                .applicant(entity.getApplicant())
                .facilityType(entity.getFacilityType())
                .status(entity.getStatus())
                .foodItems(entity.getFoodItems())
                .address(entity.getAddress())
                .locationDescription(entity.getLocationDescription())
                .zipCodes(entity.getZipCodes())
                .build();
    }

    @Override
    public List<FoodTruck> toPojos(List<FoodTruckEntity> entityList) {
        return entityList == null ?
                Collections.emptyList() : entityList.stream()
                .map(this::toPoJo).collect(Collectors.toList());
    }
}
