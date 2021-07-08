package com.kodilla.good.patterns.flights;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearchEngineFromCity {

    public Set<Flight> searchFlightFromCity(Set<Flight> flightsList, String cityOfDeparture) {

        return flightsList.stream().filter(e-> e.getDeparture().equals(cityOfDeparture)).collect(Collectors.toSet());
    }
}
