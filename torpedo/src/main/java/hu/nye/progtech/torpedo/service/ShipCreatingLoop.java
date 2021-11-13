package hu.nye.progtech.torpedo.service;


import hu.nye.progtech.torpedo.ui.UserInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

public class ShipCreatingLoop {

    //UserInput userInput;
    ShipCreator shipCreator;
    ShipInputChecker shipInputChecker;

    public ShipCreatingLoop(UserInput userInput, ShipInputChecker shipInputChecker) {
        //this.userInput = userInput;
        this.shipInputChecker = shipInputChecker;
    }

    @Bean
    public void scanShipCreating(ShipInputChecker shipInputChecker, UserInput userInput) {
        System.out.println("asd");
        shipCreator = new ShipCreator(shipInputChecker, userInput);
    }
}
