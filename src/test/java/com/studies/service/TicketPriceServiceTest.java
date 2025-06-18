package com.studies.service;

import com.studies.entity.Flight;
import com.studies.entity.Passenger;
import com.studies.entity.PassengerType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicketPriceServiceTest {

    private TicketPriceService ticketPriceService;

    @Before
    public void setUp() {
        ticketPriceService = new TicketPriceService();
    }

    private void assertTicketPrice(Passenger passenger, Flight flight, double expectedPrice) {
        double price = ticketPriceService.calculate(passenger, flight);
        assertEquals(expectedPrice, price, 0.0001);
    }

    @Test
    public void shouldCalculateTicketPriceForGoldPassenger_withValueBelowLimit() throws Exception {
        Passenger passenger = new Passenger("João", PassengerType.GOLD);
        Flight flight = new Flight("São Paulo", "Rio de Janeiro", 100.00);

        this.assertTicketPrice(passenger, flight, 90.0);

    }

    @Test
    public void shouldCalculateTicketPriceForGoldPassenger_withValueAboveLimit() throws Exception {
        Passenger passenger = new Passenger("Maria", PassengerType.GOLD);
        Flight flight = new Flight("São Paulo", "Rio de Janeiro", 600.00);

        this.assertTicketPrice(passenger, flight, 510.0);
    }

    @Test
    public void shouldCalculateTicketPriceForSilverPassenger_withValueBelowLimit() throws Exception{
        Passenger passenger = new Passenger("Carlos", PassengerType.SILVER);
        Flight flight = new Flight("São Paulo", "Rio de Janeiro", 100.00);

        this.assertTicketPrice(passenger, flight, 94.0);
    }

    @Test
    public void shouldCalculateTicketPriceForSilverPassenger_withValueAboveLimit() throws Exception{
        Passenger passenger = new Passenger("Carlos", PassengerType.SILVER);
        Flight flight = new Flight("São Paulo", "Rio de Janeiro", 800.00);

        this.assertTicketPrice(passenger, flight, 720.0);
    }

}
