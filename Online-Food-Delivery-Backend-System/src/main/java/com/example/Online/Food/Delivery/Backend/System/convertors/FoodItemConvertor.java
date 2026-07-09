package com.example.Online.Food.Delivery.Backend.System.convertors;
import com.example.Online.Food.Delivery.Backend.System.dto.request.FoodItemRequest;
import com.example.Online.Food.Delivery.Backend.System.dto.response.FoodItemResponse;
import com.example.Online.Food.Delivery.Backend.System.models.FoodItem;

import java.util.ArrayList;

public class FoodItemConvertor {

    public static FoodItem foodItemRequestToFoodItem(FoodItemRequest foodItemRequest) {

        return FoodItem.builder()
                .name(foodItemRequest.getName())
                .price(foodItemRequest.getPrice())
                .isVeg(foodItemRequest.isVeg())
                .foodCategory(foodItemRequest.getFoodCategory())
                .foodOrders(new ArrayList<>())
                .build();
    }

    public static FoodItemResponse foodItemToFoodItemResponse(FoodItem item) {

        return FoodItemResponse.builder()
                .name(item.getName())
                .price(item.getPrice())
                .isVeg(item.isVeg())
                .foodCategory(item.getFoodCategory())
                .build();
    }
}