package com.example.Online.Food.Delivery.Backend.System.convertors;

import com.example.Online.Food.Delivery.Backend.System.dto.request.RestaurantRequest;
import com.example.Online.Food.Delivery.Backend.System.models.Restaurant;

public class RestaurantConvertor {

    public static Restaurant restaurantRequestToRestaurant(RestaurantRequest request) {
        return Restaurant.builder()
                .name(request.getName())
                .location(request.getLocation())
                .restaurantType(request.getRestaurantType())
                .contactNo(request.getContactNo())
                .build();
    }
}