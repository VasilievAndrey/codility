package vav.codility.arrays.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MeetingScheduler {
    public List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) {
        Arrays.sort(slots1, (a,b) -> a[0] -b[0]);
        Arrays.sort(slots2,(a,b) -> a[0] -b[0]);

        int ind1 = 0;
        int ind2 = 0;
        while (ind1 <slots1.length && ind2 < slots2.length) {
            if (slots1[ind1][1] - slots1[ind1][0] < duration) {
                ind1++;
                continue;
            }
            if (slots2[ind2][1] - slots2[ind2][0] < duration) {
                ind2++;
                continue;
            }
            if (slots1[ind1][1] < slots2[ind2][0] || slots1[ind1][1] < slots2[ind2][0] +duration) {
                ind1++;
                continue;
            }
            if (slots1[ind1][0] > slots2[ind2][1] || slots1[ind1][0] + duration > slots2[ind2][1]) {
                ind2++;
                continue;
            }
            if (slots1[ind1][0] <= slots2[ind2][0]
                    && slots1[ind1][1] > slots2[ind2][0]
                    || slots1[ind1][0] > slots2[ind2][0]
                    && slots1[ind1][0] < slots2[ind2][1]) {
                int st = Math.max(slots1[ind1][0], slots2[ind2][0]);
                int end = Math.min(slots1[ind1][1], slots2[ind2][1]);
                if (end - st >= duration) {
                    return Arrays.asList(st, st+duration);
                }
            }
        }
        return Collections.emptyList();
    }
}
