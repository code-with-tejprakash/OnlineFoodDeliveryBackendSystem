package com.example.Online.Food.Delivery.Backend.System.dto.response;

import com.example.Online.Food.Delivery.Backend.System.models.enums.FoodCategory;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FoodItemResponse {

    private String name;

    private double price;

    private boolean isVeg;

    private FoodCategory foodCategory;
}