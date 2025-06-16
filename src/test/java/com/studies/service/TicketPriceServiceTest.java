package com.studies.service;

import com.studies.Flight;
import com.studies.Passenger;
import com.studies.PassengerType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicketPriceServiceTest {

    private TickerPriceService tickerPriceService;

    @Before
    public void setUp() {
        tickerPriceService = new TickerPriceService();
    }

    @Test
    public void shouldCalculateTicketPriceForGoldPassenger_withValueBelowLimit() throws Exception {
        TickerPriceService tickerPriceService = new TickerPriceService();

        Passenger passenger = new Passenger("João", PassengerType.GOLD);
        Flight flight = new Flight("São Paulo", "Rio de Janeiro", 100.00);

        double price = tickerPriceService.calculate(passenger, flight);

        // Assert that the price is calculated correctly for a GOLD passenger
        assertEquals(90.00, price, 0.0001);

    }

}
