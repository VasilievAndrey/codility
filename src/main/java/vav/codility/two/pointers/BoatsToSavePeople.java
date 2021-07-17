package vav.codility.two.pointers;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class BoatsToSavePeople {
    public static int numRescueBoats(int[] people, int limit) {
        int count = 0;
        int previousWeight = 0;
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        while (left < right) {
            int sum = previousWeight + people[right];
            int substruct = limit - sum;
            if (substruct == people[left]) {
                count++;
                left++;
                right--;
                previousWeight = 0;
            } else if (substruct > people[left]) {
                previousWeight = previousWeight + people[left];
                left++;
            } else if (substruct == 0) {
                count++;
                right--;
                previousWeight = 0;
            }
        }
        if (previousWeight > 0 || left == right) {
            count++;
        }
        return count;
    }
}
