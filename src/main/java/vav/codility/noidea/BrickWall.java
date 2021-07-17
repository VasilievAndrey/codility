package vav.codility.noidea;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrickWall {

    public int leastBricks(List<List<Integer>> wall) {
        int size = wall.size();
        Map<Integer, Integer> map = new HashMap<>();
        for (List<Integer> row: wall) {
            int s = 0;
            for (int j=0; j<row.size() -1;j++) {
                s +=row.get(j);
                Integer val = map.get(s);
                if (val == null) {
                    map.put(s, 1);
                } else {
                    map.put(s, ++val);
                }
            }
        }
        if (map.size() > 0) {
            Integer max = map.values().stream().reduce(Integer::max).get();
            return size - max;
        } else {
            return size;
        }
    }
}
