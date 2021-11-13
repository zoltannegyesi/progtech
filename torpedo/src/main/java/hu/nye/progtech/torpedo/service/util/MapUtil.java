package hu.nye.progtech.torpedo.service.util;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import hu.nye.progtech.torpedo.model.TableVO;
import org.springframework.stereotype.Service;

@Service
public class MapUtil {

    public boolean areAllShipsDestroyed(TableVO tableVO) {

        return false;
        /*
        AtomicBoolean result = new AtomicBoolean(false);

        List<List<Character>> map = tableVO.getTable();
        map.forEach(
                row -> {
                    result.set(row.stream().allMatch(n -> n == 'X' || n == '+'));
                }
        );
        return result.get();

         */
    }
}
