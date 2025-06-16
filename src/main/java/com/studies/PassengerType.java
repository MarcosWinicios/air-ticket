package com.studies;

import com.studies.service.GoldTicketPrice;
import com.studies.service.SilverTicketPrice;
import com.studies.service.TicketPriceCalculator;

public enum PassengerType {

    GOLD(new GoldTicketPrice()),
    SILVER(new SilverTicketPrice());

    TicketPriceCalculator ticketPriceCalculator;

    PassengerType(TicketPriceCalculator ticketPriceCalculator) {
        this.ticketPriceCalculator = ticketPriceCalculator;
    }

    public TicketPriceCalculator getTicketPriceCalculator() {
        return ticketPriceCalculator;
    }
}
