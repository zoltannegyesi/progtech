package hu.nye.progtech.torpedo.service;

import hu.nye.progtech.torpedo.model.GameState;
import hu.nye.progtech.torpedo.service.ai.Ai;
import hu.nye.progtech.torpedo.service.util.CoordinateConverter;
import hu.nye.progtech.torpedo.ui.UserInput;
import org.springframework.stereotype.Service;

@Service
public class Shooter {

    private final GameState gameState;
    private final UserInput userInput;
    private final CoordinateConverter coordinateConverter;
    private final Ai ai;

    public Shooter(GameState gameState, UserInput userInput, CoordinateConverter coordinateConverter, Ai ai) {
        this.gameState = gameState;
        this.userInput = userInput;
        this.coordinateConverter = coordinateConverter;
        this.ai = ai;
    }

    public void shoot() {
        System.out.println("Type in the coordinate to shoot");
        char[] input = userInput.scanInput().toCharArray();
        if (input.length != 2) {
            System.out.println("Wrong input");
        } else {
            int x = coordinateConverter.checkCoordinate(input[0]);
            int y = coordinateConverter.checkCoordinate(input[1]);
            if (ai.getTable().getTable().get(y).get(x) == 'o') {
                System.out.println("It's a hit!");
                ai.getTable().getTable().get(y).set(x, '+');
                gameState.getAiTable().getTable().get(y).set(x, '+');
            } else if (ai.getTable().getTable().get(y).get(x) == 'X' || ai.getTable().getTable().get(y).get(x) == '+') {
                System.out.println("It has already been shot! Shoot again!");
                this.shoot();
            } else {
                System.out.println("Missed!");
                ai.getTable().getTable().get(y).set(x, 'X');
                gameState.getAiTable().getTable().get(y).set(x, 'X');
            }

        }
    }
}
