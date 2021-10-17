package hu.nye.progtech.torpedo;

import java.util.ArrayList;
import java.util.List;

import hu.nye.progtech.torpedo.model.PlayerVO;
import hu.nye.progtech.torpedo.model.TableVO;
import hu.nye.progtech.torpedo.ui.TablePrinter;
import hu.nye.progtech.torpedo.ui.UserInput;

/**
 * Main class, to run the program.
 */

public class Main {

    /**
     * Run the program.
     */

    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        PlayerVO player = new PlayerVO(userInput.nameScanning());
        System.out.printf("Üdvözlünk a játékban %s!%n%n", player.getName());
        TableVO table = new TableVO();
        TablePrinter printer = new TablePrinter(10, table.getTable());
        System.out.println("Kezdő táblád:");
        System.out.println(printer.drawTable());


    }
}
