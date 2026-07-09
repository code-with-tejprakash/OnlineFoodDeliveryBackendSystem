package com.example.Online.Food.Delivery.Backend.System.controller;

import com.example.Online.Food.Delivery.Backend.System.dto.request.FoodItemRequest;
import com.example.Online.Food.Delivery.Backend.System.dto.response.MenuResponse;
import com.example.Online.Food.Delivery.Backend.System.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/menu")
@RequiredArgsConstructor
public class MenuController {

    private final MenuService menuService;

    @PostMapping("/register")
    public ResponseEntity<MenuResponse> registerMenu(
            @RequestParam("restaurant-id") int restaurantId,
            @RequestBody List<FoodItemRequest> foodItemRequests) {

        MenuResponse response = menuService.registerMenu(restaurantId, foodItemRequests);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}