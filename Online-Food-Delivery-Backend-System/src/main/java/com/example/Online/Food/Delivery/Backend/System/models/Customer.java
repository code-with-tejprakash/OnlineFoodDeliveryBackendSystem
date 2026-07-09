package com.example.Online.Food.Delivery.Backend.System.models;

import com.example.Online.Food.Delivery.Backend.System.models.enums.Gender;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Email
    @Column(unique = true, nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;

    @Column(unique = true, nullable = false)
    private long mobNo;

    @Column(nullable = false)
    private String address;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<FoodOrder> foodOrders;
}