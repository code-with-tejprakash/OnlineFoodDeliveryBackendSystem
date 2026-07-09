package com.example.Online.Food.Delivery.Backend.System.dto.request;

import com.example.Online.Food.Delivery.Backend.System.models.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequest {

    private String name;

    private String email;

    private Gender gender;

    private long mobNo;

    private String address;
}