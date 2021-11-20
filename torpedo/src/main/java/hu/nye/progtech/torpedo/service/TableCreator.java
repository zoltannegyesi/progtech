package hu.nye.progtech.torpedo.service;

import java.util.ArrayList;
import java.util.List;

import hu.nye.progtech.torpedo.model.TableVO;
import org.springframework.stereotype.Service;

@Service
public class TableCreator {

    public void createTable(TableVO tableVO) {
        ArrayList<List<Character>> table = new ArrayList<>();
        for (int i = 0; i < tableVO.getTableSize(); i++) {
            List<Character> temp = new ArrayList<>();
            for (int j = 0; j < tableVO.getTableSize(); j++) {
                temp.add(' ');
            }
            table.add(temp);
        }
        tableVO.setTable(table);

    }
}
