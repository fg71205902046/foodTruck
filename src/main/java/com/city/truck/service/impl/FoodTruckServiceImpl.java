package com.city.truck.service.impl;

import com.city.truck.entity.FoodTruckEntity;
import com.city.truck.repository.FoodTruckRepository;
import com.city.truck.service.FoodTruckService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@AllArgsConstructor
public class FoodTruckServiceImpl implements FoodTruckService {
    private final FoodTruckRepository foodTruckRepository;

    /**
     * find food truck by its location id
     * @param locationId
     * @return
     */
    @Override
    public Optional<FoodTruckEntity> findFoodTruckByLocationId(Long locationId) {
        return foodTruckRepository.findById(locationId);
    }

    /**
     * find food trucks by address
     * @param address
     * @return
     */
    @Override
    public Page<FoodTruckEntity> findFoodTrucksByAddress(String address, Pageable page) {
        return foodTruckRepository.findByAddressContainingIgnoreCase(address, page);
    }
}
