package com.example.Online.Food.Delivery.Backend.System.exceptions;

import org.hibernate.boot.MappingNotFoundException;

public class RestaurantNotFoundException extends RuntimeException{

    public RestaurantNotFoundException(String message) {
        super(message);
    }
}