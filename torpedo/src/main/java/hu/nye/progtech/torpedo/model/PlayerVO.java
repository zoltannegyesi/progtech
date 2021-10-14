package hu.nye.progtech.torpedo.model;

public final class PlayerVO {

    private final String name;
    private int shipsRemaining = 0;
    private int emptyTilesRemaining = 0;
    private TableVO tableVO;

    public PlayerVO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getShipsRemaining() {
        return shipsRemaining;
    }

    public void setShipsRemaining(int shipsRemaining) {
        this.shipsRemaining = shipsRemaining;
    }

    public int getEmptyTilesRemaining() {
        return emptyTilesRemaining;
    }

    public void setEmptyTilesRemaining(int emptyTilesRemaining) {
        this.emptyTilesRemaining = emptyTilesRemaining;
    }
}
