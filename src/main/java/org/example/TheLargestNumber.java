package org.example;

import java.util.Arrays;

public class TheLargestNumber {
    public static long getMaxNumber(long num) {
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        return Long.parseLong(new StringBuilder(new String(digits)).reverse().toString());
    }
}
