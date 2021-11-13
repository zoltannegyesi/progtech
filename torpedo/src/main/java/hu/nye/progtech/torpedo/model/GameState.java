package hu.nye.progtech.torpedo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;


@Repository
@Getter
@Setter
public class GameState {

    private TableVO currentTable;

    public GameState(TableVO currentTable) {
        this.currentTable = currentTable;
    }

}
