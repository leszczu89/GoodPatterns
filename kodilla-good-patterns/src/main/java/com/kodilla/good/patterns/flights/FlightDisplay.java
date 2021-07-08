package com.kodilla.good.patterns.flights;

import java.util.Set;

public class FlightDisplay {

    public void displayFlightsFromCity(Set<Flight> flights) {

        if (flights.isEmpty()){
            System.out.println("\nThere is no flights from given direction");
        } else {
            System.out.println("\nFlights from given direction: ");
            flights.forEach(System.out::print);
        }
    }
    public void displayFlightsToCity(Set<Flight> flights) {

        if (flights.isEmpty()){
            System.out.println("\nThere is no flights to given direction");
        } else {
            System.out.println("\nFlights to given direction: ");
            flights.forEach(System.out::print);
        }
    }
    public void displayDirectFlights(Set<Flight> flights) {

        if (flights.isEmpty()){
            System.out.println("\nThere is no direct flights");
        } else {
            System.out.println("\nDirect flights: ");
            flights.forEach(System.out::print);
        }
    }
    public void displayConnectingFlights(Set<ConnectingFlights> flights) {

        if (flights.isEmpty()){
            System.out.println("\nThere are no connecting flights");
        } else {
            System.out.println("\nConnecting flights: ");
            flights.forEach(System.out::print);
        }
    }
}
