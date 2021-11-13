package hu.nye.progtech.torpedo.service.game;

import hu.nye.progtech.torpedo.ui.UserInput;
import hu.nye.progtech.torpedo.service.interactions.InputHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StepController {

    private final UserInput userInput;
    private final InputHandler inputHandler;

    @Autowired
    public StepController(UserInput userInput, InputHandler inputHandler) {
        this.userInput = userInput;
        this.inputHandler = inputHandler;
    }

    public void performStep() {
        String in = userInput.scanInput();
        inputHandler.handleInput(in);
    }
}
