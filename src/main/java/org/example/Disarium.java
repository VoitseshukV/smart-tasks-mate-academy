package org.example;

public class Disarium {
    public static boolean isDisarium(int number) {
        int result = 0;
        char[] digits = Integer.toString(number).toCharArray();
        for (int i = 0; i < digits.length; i++) {
            result += (int) Math.pow(Integer.parseInt(Character.toString(digits[i])), i + 1);
        }
        return number == result;
    }
}
