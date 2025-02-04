package vav.codility.dsf;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ConstructTargetArrayWithMultipleSums {

    public boolean isPossible(int[] target) {
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int sum = 0;
        for (int num : target) {
            sum += num;
            pq.add(num);
        }
        while (pq.peek() != 1) {
            int num = pq.poll();
            sum -= num;
            if (num <= sum || sum < 1) return false;
            num %= sum;
            sum += num;
            pq.add(num);
        }
        return true;
    }

}
