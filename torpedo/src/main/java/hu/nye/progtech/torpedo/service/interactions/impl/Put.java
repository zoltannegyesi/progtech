package hu.nye.progtech.torpedo.service.interactions.impl;

import java.util.List;

import hu.nye.progtech.torpedo.model.GameState;
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
    public void process(String in) {
        System.out.print("You can put down a: ");

        ships.stream()
                .filter(ship -> !ship.isUsed())
                .forEach(ship -> System.out.print(ship.getName() + ", "));
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

    @Override
    public boolean isEqualToCommand(String in) {
        return PUT_COMMAND.equals(in);
    }

    @Override
    public String getName() {
        return PUT_COMMAND;
    }
}
