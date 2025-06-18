package com.studies.service;

import com.studies.entity.Flight;

public interface TicketPriceCalculator {

    double calculate(Flight flight);
}
