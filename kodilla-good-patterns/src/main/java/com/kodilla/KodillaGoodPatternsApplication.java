package com.kodilla;

import com.kodilla.good.patterns.challenges.MovieStore;
import com.kodilla.good.patterns.challenges.TitleDisplay;
import org.springframework.boot.SpringApplication;
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
    }

}
