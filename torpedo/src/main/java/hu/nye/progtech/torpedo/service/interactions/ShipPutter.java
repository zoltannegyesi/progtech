package hu.nye.progtech.torpedo.service.interactions;

import java.util.Arrays;
import java.util.List;

import hu.nye.progtech.torpedo.model.TableVO;
import hu.nye.progtech.torpedo.service.util.CoordinateConverter;
import hu.nye.progtech.torpedo.ui.UserInput;
import org.springframework.stereotype.Service;

@Service
public class ShipPutter {

    private final UserInput userInput;
    private final CoordinateConverter coordinateConverter;

    public ShipPutter(UserInput userInput, CoordinateConverter coordinateConverter) {
        this.userInput = userInput;
        this.coordinateConverter = coordinateConverter;
    }

    public boolean putShip(int shipSize, TableVO tableVO) {
        System.out.println("The ship is " + shipSize + " tile long.");
        System.out.println("Type in the starting and the ending coordinate: ");
        String input = userInput.scanInput();
        List<String> coordinates = Arrays.asList(input.split(" "));
        int x1 = coordinateConverter.checkCoordinate(coordinates.get(0).toCharArray()[0]);
        int y1 = coordinateConverter.checkCoordinate(coordinates.get(0).toCharArray()[1]);
        int x2 = coordinateConverter.checkCoordinate(coordinates.get(1).toCharArray()[0]);
        int y2 = coordinateConverter.checkCoordinate(coordinates.get(1).toCharArray()[1]);
        int firstCoordinateDifference = Math.abs(x1 - x2);
        int secondCoordinateDifference = Math.abs(y1 - y2);
        if (firstCoordinateDifference == shipSize - 1 || secondCoordinateDifference == shipSize - 1) {
            if (x1 == x2) {
                if (y1 > y2) {
                    for (int i = 0; i < shipSize; i++) {
                        tableVO.getTable().get(y1 - i).set(x1, 'o');
                    }
                } else {
                    for (int i = 0; i < shipSize; i++) {
                        tableVO.getTable().get(y1 + i).set(x1, 'o');
                    }
                }

            } else {
                if (x1 > x2) {
                    for (int i = 0; i < shipSize; i++) {
                        tableVO.getTable().get(y1).set(x1-i, 'o');
                    }
                } else {
                    for (int i = 0; i < shipSize; i++) {
                        tableVO.getTable().get(y1).set(x1+i, 'o');
                    }
                }
            }
            System.out.println("Ship is put down");
            return true;
        } else {
            System.out.println("Too long for this ship");
            return false;
        }

    }
}
