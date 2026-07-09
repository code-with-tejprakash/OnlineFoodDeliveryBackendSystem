package com.example.Online.Food.Delivery.Backend.System.models;

import com.example.Online.Food.Delivery.Backend.System.models.enums.OrderStatus;
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
class FoodOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double totalValue;

    private OrderStatus status;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    @JsonIgnore
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "delivery_partner_id")
    @JsonIgnore
    private Deliverypartner deliveryPartner;

    @ManyToMany
    @JoinTable
    @JsonIgnore
    private List<FoodItem> foodItems;


}