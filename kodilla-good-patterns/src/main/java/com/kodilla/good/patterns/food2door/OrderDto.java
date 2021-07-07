package com.kodilla.good.patterns.food2door;

public class OrderDto {

    public boolean isAvailable;
    public String info;

    public OrderDto(boolean isAvailable, String info) {
        this.isAvailable = isAvailable;
        this.info = info;
    }


    public boolean isAvailable() {
        return isAvailable;
    }

    public String getInfo() {
        return info;
    }
}
