package hu.nye.progtech.torpedo.service.game;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

import hu.nye.progtech.torpedo.service.interactions.Interaction;
import hu.nye.progtech.torpedo.ui.UserInput;
import hu.nye.progtech.torpedo.service.interactions.InputHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StepController {

    private final UserInput userInput;
    private final InputHandler inputHandler;
    private final List<Interaction> interactions;

    @Autowired
    public StepController(UserInput userInput, InputHandler inputHandler, List<Interaction> interactions) {
        this.userInput = userInput;
        this.inputHandler = inputHandler;
        this.interactions = interactions;
    }

    public void performStep() {
        System.out.print("Commands: ");
        interactions.forEach(interaction -> System.out.print(interaction.getName() + " "));
        System.out.println();
        String in = userInput.scanInput();
        inputHandler.handleInput(in);
    }
}
