package hu.nye.progtech.torpedo.service.interactions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import hu.nye.progtech.torpedo.model.GameState;
import hu.nye.progtech.torpedo.model.TableVO;
import hu.nye.progtech.torpedo.service.ships.Ship;
import hu.nye.progtech.torpedo.ui.UserInput;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

@Service
public class ShipPutter {

    private Ship ship;
    private GameState gameState;
    private UserInput userInput;

    public ShipPutter(Ship ship, GameState gameState, UserInput userInput) {
        this.ship = ship;
        this.gameState = gameState;
        this.userInput = userInput;
    }

    public boolean putShip(int shipSize, TableVO tableVO) {
        System.out.println("The ship is "+ shipSize +" tile long.");
        System.out.println("Type in the starting and the ending coordinate: ");
        String input = userInput.scanInput();
        List<String> coordinates = Arrays.asList(input.split(" "));
        // -65 and -49 -> to convert char to number -> ASCII table
        if (Math.abs(coordinates.get(0).toCharArray()[0] - coordinates.get(1).toCharArray()[0])
        == shipSize-1 || Math.abs(coordinates.get(0).toCharArray()[1]
                - coordinates.get(1).toCharArray()[1]) == shipSize-1) {
            tableVO.getTable()
                    .get(coordinates.get(0).toCharArray()[0]-65)
                    .set((int) coordinates.get(0).toCharArray()[1] - 49 , '+');
            tableVO.getTable()
                    .get(coordinates.get(1).toCharArray()[0]-65)
                    .set((int) coordinates.get(1).toCharArray()[1] - 49 , '+');
            System.out.println("Ship is put down");
            return true;
        } else {
            System.out.println("Too long for a this ship");
            return false;
        }

    }
}
