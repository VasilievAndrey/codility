package vav.codility.arrays.strings;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {

    private static String[] ones = new String[]{
        "I","II","III","IV","V","VI","VII","VIII","IX"
    };
    private static String[] tens = new String[]{
        "X","XX","XXX","XL","L","LX","LXX","LXXX","XC",
    };

    private static String[] hundr = new String[]{
        "C","CC","CCC","CD","D","DC","DCC","DCCC","CM",
    };

    private static String[] thousand = new String[]{
        "M", "MM", "MMM",
    };

    public static String intToRoman(int num) {

        StringBuilder buf = new StringBuilder();
        int thousInd = num / 1000;
        int remainder = num % 1000;
        if (thousInd > 0) {
            buf.append(thousand[thousInd -1]);
        }
        int hundrInd = remainder / 100;
        remainder = num % 100;
        if (hundrInd > 0) {
            buf.append(hundr[hundrInd -1]);
        }
        int tensInd = remainder / 10;
        remainder = remainder % 10;
        if (tensInd > 0) {
            buf.append(tens[tensInd -1]);
        }
        if (remainder > 0) {
            buf.append(ones[remainder -1]);
        }
        return buf.toString();
    }
}
