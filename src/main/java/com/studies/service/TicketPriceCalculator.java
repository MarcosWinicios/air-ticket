package com.studies.service;

import com.studies.entity.Flight;

public interface TicketPriceCalculator {

    public double calculate(Flight flight);
}
