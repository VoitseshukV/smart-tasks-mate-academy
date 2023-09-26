package org.example;

public class Dictionary {
    private final String[] words;

    public Dictionary(String[] words) {
        this.words = words;
    }

    public String findMostSimilar(String term) {
        int minSteps = -1;
        String result = "";
        for (String word: words) {
            int wordSteps = getSteps(term, word);
            if (minSteps == -1 || minSteps > wordSteps) {
                minSteps = wordSteps;
                result = word;
            }
        }
        return result;
    }

    private int getSteps(String term, String word) {
        if (term.equals(word)) {
            return 0;
        }
        int[] previousRow = new int[term.length() + 1];
        for (int i = 0; i <= term.length(); i++) {
            previousRow[i] = 1;
        }
        for (int i = 1; i <= word.length(); i++) {
            int[] currentRow = new int[previousRow.length];
            currentRow[0] = i;
            for (int j = 1; j < currentRow.length; j++) {
                currentRow[j] = Math.min(Math.min(previousRow[j] + 1, currentRow[j - 1] + 1), previousRow[j - 1]
                        + (charsEquals(term, word, j - 1, i - 1) ? 0 : 1));
            }
            for (int j = 0; j < currentRow.length; j++) {
                previousRow[j] = currentRow[j];
            }
        }
        return previousRow[term.length()];
    }

    private boolean charsEquals(String term, String word, int indexTerm, int indexWord) {
        if (indexTerm >= term.length() || indexWord >= word.length()) {
            return false;
        }
        return term.charAt(indexTerm) == word.charAt(indexWord);
    }
}
