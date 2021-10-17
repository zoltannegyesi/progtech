package hu.nye.progtech.torpedo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Value Object for tables.
 */

public class TableVO {


    private final int tableSize = 10;
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


    public int getTableSize() {
        return tableSize;
    }

    public List<List<Character>> getTable() {
        return table;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TableVO tableVO = (TableVO) o;
        return tableSize == tableVO.tableSize && Objects.equals(table, tableVO.table);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableSize, table);
    }

    @Override
    public String toString() {
        return "TableVO{" +
                "tableSize=" + tableSize +
                ", table=" + table +
                '}';
    }
}
