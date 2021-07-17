package vav.codility.recursion;

public class PartitioningIntoMinimumNumberOfDeciBinary {

    public int minPartitions(String n) {
        int max = 0;
        char[] chars = n.toCharArray();
        for (int i=0; i<chars.length; i++) {
            max = Math.max(chars[i] - '0', max);
        }
        return max;
    }
}
