package vav.codility.graph;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Stream;

public class KeysAndRooms {

    int max = Integer.MIN_VALUE;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] seen = new boolean[rooms.size()];
        seen[0] = true;
        Stack<Integer> stack = new Stack();
        stack.push(0);

        while(!stack.empty()) {
            Integer room = stack.pop();
            List<Integer> childs = rooms.get(room);
            for (int ind: childs) {
                if (!seen[ind]) {
                    seen[ind] = true;
                    stack.push(ind);
                }
            }
        }
        for (boolean visited : seen) {
            if (!visited) {
                return false;
            }
        }
        return true;
    }

}
