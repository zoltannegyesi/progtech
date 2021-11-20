package hu.nye.progtech.torpedo;

import hu.nye.progtech.torpedo.service.game.GameController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Main class, to run the program.
 */

public class Main {

    /**
     * Run the program.
     */

    /* TODO
    - if wrong input on shooting, can shoot again without ai shooting
    - if the given coordinates are too short print: Too short for this ship
    - input checking for all inputs(what to do with wrong inputs)
    - write out if an input is wrong(putting)
     */

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("hu.nye.progtech.torpedo");
        GameController gameController = context.getBean(GameController.class);
        gameController.start();
    }
}
