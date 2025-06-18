package com.studies.entity;

public class Flight {

    private String origin;
    private String destination;
    private double price;

    public Flight(String origin, String destination, double price) {
        this.origin = origin;
        this.destination = destination;
        this.price = price;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
