package hu.nye.progtech.torpedo.service.interactions.impl;

import hu.nye.progtech.torpedo.model.GameState;
import hu.nye.progtech.torpedo.service.interactions.Interaction;
import hu.nye.progtech.torpedo.ui.TablePrinter;
import org.springframework.stereotype.Service;

@Service
public class Put implements Interaction {
    private static final String PUT_COMMAND = "put";

    private final TablePrinter tablePrinter;
    private final GameState game;

    public Put(TablePrinter tablePrinter, GameState game) {
        this.tablePrinter = tablePrinter;
        this.game = game;
    }

    @Override
    public void process(String in) {
        System.out.println("You can Carrier (occupies 5 spaces), Battleship (4), Cruiser (3), Submarine (3), and Destroyer (2)");
    }

    @Override
    public boolean isEqualToCommand(String in) {
        return PUT_COMMAND.equals(in);
    }
}
