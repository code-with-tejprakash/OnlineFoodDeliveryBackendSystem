package com.example.Online.Food.Delivery.Backend.System.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerResponse {

    private String name;
    private String message;
}