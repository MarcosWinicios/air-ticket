package com.studies.service;

import com.studies.Flight;
import com.studies.Passenger;
import com.studies.PassengerType;

public class TickerPriceService {
    public double calculate(Passenger passenger, Flight flight) {
        if(passenger.getType().equals(PassengerType.GOLD)){
            return flight.getPrice() * 0.9; // 10% discount for GOLD passengers
        }
        return 0.0;
    }
}
