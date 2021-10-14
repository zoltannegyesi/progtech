package hu.nye.progtech.torpedo.ui;

import java.util.Scanner;

public class UserInput {

    Scanner scanner = new Scanner(System.in);

    public String nameScanning() {
        System.out.print("Adja meg a jatekos nevet: ");
        return scanner.nextLine();
    }

    /*public <T> T scanning () {

    }*/
}
