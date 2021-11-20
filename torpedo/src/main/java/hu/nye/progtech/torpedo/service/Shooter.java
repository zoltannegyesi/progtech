package hu.nye.progtech.torpedo.service;

import hu.nye.progtech.torpedo.model.GameState;
import hu.nye.progtech.torpedo.service.util.CoordinateConverter;
import hu.nye.progtech.torpedo.ui.UserInput;
import org.springframework.stereotype.Service;

@Service
public class Shooter {

    GameState gameState;
    UserInput userInput;
    CoordinateConverter coordinateConverter;

    public Shooter(GameState gameState, UserInput userInput, CoordinateConverter coordinateConverter) {
        this.gameState = gameState;
        this.userInput = userInput;
        this.coordinateConverter = coordinateConverter;
    }

    public void shoot() {
        System.out.println("shot");
        int a = coordinateConverter.checkCoordinate('A');
        //gameState.getCurrentTable().getTable()
    }
}
