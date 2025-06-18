package com.studies.service;

import com.studies.entity.Flight;

public class GoldTicketPrice implements  TicketPriceCalculator{

    @Override
    public double calculate(Flight flight) {
        if(flight.getPrice() > 500.0) {
            return calculateValueAboveLimit(flight);
        }
        return calculateValueBelowLimit(flight);
    }

    private static double calculateValueBelowLimit(Flight flight) {
        return flight.getPrice() * 0.9;
    }

    private static Double calculateValueAboveLimit(Flight flight) {
        return flight.getPrice() * 0.85;
    }


}
