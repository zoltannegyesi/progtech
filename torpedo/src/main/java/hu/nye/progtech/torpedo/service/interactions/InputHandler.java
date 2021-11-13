package hu.nye.progtech.torpedo.service.interactions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InputHandler {

    private final List<Interaction> interactions;


    public InputHandler(List<Interaction> interactions) {
        this.interactions = interactions;
    }

    public void handleInput(String in) {
        interactions.stream()
                .filter(interaction -> interaction.isEqualToCommand(in))
                .forEach(interaction ->  {
                    interaction.process(in);
                }
        );
    }
}
