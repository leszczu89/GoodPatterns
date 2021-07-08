package com.kodilla.good.patterns.flights;

import java.util.Set;

public class FlightsSearchEngine {

    public void searchForFlights(Flight flight) {

        FlightsRetrieval flightsRetrieval = new FlightsRetrieval();
        Set<Flight> flightsList = flightsRetrieval.retrieveFlights();

        FlightSearchEngineFromCity fightsFromCitySearcher = new FlightSearchEngineFromCity();
        Set<Flight> flightsFromCity = fightsFromCitySearcher.searchFlightFromCity(flightsList, flight.getDeparture());

        FlightsSearchEngineToCity flightsToCitySearcher = new FlightsSearchEngineToCity();
        Set<Flight> flightsToCity = flightsToCitySearcher.searchFlightToCity(flightsList, flight.getArrival());

        DirectFlightSearchEngine directFlightSearchEngine = new DirectFlightSearchEngine();
        Set<Flight> directFlights = directFlightSearchEngine.searchForDirectFlight(flightsList, flight);

        SearchEngineForConnectingFlights searchEngineForConnectingFlights = new SearchEngineForConnectingFlights();
        Set<ConnectingFlights> connectingFlights = searchEngineForConnectingFlights.searchForConnectingFlights(flightsList, flight);

        FlightDisplay flightDisplay = new FlightDisplay();
        flightDisplay.displayFlightsFromCity(flightsFromCity);
        flightDisplay.displayFlightsToCity(flightsToCity);
        flightDisplay.displayDirectFlights(directFlights);
        flightDisplay.displayConnectingFlights(connectingFlights);
    }


}
