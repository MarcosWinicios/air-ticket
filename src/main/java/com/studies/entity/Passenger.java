package com.studies.entity;

public class Passenger {
    private String name;
    private PassengerType type;

    public  Passenger (String name, PassengerType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public PassengerType getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setType(PassengerType type) {
        this.type = type;
    }
}
