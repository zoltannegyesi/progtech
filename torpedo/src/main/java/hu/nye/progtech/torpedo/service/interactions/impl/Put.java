package hu.nye.progtech.torpedo.service.interactions.impl;

import java.util.List;
import java.util.stream.Collectors;

import hu.nye.progtech.torpedo.model.GameState;
import hu.nye.progtech.torpedo.service.game.StepController;
import hu.nye.progtech.torpedo.service.ships.Ship;
import hu.nye.progtech.torpedo.service.interactions.Interaction;
import hu.nye.progtech.torpedo.service.interactions.ShipPutter;
import hu.nye.progtech.torpedo.ui.TablePrinter;
import hu.nye.progtech.torpedo.ui.UserInput;
import org.springframework.stereotype.Service;

@Service
public class Put implements Interaction {
    private static final String PUT_COMMAND = "put";

    private final TablePrinter tablePrinter;
    private final GameState game;
    private List<Ship> ships;
    private ShipPutter shipPutter;
    private UserInput userInput;

    public Put(TablePrinter tablePrinter, GameState game, List<Ship> ships,
               ShipPutter shipPutter, UserInput userInput) {
        this.tablePrinter = tablePrinter;
        this.game = game;
        this.ships = ships;
        this.shipPutter = shipPutter;
        this.userInput = userInput;
    }

    @Override
    public void process(String in, StepController stepController) {

        List<Ship> shipsLeft = ships.stream().filter(ship -> !ship.isUsed()).collect(Collectors.toList());
        if (shipsLeft.isEmpty()) {
            System.out.println("All ships are put down!");
        } else {
            System.out.print("You can put down a: ");
            shipsLeft.forEach(ship -> System.out.print(ship.getName() + ", "));
            System.out.println();
            String input = userInput.scanInput();
            ships.stream()
                    .filter(ship -> ship.getName().equals(input))
                    .forEach(ship -> {
                        if (shipPutter.putShip(ship.getSize(), game.getCurrentTable())) {
                            ship.useShip();
                        }
                    });
        }

    }

    @Override
    public boolean isEqualToCommand(String in) {
        return PUT_COMMAND.equals(in);
    }

    @Override
    public String getName() {
        return PUT_COMMAND;
    }
}
