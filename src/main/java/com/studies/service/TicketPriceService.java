package com.studies.service;

import com.studies.entity.Flight;
import com.studies.entity.Passenger;

public class TicketPriceService {
    public double calculate(Passenger passenger, Flight flight) {
        return passenger.getType().getTicketPriceCalculator().calculate(flight);
    }
}
