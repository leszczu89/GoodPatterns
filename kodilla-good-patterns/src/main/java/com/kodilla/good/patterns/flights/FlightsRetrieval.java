package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightsRetrieval {

    public Set<Flight> retrieveFlights() {

        Set<Flight> flightList = new HashSet<>();

        flightList.add(new Flight("Warsaw", "Wroclaw"));
        flightList.add(new Flight("Cracow", "Gdansk"));
        flightList.add(new Flight("Lublin", "Poznan"));
        flightList.add(new Flight("Poznan", "Warsaw"));
        flightList.add(new Flight("Gdansk", "Bydgoszcz"));
        flightList.add(new Flight("Warsaw", "Cracow"));
        flightList.add(new Flight("Wroclaw", "Warsaw"));
        flightList.add(new Flight("Cracow", "Warsaw"));
        flightList.add(new Flight("Warsaw", "Lublin"));
        flightList.add(new Flight("Katowice", "Cracow"));
        flightList.add(new Flight("Warsaw", "Katowice"));
        flightList.add(new Flight("Bydgoszcz", "Warsaw"));

        return new HashSet<>(flightList);
    }
}
