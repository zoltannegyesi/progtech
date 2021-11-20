package hu.nye.progtech.torpedo.service.interactions;

import hu.nye.progtech.torpedo.service.game.StepController;

public interface Interaction {

    void process(String in, StepController stepController);

    boolean isEqualToCommand(String in);

    String getName();

    void setUsable(boolean bool);

    boolean isUsable();
}
