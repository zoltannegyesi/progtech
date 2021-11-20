package hu.nye.progtech.torpedo.service.interactions.impl;

import javax.persistence.Id;

import hu.nye.progtech.torpedo.model.GameState;
import hu.nye.progtech.torpedo.service.interactions.Interaction;
import hu.nye.progtech.torpedo.ui.TablePrinter;
import org.springframework.stereotype.Service;

@Service
public class Exit implements Interaction {

    private static final String EXIT_COMMAND = "exit";

    private final TablePrinter tablePrinter;
    private final GameState game;

    public Exit(TablePrinter tablePrinter, GameState game) {
        this.tablePrinter = tablePrinter;
        this.game = game;
    }

    @Override
    public void process(String in) {
        System.exit(0);
    }

    @Override
    public boolean isEqualToCommand(String in) {
        return EXIT_COMMAND.equals(in);
    }

    @Override
    public String getName() {
        return EXIT_COMMAND;
    }
}
