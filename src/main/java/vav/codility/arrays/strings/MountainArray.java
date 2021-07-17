package vav.codility.arrays.strings;

public class MountainArray {

    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        boolean down = false;
        boolean up = false;
        for (int i = 1; i<arr.length; i++) {
            if (arr[i-1] == arr[i]) {
                return false;
            } else if (arr[i-1] > arr[i]) {
                if (!up) {
                    return false;
                }
                down = true;
            } else if (arr[i-1] < arr[i]) {
                if (down) {
                    return false;
                }
                up = true;
            }
        }
        return down & up;
    }
}
