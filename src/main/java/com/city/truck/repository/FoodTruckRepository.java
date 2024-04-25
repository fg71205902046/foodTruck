package com.city.truck.repository;

import com.city.truck.entity.FoodTruckEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FoodTruckRepository extends CrudRepository<FoodTruckEntity, Long> {

    Page<FoodTruckEntity> findByAddressLike(String address, Pageable page);

    Page<FoodTruckEntity> findByAddressContainingIgnoreCase(String address, Pageable page);
}
