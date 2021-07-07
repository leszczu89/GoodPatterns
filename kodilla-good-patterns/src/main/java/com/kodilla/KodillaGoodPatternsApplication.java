package com.kodilla;

import com.kodilla.good.patterns.challenges.*;
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

        //Product Order Service:

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new MailService(), new FoodOrderService(), new ProductOrderRepository());
        productOrderProcessor.process(orderRequest);
    }

}
