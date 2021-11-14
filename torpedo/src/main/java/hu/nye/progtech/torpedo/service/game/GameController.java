package hu.nye.progtech.torpedo.service.game;

import java.util.ArrayList;
import java.util.List;

import hu.nye.progtech.torpedo.model.GameState;
import hu.nye.progtech.torpedo.model.TableVO;
import hu.nye.progtech.torpedo.service.util.MapUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameController {


    private final StepController stepController;
    private final MapUtil mapUtil;
    private final GameState gameState;

    @Autowired
    public GameController(StepController stepController, MapUtil mapUtil, GameState gameState) {
        this.stepController = stepController;
        this.mapUtil = mapUtil;
        this.gameState = gameState;
    }

    public void start() {
       while(isGameRunning()) {
           stepController.performStep();
       }
    }

    private boolean isGameRunning() {
        return !mapUtil.areAllShipsDestroyed(gameState.getCurrentTable());
    }

    public void createStartingTable() {
        TableVO tableVO = new TableVO();
        ArrayList<List<Character>> table = new ArrayList<>();
        for (int i = 0; i < tableVO.getTableSize(); i++) {
            List<Character> temp = new ArrayList<>();
            for (int j = 0; j < tableVO.getTableSize(); j++) {
                temp.add(' ');
            }
            table.add(temp);
        }
        tableVO.setTable(table);
        gameState.setCurrentTable(tableVO);
    }

}
