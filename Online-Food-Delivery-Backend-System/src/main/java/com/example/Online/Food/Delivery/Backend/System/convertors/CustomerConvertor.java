package com.example.Online.Food.Delivery.Backend.System.convertors;

import com.example.Online.Food.Delivery.Backend.System.dto.request.CustomerRequest;
import com.example.Online.Food.Delivery.Backend.System.dto.response.CustomerResponse;
import com.example.Online.Food.Delivery.Backend.System.models.Customer;

import java.util.ArrayList;

public class CustomerConvertor {

    public static Customer customerRequestToCustomer(CustomerRequest customerRequest) {
        return Customer.builder()
                .name(customerRequest.getName())
                .email(customerRequest.getEmail())
                .gender(customerRequest.getGender())
                .mobNo(customerRequest.getMobNo())
                .address(customerRequest.getAddress())
                .foodOrders(new ArrayList<>())
                .build();
    }

    public static CustomerResponse customerToCustomerResponse(Customer customer) {
        return CustomerResponse.builder()
                .name(customer.getName())
                .message("Registration successful")
                .build();
    }
}