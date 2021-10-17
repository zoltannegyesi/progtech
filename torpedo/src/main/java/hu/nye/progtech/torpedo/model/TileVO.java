package hu.nye.progtech.torpedo.model;

import java.util.Objects;

/**
 * Value Object for tiles.
 */

public class TileVO {



    private char value = 'X';
    private ShipVO ship;

    public char getValue() {
        return value;
    }

    public ShipVO getShip() {
        return ship;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TileVO tileVO = (TileVO) o;
        return value == tileVO.value && Objects.equals(ship, tileVO.ship);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, ship);
    }

    @Override
    public String toString() {
        return "TileVO{" +
                "value=" + value +
                ", ship=" + ship +
                '}';
    }
}
