package vav.codility.arrays.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class PutBoxesIntoTheWarehouseI {

    public int maxBoxesInWarehouse(int[] boxes, int[] warehouse) {
        Arrays.sort(boxes);
        Stack<Integer> w = new Stack<>();
        for (int i=0; i<warehouse.length; i++) {
            if (w.isEmpty()) {
                w.push(warehouse[i]);
            } else {
                w.push(Math.min(warehouse[i], w.peek()));
            }
        }
        int count =0;
        int i=0;
        while(i<boxes.length && !w.isEmpty()) {
            Integer pop = w.pop();
            if (pop >= boxes[i]) {
                count++;
                i++;
            }
        }
        return count;
    }
}
