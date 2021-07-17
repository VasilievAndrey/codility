package vav.codility.arrays.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class ReorderDataInLogFiles {

    public String[] reorderLogFiles(String[] logs) {

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String[] token1 = s1.split(" ");
                String[] token2 = s2.split(" ");

                if (Character.isDigit(token1[1].charAt(0))) {
                    if (Character.isDigit(token2[1].charAt(0))) return 0;
                    else return 1;
                }
                if (Character.isDigit(token2[1].charAt(0))) return -1;

                int preCompute = token1[1].compareTo(token2[1]);
                if (preCompute == 0) return token1[0].compareTo(token2[0]);
                return preCompute;
            }
        };

        Arrays.sort(logs, comparator);
        return logs;
    }
}
