package com.example.Online.Food.Delivery.Backend.System.controller;

import com.example.Online.Food.Delivery.Backend.System.dto.request.RestaurantRequest;
import com.example.Online.Food.Delivery.Backend.System.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/restaurant")
@RequiredArgsConstructor
class RestaurantController {

    private final RestaurantService restaurantService;

    @PostMapping("/add")
    public ResponseEntity<String> addRestaurant(@RequestBody RestaurantRequest request) {

        String response = restaurantService.addRestaurant(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}