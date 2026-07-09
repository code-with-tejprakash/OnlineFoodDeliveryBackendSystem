package com.example.Online.Food.Delivery.Backend.System.models;

import jakarta.persistence.*;
        import lombok.*;

        import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
class Deliverypartner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private long mobNo;

    private String vehicleNo;

    private double rating;

    @OneToMany(mappedBy = "deliveryPartner")
    private List<FoodOrder> foodOrders;
}