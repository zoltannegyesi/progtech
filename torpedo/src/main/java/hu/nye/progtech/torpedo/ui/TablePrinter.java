package hu.nye.progtech.torpedo.ui;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import hu.nye.progtech.torpedo.model.GameState;
import hu.nye.progtech.torpedo.model.TableVO;
import org.springframework.stereotype.Service;

/**
 * UI class to print the table to the standard output.
 */

@Service
public class TablePrinter {


    private final int tableSize;
    private final List<List<Character>> table;

    public TablePrinter(GameState gameState) {
        this.tableSize = gameState.getCurrentTable().getTableSize();
        this.table = gameState.getCurrentTable().getTable();
    }

    /**
     * Prints the given table to the standard input.
     */

    public String drawTable(TableVO tableVO) {
        StringBuilder tableText = new StringBuilder("  ");
        for (char c = 'A'; c < 'A' + tableVO.getTableSize(); c++) {
            tableText.append(" ").append(c);
        }
        tableText.append("\n");
        AtomicInteger i = new AtomicInteger();
        tableVO.getTable().forEach(
                row -> {
                    String temp = i.incrementAndGet() > 9 ? " " : "  ";
                    tableText.append(i.get()).append(temp);
                    row.forEach(column -> tableText.append(column).append(" "));
                    tableText.append("\n");
                }
        );
        return tableText.toString();
    }
}
