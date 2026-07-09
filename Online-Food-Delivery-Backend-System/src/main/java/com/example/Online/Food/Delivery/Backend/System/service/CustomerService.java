package com.example.Online.Food.Delivery.Backend.System.service;

import com.example.Online.Food.Delivery.Backend.System.convertors.CustomerConvertor;
import com.example.Online.Food.Delivery.Backend.System.dto.request.CustomerRequest;
import com.example.Online.Food.Delivery.Backend.System.dto.response.CustomerResponse;
import com.example.Online.Food.Delivery.Backend.System.models.Customer;
import com.example.Online.Food.Delivery.Backend.System.resporitory.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    public CustomerResponse addCustomer(CustomerRequest customerRequest) {
        Customer customer = CustomerConvertor.customerRequestToCustomer(customerRequest);
        Customer savedCustomer = customerRepo.save(customer);
        return CustomerConvertor.customerToCustomerResponse(savedCustomer);

    }
}