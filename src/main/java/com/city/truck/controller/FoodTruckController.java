package com.city.truck.controller;

import com.city.truck.exception.FoodTruckErrorCode;
import com.city.truck.exception.FoodTruckException;
import com.city.truck.mapper.FoodTruckMapper;
import com.city.truck.pojo.FoodTruck;
import com.city.truck.service.FoodTruckService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@Api(description = "Food truck controller")
@RequestMapping(value = "/foodTrucks")
public class FoodTruckController {
    private final FoodTruckService foodTruckService;
    private final FoodTruckMapper mapper;

    @ApiOperation(value = "get food details by location Id",
            notes="This API will return food truck belongs to specific location Id")
    @ApiResponses(
            {
                    @ApiResponse(code = 400,  message= "cannot find food truck"),
                    @ApiResponse(code = 200, message = "food truck api succeeds")
            }
    )
    @GetMapping("/{locationId}")
    public FoodTruck getFoodTruck(@PathVariable Long locationId) {
        return foodTruckService
                .findFoodTruckByLocationId(locationId)
                .map(mapper::toPoJo)
                .orElseThrow(() -> new FoodTruckException(FoodTruckErrorCode.ENTITY_NOT_FOUND));
    }

    @ApiOperation(value = "get food truck list according to address",
            notes="This API will return food trucks belongs to specific address")
    @ApiResponses(
            {
                    @ApiResponse(code = 400,  message= "cannot find food truck"),
                    @ApiResponse(code = 200, message = "food truck api succeeds")
            }
    )
    @GetMapping()
    public List<FoodTruck> getFoodTruckList(@RequestParam String address, Pageable page) {
        return foodTruckService
                .findFoodTrucksByAddress(address, page)
                .stream()
                .map(mapper::toPoJo)
                .collect(Collectors.toList());
    }
}
