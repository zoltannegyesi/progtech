package hu.nye.progtech.torpedo;

import java.io.InputStream;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.List;

import hu.nye.progtech.torpedo.model.GameState;
import hu.nye.progtech.torpedo.model.PlayerVO;
import hu.nye.progtech.torpedo.model.TableVO;
import hu.nye.progtech.torpedo.service.ShipCreatingLoop;
import hu.nye.progtech.torpedo.service.ShipCreator;
import hu.nye.progtech.torpedo.service.ShipInputChecker;
import hu.nye.progtech.torpedo.service.game.GameController;
import hu.nye.progtech.torpedo.service.game.StepController;
import hu.nye.progtech.torpedo.service.interactions.InputHandler;
import hu.nye.progtech.torpedo.service.interactions.Interaction;
import hu.nye.progtech.torpedo.service.interactions.impl.Print;
import hu.nye.progtech.torpedo.service.util.MapUtil;
import hu.nye.progtech.torpedo.ui.TablePrinter;
import hu.nye.progtech.torpedo.ui.UserInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Main class, to run the program.
 */

public class Main {

    /**
     * Run the program.
     */

    /* TODO
    - change all appearances for coordinates to coordinateConverter
    - make shooting work with 10 coordinates (like A10), and also ship putting
    - if all ships are put down, write out: All ships are put down
    - if the given coordinates are too short print: Too short for this ship
    - input checking for all inputs(what to do with wrong inputs)
    - cannot shoot until all ships are put down
    - write out if an input is wrong(putting)
    - if találat, then print out it hit a ship
    - printnél kiírni a saját táblánkat ahová letettük, és ahova az ai lőtt, és az ai tábláját is, a lőtt koordinátákkal
    - ha egy pontba már lőttünk, akkor nem lehet mégegyszer, újra lehet lőni
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
