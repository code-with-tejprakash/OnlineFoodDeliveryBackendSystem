package com.example.Online.Food.Delivery.Backend.System.controller;

import com.example.Online.Food.Delivery.Backend.System.dto.request.CustomerRequest;
import com.example.Online.Food.Delivery.Backend.System.dto.response.CustomerResponse;
import com.example.Online.Food.Delivery.Backend.System.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/add")
    public ResponseEntity<CustomerResponse> addCustomer(
            @RequestBody CustomerRequest customerRequest) {

        CustomerResponse customerResponse =
                customerService.addCustomer(customerRequest);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(customerResponse);
    }
}