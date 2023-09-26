package org.example;

public class CamelCase {
    public static String convertToCamelCase(String string) {
        StringBuilder result = new StringBuilder();
        char[] characters = string.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            char currentChar = characters[i];
            if (currentChar == '-' || currentChar == '_') {
                currentChar = Character.toUpperCase(characters[++i]);
            }
            result.append(currentChar);
        }
        return result.toString();
    }

    public static String breakCamelCase(String input) {
        StringBuilder result = new StringBuilder();
        for (char symbol: input.toCharArray()) {
            if (Character.isUpperCase(symbol)) {
                result.append(' ');
            }
            result.append(symbol);
        }
        return result.toString();
    }
}
