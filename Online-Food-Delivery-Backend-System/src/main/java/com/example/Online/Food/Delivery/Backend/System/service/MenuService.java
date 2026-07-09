package com.example.Online.Food.Delivery.Backend.System.service;

import com.example.Online.Food.Delivery.Backend.System.convertors.FoodItemConvertor;
import com.example.Online.Food.Delivery.Backend.System.dto.request.FoodItemRequest;
import com.example.Online.Food.Delivery.Backend.System.dto.response.FoodItemResponse;
import com.example.Online.Food.Delivery.Backend.System.dto.response.MenuResponse;
import com.example.Online.Food.Delivery.Backend.System.exceptions.RestaurantNotFoundException;
import com.example.Online.Food.Delivery.Backend.System.models.FoodItem;
import com.example.Online.Food.Delivery.Backend.System.models.Menu;
import com.example.Online.Food.Delivery.Backend.System.models.Restaurant;
import com.example.Online.Food.Delivery.Backend.System.resporitory.MenuRepo;
import com.example.Online.Food.Delivery.Backend.System.resporitory.RestaurantRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MenuService {

    private final RestaurantRepo restaurantRepo;

    private final MenuRepo menuRepo;

    public MenuResponse registerMenu(int restaurantId,
                                     List<FoodItemRequest> foodItemRequests) {

        Optional<Restaurant> restaurantOptional = restaurantRepo.findById(restaurantId);

        if (restaurantOptional.isEmpty()) {
            throw new RestaurantNotFoundException("Invalid restaurant id: " + restaurantId);
        }

        Restaurant restaurant = restaurantOptional.get();

        Menu menu = new Menu();
        menu.setRestaurant(restaurant);

        List<FoodItem> foodItems = new ArrayList<>();

        for (FoodItemRequest request : foodItemRequests) {
            FoodItem item = FoodItemConvertor.foodItemRequestToFoodItem(request);
            item.setMenu(menu);
            foodItems.add(item);
        }

        menu.setFoodItems(foodItems);

        Menu savedMenu = menuRepo.save(menu);

        MenuResponse menuResponse = new MenuResponse();
        menuResponse.setRestaurantName(savedMenu.getRestaurant().getName());

        List<FoodItemResponse> foodItemResponses = new ArrayList<>();

        for (FoodItem item : savedMenu.getFoodItems()) {
            foodItemResponses.add(FoodItemConvertor.foodItemToFoodItemResponse(item));
        }

        menuResponse.setFootItems(foodItemResponses);

        return menuResponse;
    }
}