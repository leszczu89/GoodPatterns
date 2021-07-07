package com.kodilla.good.patterns.food2door;

public class MailService {

    public void inform(OrderDto orderDto, User user) {

        System.out.println("Sending information from supplier to: "+ user.getName()+ " " +user.getSurname()+ ": \n"+ orderDto.info);
    }
}
