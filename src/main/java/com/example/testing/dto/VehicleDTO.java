package com.example.testing.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class VehicleDTO {
    private int id;
    private String vehicleNo;
    private String vehicleType;
    private String fuelType;
    private int noOfSeats;
    private int pricePerKm;


}
