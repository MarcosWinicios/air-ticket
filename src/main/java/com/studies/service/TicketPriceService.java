package com.studies.service;

import com.studies.entity.Flight;
import com.studies.entity.Passenger;

/***
 * * This service calculates the ticket price based on the passenger type and flight price.
 * * - For GOLD passengers:
 * *   - If the flight price is above 500.0, a 15% discount is applied.
 * *   - Otherwise, a 10% discount is applied.
 * * - For SILVER passengers:
 * *   - If the flight price is above 700.0, a 10% discount is applied.
 * *   - Otherwise, a 6% discount is applied.
 */
public class TicketPriceService {
    public double calculate(Passenger passenger, Flight flight) {
        return passenger.getType().getTicketPriceCalculator().calculate(flight);
    }
}
