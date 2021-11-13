package hu.nye.progtech.torpedo.service.interactions.impl;

import hu.nye.progtech.torpedo.model.GameState;
import hu.nye.progtech.torpedo.service.interactions.Interaction;
import hu.nye.progtech.torpedo.ui.TablePrinter;
import org.springframework.stereotype.Service;

@Service
public class Print implements Interaction {

    private static final String PRINT_COMMAND = "print";

    private final TablePrinter tablePrinter;
    private final GameState game;

    public Print(TablePrinter tablePrinter, GameState game) {
        this.tablePrinter = tablePrinter;
        this.game = game;
    }

    @Override
    public void process(String in) {
        System.out.println(tablePrinter.drawTable(game.getCurrentTable()));
    }

    @Override
    public boolean isEqualToCommand(String in) {
        return PRINT_COMMAND.equals(in);
    }
}
