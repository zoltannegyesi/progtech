package hu.nye.progtech.torpedo.service.game;

import java.util.ArrayList;
import java.util.List;

import hu.nye.progtech.torpedo.model.GameState;
import hu.nye.progtech.torpedo.model.TableVO;
import hu.nye.progtech.torpedo.service.TableCreator;
import hu.nye.progtech.torpedo.service.ai.Ai;
import hu.nye.progtech.torpedo.service.util.MapUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameController {


    private final StepController stepController;
    private final MapUtil mapUtil;
    private final GameState gameState;
    private final TableCreator tableCreator;
    private final Ai ai;

    @Autowired
    public GameController(StepController stepController, MapUtil mapUtil, GameState gameState, TableCreator tableCreator, Ai ai) {
        this.stepController = stepController;
        this.mapUtil = mapUtil;
        this.gameState = gameState;
        this.tableCreator = tableCreator;
        this.ai = ai;
    }

    public void start() {
        tableCreator.createTable(ai.getTable());
        ai.createTable();
        tableCreator.createTable(gameState.getCurrentTable());
        tableCreator.createTable(gameState.getAiTable());
       while(isGameRunning()) {
           stepController.performStep();
           stepController.performAiStep();
       }
    }

    private boolean isGameRunning() {
        return !mapUtil.areAllShipsDestroyed(gameState.getCurrentTable());
    }


}
