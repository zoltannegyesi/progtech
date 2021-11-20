package hu.nye.progtech.torpedo.service;

import java.util.Arrays;
import java.util.List;

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
        System.out.println("Type in the coordinate to shoot");
        char[] input = userInput.scanInput().toCharArray();
        if (input.length != 2) {
            System.out.println("Wrong input");
        } else {
            int x = coordinateConverter.checkCoordinate(input[0]);
            int y = coordinateConverter.checkCoordinate(input[1]);
            gameState.getCurrentTable().getTable().get(y).set(x, 'X');
        }
    }
}