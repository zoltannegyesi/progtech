package hu.nye.progtech.torpedo;

import hu.nye.progtech.torpedo.model.PlayerVO;
import hu.nye.progtech.torpedo.model.TableVO;
import hu.nye.progtech.torpedo.ui.UserInput;

public class Main {
    public static void main(String[] args) {
        //TODO: jacocot visszakapcsolni/kikommentezni

        UserInput userInput = new UserInput();
        PlayerVO player = new PlayerVO(userInput.nameScanning());
        System.out.println(player.getName());
        TableVO table = new TableVO();
        table.drawTable();
    }
}
