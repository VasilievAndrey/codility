package vav.codility.tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CourseSchedule2 {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        int[] indegree = new int[numCourses];

        for (int[] node : prerequisites) {
            List<Integer> nextCourses = graph.getOrDefault(node[1], new LinkedList<>());
            nextCourses.add(node[0]);
            graph.put(node[1], nextCourses);
            indegree[node[0]] +=1;
        }


        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }
        int[] inorder = new int[numCourses];
        int i=0;
        while(!queue.isEmpty()) {
            Integer node = queue.remove();
            inorder[i++] = node;

            if (graph.keySet().contains(node)) {
                List<Integer> courses = graph.get(node);
                for (int next : courses) {
                    indegree[next]--;
                    if (indegree[next] == 0) {
                        queue.add(next);
                    }
                }
            }
        }

        if (i == numCourses) {
            return inorder;
        }

        return new int[0];

    }
}
