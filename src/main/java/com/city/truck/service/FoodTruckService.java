package com.city.truck.service;

import com.city.truck.entity.FoodTruckEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface FoodTruckService {
    public Optional<FoodTruckEntity> findFoodTruckByLocationId(Long locationId);

    Page<FoodTruckEntity> findFoodTrucksByAddress(String address, Pageable page);
}
