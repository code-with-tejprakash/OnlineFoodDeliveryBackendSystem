package com.example.Online.Food.Delivery.Backend.System.models;

import com.example.Online.Food.Delivery.Backend.System.models.enums.RestaurantType;
import jakarta.persistence.*;
        import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String location;

    private RestaurantType restaurantType;

    private long contactNo;

    @OneToOne(mappedBy = "restaurant", cascade = CascadeType.ALL)
    private Menu menu;
}