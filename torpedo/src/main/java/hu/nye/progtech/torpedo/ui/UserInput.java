package hu.nye.progtech.torpedo.ui;

import java.util.Objects;
import java.util.Scanner;

/**
 * UI class to read from the standard input.
 */

public class UserInput {


    Scanner scanner = new Scanner(System.in);

    /**
     * Scans the standard input for names.
     */

    public String nameScanning() {
        System.out.print("Adja meg a játékos nevét: ");
        return scanner.nextLine();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserInput userInput = (UserInput) o;
        return Objects.equals(scanner, userInput.scanner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scanner);
    }

    @Override
    public String toString() {
        return "UserInput{" +
                "scanner=" + scanner +
                '}';
    }
}
