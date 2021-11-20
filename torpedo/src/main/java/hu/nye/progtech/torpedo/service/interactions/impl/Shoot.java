package hu.nye.progtech.torpedo.service.interactions.impl;

import hu.nye.progtech.torpedo.model.GameState;
import hu.nye.progtech.torpedo.service.Shooter;
import hu.nye.progtech.torpedo.service.interactions.Interaction;
import hu.nye.progtech.torpedo.ui.TablePrinter;
import org.springframework.stereotype.Service;

@Service
public class Shoot implements Interaction {

    private static final String EXIT_COMMAND = "shoot";

    private final TablePrinter tablePrinter;
    private final GameState game;
    private final Shooter shooter;

    public Shoot(TablePrinter tablePrinter, GameState game, Shooter shooter) {
        this.tablePrinter = tablePrinter;
        this.game = game;
        this.shooter = shooter;
    }

    @Override
    public void process(String in) {
        shooter.shoot();
    }

    @Override
    public boolean isEqualToCommand(String in) {
        return EXIT_COMMAND.equals(in);
    }
}