package hu.nye.progtech.torpedo;

import java.util.ArrayList;
import java.util.List;

import hu.nye.progtech.torpedo.model.PlayerVO;
import hu.nye.progtech.torpedo.model.TableVO;
import hu.nye.progtech.torpedo.ui.UserInput;

/**
 * Main class, to run the program.
 */

public class Main {

    /**
     * Run the program.
     */

    public static void main(String[] args) {
        /*TODO:
           - jacocot visszakapcsolni/kikommentezni
           - amit lehet, classot és fieldet finallá tenni
           - kiíratást nem a tablevo-ban megcsinálni
           - a kiíratásnál nem x-eket kiírni, hanem úgy tileokat létrehozni
           és azok value-ját kiíratni
           - esetleg keretes táblázatot csinálni a kiíratásnál

         */

        UserInput userInput = new UserInput();
        PlayerVO player = new PlayerVO(userInput.nameScanning());
        TableVO table = new TableVO();
        // TablePrinter printer = new TablePrinter(table);
        // System.out.println(printer.drawTable());

        List<List<Character>> asd = new ArrayList<>();
        ArrayList<Character> temp = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            temp.add('X');
        }
        for (int i = 0; i < 10; i++) {
            asd.add(temp);
        }
        System.out.println(asd.toString());

    }
}
