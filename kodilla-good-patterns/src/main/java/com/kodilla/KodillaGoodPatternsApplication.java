package com.kodilla;

import com.kodilla.good.patterns.challenges.*;
import com.kodilla.good.patterns.flights.Flight;
import com.kodilla.good.patterns.flights.FlightsSearchEngine;
import com.kodilla.good.patterns.food2door.ExtraFoodShopProcessor;
import com.kodilla.good.patterns.food2door.OrderRetrieval;
import com.kodilla.good.patterns.food2door.OrderService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class KodillaGoodPatternsApplication {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> moviesMap = movieStore.getMovies();

        TitleDisplay titleDisplay = new TitleDisplay();
        titleDisplay.displayTitles(moviesMap);

        System.out.println("\n");
        //Product Order Service:

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new MailService(), new FoodOrderService(), new ProductOrderRepository());
        productOrderProcessor.process(orderRequest);

        System.out.println("\n");
        //food2door


        OrderService orderService = new OrderService(new ExtraFoodShopProcessor());
        orderService.orderProduct(new OrderRetrieval());

        //Flights search engine

        FlightsSearchEngine flightsSearchEngine = new FlightsSearchEngine();
        flightsSearchEngine.searchForFlights(new Flight("Cracow", "Warsaw"));
    }

}
