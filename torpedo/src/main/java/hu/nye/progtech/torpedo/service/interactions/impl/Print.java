package hu.nye.progtech.torpedo.service.interactions.impl;

import hu.nye.progtech.torpedo.model.GameState;
import hu.nye.progtech.torpedo.service.game.StepController;
import hu.nye.progtech.torpedo.service.interactions.InputHandler;
import hu.nye.progtech.torpedo.service.interactions.Interaction;
import hu.nye.progtech.torpedo.ui.TablePrinter;
import org.springframework.context.annotation.Scope;
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
    public void process(String in, StepController stepController) {

        System.out.println("Your table:\n" + tablePrinter.drawTable(game.getCurrentTable()));
        System.out.println("AI's table:\n" + tablePrinter.drawTable(game.getAiTable()));
        stepController.performStep();
    }

    @Override
    public boolean isEqualToCommand(String in) {
        return PRINT_COMMAND.equals(in);
    }

    @Override
    public String getName() {
        return PRINT_COMMAND;
    }
}
