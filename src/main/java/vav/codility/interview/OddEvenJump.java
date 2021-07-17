package vav.codility.interview;

public class OddEvenJump {
    enum Index {
        SMALL, BIG, UN
    }

    public int oddEvenJumps(int[] arr) {
        Index[] mem = new Index[arr.length];

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isGoodIndex(arr, i)) {
                count++;
            }
        }
        return count;
    }

    private boolean isGoodIndex(int[] arr, int i) {
        int len = arr.length;
        if (i == len - 1) {
            return true;
        }
        int j = i + 1;
        if (i % 2 == 0) {
            while (j <= len - 1 && arr[i] < arr[j]) {
                j++;
            }
            if (j== len-1) {
                if ( arr[i] >= arr[j]) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return isGoodIndex(arr, j);
            }
        } else {
            while (j <= len - 1 && arr[i] > arr[j]) {
                j++;
            }
            if (j== len-1) {
                if ( arr[i] <= arr[j]) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return isGoodIndex(arr, j);
            }
        }
    }
}
