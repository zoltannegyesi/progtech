package hu.nye.progtech.torpedo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class TableVO {
    private int tableSize = 10;
    private List<List<Character>> table = new ArrayList<>();

    {
        ArrayList<Character> temp = new ArrayList<>();
        for (int i = 0; i < tableSize; i++) {
            temp.add('X');
        }
        for (int i = 0; i < tableSize; i++) {
            table.add(temp);
        }
    }
    public void drawTable() {
        System.out.print("  ");
        for (char c = 'A'; c < 'A' + tableSize; c++) {
            System.out.printf(" %c", c);
        }
        System.out.println();
        AtomicInteger i = new AtomicInteger();
        this.table.forEach(
                row -> {
                    String temp = i.incrementAndGet() > 9 ? "%d " : "%d  ";
                    System.out.printf(temp, i.get());
                    row.forEach(column -> System.out.printf("%c ", column));
                    System.out.println();
                }
        );
    }
}
