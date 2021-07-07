package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;


public class SuppliersRetrieval {

    public List<Supplier> retrieveSuppliers() {
        List<Supplier> listOfSuppliers = new ArrayList<>();

        listOfSuppliers.add(new Supplier("Extra Food Shop", "Coconut Milk", 50));
        listOfSuppliers.add(new Supplier("Healthy Shop", "Carrot", 1000));
        listOfSuppliers.add(new Supplier("Gluten Free Shop", "Gluten free flower", 60));

        return new ArrayList<>(listOfSuppliers);
    }
}
