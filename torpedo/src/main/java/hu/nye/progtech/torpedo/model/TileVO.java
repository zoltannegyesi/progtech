package hu.nye.progtech.torpedo.model;

public class TileVO {
    private char value = 'X';
    private ShipVO ship;

    public char getValue() {
        return value;
    }

    public ShipVO getShip() {
        return ship;
    }
}
