package hu.nye.progtech.torpedo.service.util;

import org.springframework.stereotype.Service;

@Service
public class CoordinateConverter {

    public int checkCoordinate(char character) {
        // -65 and -49 -> to convert char to number -> ASCII table
        if (character >= 'A' && character <= 'J') {
            return (int) (character - 65);
        }
        else {
            return (int) (character - 49);
        }
    }
}
