package com.studies.service;

import com.studies.Flight;
import com.studies.Passenger;
import com.studies.PassengerType;
import org.junit.Before;
import org.junit.Test;

public class TicketPriceServiceTest {

    private TickerPriceService tickerPriceService;

    @Before
    public void setUp() {
        tickerPriceService = new TickerPriceService();
    }

    @Test
    public void shouldAllowCallingValueCalculation() throws Exception {
        Passenger passenger = new Passenger("João", PassengerType.GOLD);

        Flight flight = new Flight("São Paulo", "Rio de Janeiro", 100.00);

        double price = tickerPriceService.calculate(passenger, flight);
    }



}
