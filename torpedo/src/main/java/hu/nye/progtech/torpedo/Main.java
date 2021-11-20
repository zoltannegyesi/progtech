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
    - change all appearances for coordinates to coordinateConverter
    - if the given coordinates are too short print: Too short for this ship
    - input checking for all inputs(what to do with wrong inputs)
    - cannot shoot until all ships are put down
    - write out if an input is wrong(putting)
    - printnél kiírni a saját táblánkat ahová letettük, és ahova az ai lőtt, és az ai tábláját is, a lőtt koordinátákkal
    - ha az összes hajó le van téve, akkor a putot ne kiíratni az elején
     */

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("hu.nye.progtech.torpedo");
        GameController gameController = context.getBean(GameController.class);
        gameController.start();
    }



/*
    @Bean
    public void createShipCreator(ShipCreatingLoop shipCreatingLoop, ShipInputChecker shipInputChecker, UserInput userInput){
        System.out.println("asd");
        shipCreatingLoop.scanShipCreating(shipInputChecker, userInput);
    }*/
}
