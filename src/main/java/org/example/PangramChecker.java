package org.example;

public class PangramChecker {
  public static boolean isPangram(String sentence) {
    return sentence.chars()
            .filter(Character::isLetter)
            .map(Character::toLowerCase)
            .distinct()
            .count() >= 26;
  }
}
