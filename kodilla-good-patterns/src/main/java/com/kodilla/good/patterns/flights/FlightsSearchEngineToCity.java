package com.kodilla.good.patterns.flights;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightsSearchEngineToCity {

    public Set<Flight> searchFlightToCity(Set<Flight> flightsList, String cityOfArrival) {

        return flightsList.stream().filter(e-> e.getArrival().equals(cityOfArrival)).collect(Collectors.toSet());
    }
}
