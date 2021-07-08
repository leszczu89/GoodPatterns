package com.kodilla.good.patterns.flights;

public class ConnectingFlights {

    private Flight firstFlight;
    private Flight secondFlight;

    public ConnectingFlights(Flight firstFlight, Flight secondFlight) {
        this.firstFlight = firstFlight;
        this.secondFlight = secondFlight;
    }

    @Override
    public String toString() {
        return "ConnectingFlights{" +
                "firstFlight=" + firstFlight +
                ", secondFlight=" + secondFlight +
                '}';
    }
}
