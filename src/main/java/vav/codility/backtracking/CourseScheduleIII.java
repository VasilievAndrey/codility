package vav.codility.backtracking;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class CourseScheduleIII {
    int max = 0;
    public int scheduleCourse1(int[][] courses) {
        boolean[] vis = new boolean[courses.length];
        List<int[]> ans = new LinkedList<>();
        dfs(ans, courses, vis, 0,1);
        return max;
    }

    private void dfs(List<int[]> ans, int[][] courses, boolean[] vis, int total, int level) {
        for (int i=0; i<courses.length; i++) {
            if (vis[i]) {
                continue;
            }
            if (total + courses[i][0] <= courses[i][1]) {
                vis[i] = true;
                max = Math.max(level, max);
                ans.add(courses[i]);
                dfs(ans, courses, vis, total + courses[i][0], level+1);
                ans.remove(courses[i]);
                vis[i] =false;
                ans.remove(courses[i]);
            }
        }
    }

    public int scheduleCourse(int[][] courses) {
        Queue<Integer> q = new PriorityQueue<>((a,b) -> b -a);
        Arrays.sort(courses, (a,b) -> a[1] - b[1]);
        int totalDuration =0;
        for (int[] cour:courses) {
                if (totalDuration + cour[0]<= cour[1]) {
                    totalDuration += cour[0];
                    q.add(cour[0]);
                    continue;
                } else if (!q.isEmpty() && q.peek() > cour[0]) {
                    int peek = q.poll();
                    totalDuration += cour[0] -peek;
                    q.add(cour[0]);
                }
        }
        return q.size();
    }
}
