package hu.nye.progtech.torpedo.ui;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * UI class to print the table to the standard output.
 */

public class TablePrinter {



    private final int tableSize;
    private final List<List<Character>> table;

    public TablePrinter(int tableSize, List<List<Character>> table) {
        this.tableSize = tableSize;
        this.table = table;
    }

    /**
     * Prints the given table to the standard input.
     */

    public String drawTable() {
        StringBuilder tableText = new StringBuilder("  ");
        for (char c = 'A'; c < 'A' + tableSize; c++) {
            tableText.append(" ").append(c);
        }
        tableText.append("\n");
        AtomicInteger i = new AtomicInteger();
        this.table.forEach(
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
