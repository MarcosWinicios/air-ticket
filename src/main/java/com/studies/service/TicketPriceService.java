package com.studies.service;

import com.studies.Flight;
import com.studies.Passenger;
import com.studies.PassengerType;
import com.studies.exception.InvalidPassengerTypeException;

/***
 * * This service calculates the ticket price based on the passenger type and flight price.
 *
 * * - For GOLD passengers:
 * *   - If the flight price is above 500.0, a 15% discount is applied.
 * *   - Otherwise, a 10% discount is applied.
 * * - For SILVER passengers:
 * *   - If the flight price is above 700.0, a 10% discount is applied.
 * *   - Otherwise, a 6% discount is applied.
 */
public class TicketPriceService {
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
