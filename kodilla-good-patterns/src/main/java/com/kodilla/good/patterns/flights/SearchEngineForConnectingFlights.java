package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class SearchEngineForConnectingFlights {

    public Set<ConnectingFlights> searchForConnectingFlights(Set<Flight> flightsList, Flight flight) {

        Set<ConnectingFlights> connectingFlightsSet = new HashSet<>();

        FlightSearchEngineFromCity flightSearchEngineFromCity = new FlightSearchEngineFromCity();
        Set<Flight> flightsFromCity = flightSearchEngineFromCity.searchFlightFromCity(flightsList, flight.getDeparture());

        FlightsSearchEngineToCity flightsSearchEngineToCity = new FlightsSearchEngineToCity();
        Set<Flight> flightsToCity = flightsSearchEngineToCity.searchFlightToCity(flightsList, flight.getArrival());

        for (Flight flight1: flightsFromCity) {
            for (Flight flight2: flightsToCity) {
                if (flight1.getArrival().equals(flight2.getDeparture())) {
                    connectingFlightsSet.add(new ConnectingFlights(flight1, flight2));
                }
            }
        }

        return connectingFlightsSet;
    }
}
