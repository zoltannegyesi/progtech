package hu.nye.progtech.torpedo.model;

import java.util.Objects;

/**
 * Value Object for ships.
 */

public class ShipVO {


    private int size;
    private int coordinateX;
    private int coordinateY;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShipVO shipVO = (ShipVO) o;
        return size == shipVO.size && coordinateX == shipVO.coordinateX && coordinateY == shipVO.coordinateY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, coordinateX, coordinateY);
    }

    @Override
    public String toString() {
        return "ShipVO{" +
                "size=" + size +
                ", coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                '}';
    }
}
