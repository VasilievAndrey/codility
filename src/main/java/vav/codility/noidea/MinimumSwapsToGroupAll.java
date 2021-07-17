package vav.codility.noidea;

public class MinimumSwapsToGroupAll {

    public int minSwaps(int[] data) {
        int n = data.length;
        int count =data[0];
        int[] d = new int[n];
        d[0]=data[0];
        for (int i=1; i<n; i++) {
            if (data[i] == 1) {
                count++;
                d[i] = d[i-1] +1;
            } else {
                d[i] = d[i-1];
            }
        }
        if (count == 1 || count == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int i =0; i<= n - count; i++) {
            int sum;
            if (i==0) {
                sum = Math.abs(count - d[i + count -1]);
            } else {
                sum = Math.abs(count - d[i + count -1] + d[i -1]);
            }
            min = Math.min(min, sum);
        }
        return min;
    }
}
