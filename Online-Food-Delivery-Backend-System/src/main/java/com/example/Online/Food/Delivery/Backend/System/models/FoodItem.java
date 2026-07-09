package com.example.Online.Food.Delivery.Backend.System.models;

import com.example.Online.Food.Delivery.Backend.System.models.enums.FoodCategory;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
        import lombok.*;

        import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class FoodItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private double price;

    private boolean isVeg; // wrong. correct -> veg

    private FoodCategory foodCategory;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    @JsonIgnore
    private Menu menu;

    @ManyToMany(mappedBy = "foodItems")
    private List<FoodOrder> foodOrders;
}