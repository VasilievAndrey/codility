package vav.codility.arrays.strings;

public class ReverseInt {

    public static int reverse(int x) {
        String str = String.valueOf(x);
        int sign = 1;
        if (str.charAt(0)== '-') {
            str = str.substring(1, str.length());
            sign = -1;
        }
        StringBuilder builder = new StringBuilder();
        char[] arr = str.toCharArray();
        for (int i = str.length() -1; i>=0; i--) {
            builder.append(arr[i]);
        }
        String revers = builder.toString();
        Long longRevers = Long.valueOf(revers);
        Double max = Math.pow(2.0, 31.0);
        if (longRevers > max.intValue() -1) {
            return 0;
        }
        return longRevers.intValue() * sign;
    }
}
