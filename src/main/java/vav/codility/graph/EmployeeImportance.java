package vav.codility.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class EmployeeImportance {

    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    };

    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee em: employees) {
            map.put(em.id, em);
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(id);
        int ans = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            for (int i=0; i< size; i++) {
                Integer poll = q.poll();
                Employee em = map.get(poll);
                if (em != null) {
                    ans += em.importance;
                }
                q.addAll(em.subordinates);
            }
        }
        return ans;
    }
}
