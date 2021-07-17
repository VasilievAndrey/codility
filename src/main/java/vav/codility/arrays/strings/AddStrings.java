package vav.codility.arrays.strings;

public class AddStrings {

    public static String addStrings(String num1, String num2) {
        if (num1.length() < num2.length()) {
            return addStrings(num2, num1);
        }
        StringBuilder res = new StringBuilder();
        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();
        int remainder = 0;
        for (int i =0; i<num1.length(); i++) {
            int n2 = 0;
            if (i < num2.length()) {
                n2 = chars2[chars2.length -1 -i] - 48;
            }
            int sum = remainder + chars1[chars1.length -1 - i] - 48 + n2;
            if (sum > 9) {
                remainder = sum % 10;
                if (remainder == 0) {
                    res.append("0");
                } else {
                    res.append(remainder);
                }
                remainder = 1;
            } else {
                res.append(sum);
                remainder = 0;
            }
        }
        if (remainder == 1) {
            res.append(1);
        }
        String revers = revers(res);
        return revers;
    }

    private static String revers(StringBuilder res) {
        StringBuilder rev = new StringBuilder();
        char[] chars = res.toString().toCharArray();
        for (int i = chars.length -1; i >=0; i--) {
            rev.append(chars[i]);
        }
        return rev.toString();
    }

}
