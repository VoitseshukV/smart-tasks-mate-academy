package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NextBiggerNumber {
    public static int getNextBiggerNumber(int n) {
        char[] digits = Integer.valueOf(n).toString().toCharArray();
        List<Character> swappedDigits = new ArrayList<>();
        for (int i = digits.length - 1; i >= 1; i--) {
            swappedDigits.add(digits[i]);
            if (digits[i - 1] < digits[i]) {
                swappedDigits.add(digits[i - 1]);
                digits[i - 1] = getSmallest(swappedDigits, digits[i - 1]);
                Comparator<Character> characterComparator = new Comparator<Character>() {
                    @Override
                    public int compare(Character char1, Character char2) {
                        return Character.compare(char1, char2);
                    }
                };
                swappedDigits.sort(characterComparator);
                for (int j = digits.length - 1; j >= i; j--) {
                    digits[j] = swappedDigits.get(j - i);
                }
                return Integer.parseInt(new String(digits));
            }
        }
        return -1;
    }

    private static char getSmallest(List<Character> swappedDigits, char digit) {
        char result = digit;
        for (char swappedDigit : swappedDigits) {
            if (result == digit) {
                result = swappedDigit;
            } else if (swappedDigit > digit) {
                result = (char) Math.min(swappedDigit, result);
            }
        }
        swappedDigits.remove((Character) result);
        return result;
    }
}
