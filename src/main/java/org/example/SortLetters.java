package org.example;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class SortLetters {
    public static final int LETTER_COUNTS = 5;

    public String getUniqueCharacters(String text) {
        Set<String> chars = new TreeSet<>();
        String[] onlyAlphabet = text.replaceAll("[^A-Za-z]+", "").toLowerCase().split("(?!^)");
        Collections.addAll(chars, onlyAlphabet);
        StringBuilder result = new StringBuilder();
        for (String letter: chars) {
            result.append(letter);
            if (result.length() >= LETTER_COUNTS) {
                break;
            }
        }
        return result.toString();
    }
}
