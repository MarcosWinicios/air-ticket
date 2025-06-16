package com.studies.service;

import com.studies.Flight;
import com.studies.Passenger;

public interface TicketPriceCalculator {

    public double calculate(Flight flight);
}
