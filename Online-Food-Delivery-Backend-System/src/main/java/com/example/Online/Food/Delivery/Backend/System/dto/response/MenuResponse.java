package com.example.Online.Food.Delivery.Backend.System.dto.response;

import lombok.*;

        import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MenuResponse {

    private String restaurantName;

    private List<FoodItemResponse> footItems;
}