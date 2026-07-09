package com.example.Online.Food.Delivery.Backend.System.resporitory;

import com.example.Online.Food.Delivery.Backend.System.models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepo extends JpaRepository<Restaurant,Integer> {
}