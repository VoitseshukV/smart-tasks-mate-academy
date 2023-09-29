package org.example;

public class Words {
  public static String getWinnerWord(String words) {
    String[] splittedWords = words.split(" ");
    int maxScore = 0;
    String result = "";
    for (String word: splittedWords) {
      int score = score(word);
      if (score > maxScore) {
        maxScore = score;
        result = word;
      } 
    }
    return result;
  }

  private static int score(String word) {
    return word.chars()
            .map(i -> i - 'a' + 1)
            .sum();
  }
}
