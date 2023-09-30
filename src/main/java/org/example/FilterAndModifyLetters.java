package org.example;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterAndModifyLetters {
  public static String filterLetters(String input) {
    return IntStream.range(0, input.length())
            .filter(i -> i % 2 == 0)
            .map(i -> Character.toUpperCase(input.charAt(i)))
            .mapToObj(character -> "" + (char) character)
            .collect(Collectors.joining());
  }
}