package com.studies.service;

import com.studies.Flight;
import com.studies.Passenger;
import com.studies.PassengerType;
import com.studies.exception.InvalidPassengerTypeException;

public class TickerPriceService {
    public double calculate(Passenger passenger, Flight flight) {
        if(passenger.getType().equals(PassengerType.GOLD)){
            if(flight.getPrice() > 500.0) {
                return flight.getPrice() * 0.85; // 15% discount for GOLD passengers above 500
            }
            return flight.getPrice() * 0.9; // 10% discount for GOLD passengers
        }else if (passenger.getType().equals(PassengerType.SILVER)){
            if(flight.getPrice() > 700.0){
                return flight.getPrice() * 0.9; // 10% discount for SILVER passengers above 700
            }
            return flight.getPrice() * 0.94; // 6% discount for SILVER passengers
        }
        throw new InvalidPassengerTypeException();
    }
}
