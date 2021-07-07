package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService{

    public void inform(User user){
        System.out.println("Sending information about order to user: " + user.getName() + " " + user.getSurname());
    }
}
