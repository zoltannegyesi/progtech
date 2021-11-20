package hu.nye.progtech.torpedo.service.game;

import java.util.List;

import hu.nye.progtech.torpedo.service.ai.Ai;
import hu.nye.progtech.torpedo.service.interactions.InputHandler;
import hu.nye.progtech.torpedo.service.interactions.Interaction;
import hu.nye.progtech.torpedo.ui.UserInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StepController {

    private final UserInput userInput;
    private final InputHandler inputHandler;
    private final List<Interaction> interactions;
    private final Ai ai;

    @Autowired
    public StepController(UserInput userInput, InputHandler inputHandler, List<Interaction> interactions, Ai ai) {
        this.userInput = userInput;
        this.inputHandler = inputHandler;
        this.interactions = interactions;
        this.ai = ai;
    }

    public void performAiStep() {
        ai.shoot();
    }

    public void performStep() {
        System.out.print("Commands: ");
        interactions.stream().filter(Interaction::isUsable).forEach(interaction -> System.out.print(interaction.getName() + " "));
        System.out.println();
        String in = userInput.scanInput();
        inputHandler.handleInput(in, this);
    }
}
