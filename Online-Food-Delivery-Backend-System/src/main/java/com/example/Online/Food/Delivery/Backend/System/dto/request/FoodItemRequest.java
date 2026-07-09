package com.example.Online.Food.Delivery.Backend.System.dto.request;

import com.example.Online.Food.Delivery.Backend.System.models.enums.FoodCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemRequest {

    private String name;

    private double price;

    private boolean isVeg;

    private FoodCategory foodCategory;
}