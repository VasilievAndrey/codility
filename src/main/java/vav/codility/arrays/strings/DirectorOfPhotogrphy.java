package vav.codility.arrays.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class DirectorOfPhotogrphy {

    public long getArtisticPhotographCount(int N, String C, int X, int Y) {
        // Write your code here
        char[] chs = C.toCharArray();
        Queue<Integer> photo = new PriorityQueue<>();
        Queue<Integer> back = new PriorityQueue<>();
        Queue<int[]> act = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        Queue<int[]> act2 = new PriorityQueue<>((a,b) -> b[0] - a[0]);
        long ans =0;
        for (int i=0; i<N; i++) {
            if (chs[i] == '.') continue;
            if (chs[i]== 'P') {
                photo.add(i);
                while (!act2.isEmpty() && i-act2.peek()[0]> Y) {
                    act2.poll();
                }
                for (int[] ac: act2) {
                    if (i-ac[0]>=X) {
                        ans +=ac[1];
                    }
                }

            } else if (chs[i] == 'A') {
                while(!back.isEmpty() && i - back.peek() > Y) {
                    back.poll();
                }
                int c = 0;
                for (Integer ind: back) {
                    if (i-ind >= X) {
                        c++;
                    }
                }
                if (c>0) {
                    act2.add(new int[] {i, c});
                }
                while(!photo.isEmpty() && i-photo.peek() > Y) {
                    photo.poll();
                }
                c = 0;
                for (Integer ind: photo) {
                    if (i -ind >=X) {
                        c++;
                    }
                }
                if (c > 0) {
                    act.add(new int[]{i, photo.size()});
                }
            } else if (chs[i] == 'B') {
                back.add(i);
                while (!act.isEmpty() && i - act.peek()[0] > Y) {
                    act.poll();
                }
                for (int[] ac: act) {
                    if (i - ac[0]>=X) {
                        ans +=ac[1];
                    }
                }
            }
        }


        return ans;
    }

}
