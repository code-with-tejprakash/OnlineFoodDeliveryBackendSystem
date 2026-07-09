package com.example.Online.Food.Delivery.Backend.System.service;

import com.example.Online.Food.Delivery.Backend.System.convertors.RestaurantConvertor;
import com.example.Online.Food.Delivery.Backend.System.dto.request.RestaurantRequest;
import com.example.Online.Food.Delivery.Backend.System.models.Restaurant;
import com.example.Online.Food.Delivery.Backend.System.resporitory.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepo restaurantRepo;

    public String addRestaurant(RestaurantRequest request) {
        Restaurant restaurant = RestaurantConvertor.restaurantRequestToRestaurant(request);
        restaurantRepo.save(restaurant);
        return "Restaurant saved successfully";
    }
}