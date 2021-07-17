package vav.codility.design;

import java.util.LinkedList;
import java.util.List;

public class MyCircularQueue {
    private List<Integer> queue;
    private int size;
    private int counter = 0;
    public MyCircularQueue(int k) {
        this.queue = new LinkedList<>();
        this.size = k;
    }

    public boolean enQueue(int value) {
        if (this.counter < this.size) {
            this.queue.add(value);
            this.counter++;
            return true;
        } else {
            return false;
        }

    }

    public boolean deQueue() {
        if (counter == 0) {
            return false;
        } else {
            this.queue.remove(0);
            this.counter--;
            return true;
        }
    }

    public int Front() {
        if (counter == 0) {
            return -1;
        } else {
            return this.queue.get(0);
        }
    }

    public int Rear() {
        if (counter == 0) {
            return -1;
        } else {
            return this.queue.get(counter -1);
        }
    }

    public boolean isEmpty() {
        return counter == 0;
    }

    public boolean isFull() {
        return counter == this.size;
    }

}
