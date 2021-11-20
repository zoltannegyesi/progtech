package hu.nye.progtech.torpedo.service.interactions;

import java.util.List;

import hu.nye.progtech.torpedo.service.game.StepController;
import org.springframework.stereotype.Service;

@Service
public class InputHandler {

    private final List<Interaction> interactions;


    public InputHandler(List<Interaction> interactions) {
        this.interactions = interactions;
    }

    public void handleInput(String in, StepController stepController) {
        interactions.stream()
                .filter(interaction -> interaction.isEqualToCommand(in))
                .forEach(interaction -> {
                            interaction.process(in, stepController);
                        }
                );
    }
}
