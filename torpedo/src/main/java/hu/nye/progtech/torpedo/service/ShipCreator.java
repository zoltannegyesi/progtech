package hu.nye.progtech.torpedo.service;

import hu.nye.progtech.torpedo.ui.UserInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

public class ShipCreator {

    ShipInputChecker shipInputChecker;
    UserInput userInput;

    public ShipCreator(ShipInputChecker shipInputChecker, UserInput userInput) {
        System.out.println("asdasd");
        this.shipInputChecker = shipInputChecker;
        this.userInput = userInput;
    }


    public void createShip() {

        //System.out.println(shipInputChecker.isValidInput(userInput.bigShipScanning()));
    }

}
