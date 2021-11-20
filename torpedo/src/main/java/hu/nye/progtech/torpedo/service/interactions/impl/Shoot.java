package hu.nye.progtech.torpedo.service.interactions.impl;

import java.util.HashSet;

import hu.nye.progtech.torpedo.model.GameState;
import hu.nye.progtech.torpedo.service.Shooter;
import hu.nye.progtech.torpedo.service.game.StepController;
import hu.nye.progtech.torpedo.service.interactions.Interaction;
import hu.nye.progtech.torpedo.ui.TablePrinter;
import org.springframework.stereotype.Service;

@Service
public class Shoot implements Interaction {

    private static final String SHOOT_COMMAND = "shoot";

    private final Shooter shooter;

    public Shoot(Shooter shooter) {
        this.shooter = shooter;
    }

    @Override
    public void process(String in, StepController stepController) {
        shooter.shoot();
    }

    @Override
    public boolean isEqualToCommand(String in) {
        return SHOOT_COMMAND.equals(in);
    }

    @Override
    public String getName() {
        return SHOOT_COMMAND;
    }
}