package com.studies.service;

import com.studies.entity.Flight;

public class SilverTicketPrice implements  TicketPriceCalculator{

    @Override
    public double calculate(Flight flight) {
        if(flight.getPrice() > 700.0) {
            return calculateValueAboveLimit(flight); 
        }
        return calculateValueBelowLimit(flight);
    }

    private static double calculateValueBelowLimit(Flight flight) {
        return flight.getPrice() * 0.94;
    }

    private static Double calculateValueAboveLimit(Flight flight) {
        return flight.getPrice() * 0.9;
    }


}
