package org.example;

public class WordsLength {
  public static int getWordsLength(String[] words) {
    if (words == null) {
      return 0;
    }
    int result = 0;
    for (String word: words) {
      if (word.indexOf("a") >= 0 && word.indexOf("z") < 0) {
        result += word.length();
      }
    }
    return result;
  }
}