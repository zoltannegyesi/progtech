package hu.nye.progtech.torpedo.service.interactions.impl;

import hu.nye.progtech.torpedo.model.GameState;
import hu.nye.progtech.torpedo.service.ai.Ai;
import hu.nye.progtech.torpedo.service.interactions.Interaction;
import hu.nye.progtech.torpedo.ui.TablePrinter;
import org.springframework.stereotype.Service;

@Service
public class PrintAiTable implements Interaction {
    private static final String PRINTAITABLE_COMMAND = "aitable";

    private final TablePrinter tablePrinter;
    private final Ai ai;

    public PrintAiTable(TablePrinter tablePrinter, Ai ai) {
        this.tablePrinter = tablePrinter;
        this.ai = ai;
    }

    @Override
    public void process(String in) {
        System.out.println(tablePrinter.drawTable(ai.getTable()));
    }

    @Override
    public boolean isEqualToCommand(String in) {
        return PRINTAITABLE_COMMAND.equals(in);
    }

    @Override
    public String getName() {
        return PRINTAITABLE_COMMAND;
    }
}
