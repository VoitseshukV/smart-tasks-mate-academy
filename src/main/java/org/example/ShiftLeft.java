package org.example;

public class ShiftLeft {
  public static int calculateMoves(String word1, String word2) {
    int matchingSymbols = Math.min(word1.length(), word2.length());
    for (int i = 0; i < Math.min(word1.length(), word2.length()); i++) {
      if (word1.charAt(word1.length() - i - 1) != word2.charAt(word2.length() - i - 1)) {
        matchingSymbols = i;
        break;
      }
    }
    return word1.length() +  word2.length() - 2 * matchingSymbols;
  }
}