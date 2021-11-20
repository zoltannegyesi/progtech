package hu.nye.progtech.torpedo.service.ai;

import hu.nye.progtech.torpedo.model.TableVO;
import hu.nye.progtech.torpedo.ui.TablePrinter;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
public class Ai {

    private TableVO table;
    private final AiTableCreator aiTableCreator;
    private final TablePrinter tablePrinter;

    public Ai(TableVO table, AiTableCreator aiTableCreator, TablePrinter tablePrinter) {
        this.table = table;
        this.aiTableCreator = aiTableCreator;
        this.tablePrinter = tablePrinter;
    }

    public void createTable() {
        aiTableCreator.createAiTable(this);
    }
}
