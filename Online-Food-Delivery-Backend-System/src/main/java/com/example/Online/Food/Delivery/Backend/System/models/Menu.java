package com.example.Online.Food.Delivery.Backend.System.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
        import lombok.*;

        import javax.print.attribute.standard.MediaSize;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "restaurant_id")
    @JsonIgnore
    private Restaurant restaurant;

    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL)
    private List<FoodItem> foodItems;
}