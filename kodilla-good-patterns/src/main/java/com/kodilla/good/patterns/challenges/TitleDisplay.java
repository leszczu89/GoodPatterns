package com.kodilla.good.patterns.challenges;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TitleDisplay {

    public void displayTitles(Map<String, List<String>> mapWithMovies) {

        Collection<List<String>> valuesList = mapWithMovies.values();
        String titles = valuesList.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.joining("!"));
        System.out.println(titles);
    }
}
