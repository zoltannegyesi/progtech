package hu.nye.progtech.torpedo.service.util;

import org.springframework.stereotype.Service;

@Service
public class CoordinateConverter {

    public int checkCoordinate(char character) {
        if (character >= 'A' && character <= 'J') {
            return (int) (character - 65);
        }
        else {
            return (int) (character - 49);
        }
    }
}
