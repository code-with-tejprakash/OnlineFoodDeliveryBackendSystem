package com.example.Online.Food.Delivery.Backend.System.resporitory;
import com.example.Online.Food.Delivery.Backend.System.controller.CustomerController;
import com.example.Online.Food.Delivery.Backend.System.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {
}