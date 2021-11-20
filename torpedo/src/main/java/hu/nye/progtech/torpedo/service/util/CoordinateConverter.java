package hu.nye.progtech.torpedo.service.util;

import org.springframework.stereotype.Service;

@Service
public class CoordinateConverter {

    public int checkCoordinate(char character) {
        System.out.println("asdasd");
        if (character >= 'A' && character <= 'J') {
            System.out.println((int)(character-65));
            return (int) (character - 65);
        }
        else {
            System.out.println((int)(character-49));
            return (int) (character - 49);
        }
    }
}
