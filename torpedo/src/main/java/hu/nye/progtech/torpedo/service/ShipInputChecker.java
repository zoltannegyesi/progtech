package hu.nye.progtech.torpedo.service;

import org.springframework.stereotype.Service;

public class ShipInputChecker {

    public boolean isValidInput(String input) {
        String[] coordinates = input.split(" ");
        if (coordinates[0].toCharArray()[0] <= 'A' || coordinates[0].toCharArray()[0] >= 'J' ||
                coordinates[1].toCharArray()[0] <= 'A' || coordinates[1].toCharArray()[0] >= 'J') {
            return false;
        }
        return true;
        
    }
}
