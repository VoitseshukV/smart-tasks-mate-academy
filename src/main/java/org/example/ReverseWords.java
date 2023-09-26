package org.example;

public class ReverseWords {
    public static String reverseWords(final String string) {
        StringBuilder result = new StringBuilder();
        StringBuilder reverse = new StringBuilder();
        for (char symbol: string.toCharArray()) {
            if (symbol == ' ') {
                result.append(reverse.reverse());
                reverse = new StringBuilder();
                result.append(symbol);
            } else {
                reverse.append(symbol);
            }
        }
        if (!reverse.isEmpty()) {
            result.append(reverse.reverse());
        }
        return result.toString();
    }
}
