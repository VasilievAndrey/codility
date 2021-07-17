package vav.codility.noidea;

import java.util.PriorityQueue;
import java.util.Queue;

public class PhoneDirectory {

    boolean[] numbers;
    Queue<Integer> queue = new PriorityQueue<>();

    public PhoneDirectory(int maxNumbers) {
        this.numbers = new boolean[maxNumbers];
        for (int i = 0; i< maxNumbers; i++) {
            queue.add(i);
        }
    }

    /** Provide a number which is not assigned to anyone.
     @return - Return an available number. Return -1 if none is available. */
    public int get() {
        Integer num = queue.poll();
        if (num == null) {
            return -1;
        }
        this.numbers[num] = true;
        return num;
    }

    /** Check if a number is available or not. */
    public boolean check(int number) {
        return !this.numbers[number];
    }

    /** Recycle or release a number. */
    public void release(int number) {
        if (!queue.contains(number)) {
            queue.add(number);
            this.numbers[number] = false;
        }
    }
}
