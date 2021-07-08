package com.kodilla.good.patterns.flights;

import java.util.Set;
import java.util.stream.Collectors;

public class DirectFlightSearchEngine {

    public Set<Flight> searchForDirectFlight(Set<Flight> flightsList, Flight flight) {

        return flightsList.stream().filter(e-> e.getDeparture().equals(flight.getDeparture()))
                .filter(e-> e.getArrival().equals(flight.getArrival()))
                .collect(Collectors.toSet());
    }
}
