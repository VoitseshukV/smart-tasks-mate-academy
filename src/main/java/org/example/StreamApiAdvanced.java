package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApiAdvanced {
  /**
   * Given array of numbers, your task is to sort them in the reverse order and return only those
   * numbers that can be divided by 5 without a remainder.
   */
  public List<Integer> filterAndReverse(int[] inputNumbers) {
    return Arrays.stream(inputNumbers)
            .boxed()
            .sorted(Collections.reverseOrder())
            .filter(i -> i % 5 == 0)
            .collect(Collectors.toList());
  }

  /**
   * We want to gather some statistics: we have list of people and we want to know
   * distribution among the age of women who have cats and are older than 18
   * Result should have the following view: Map.of(19 - List.of(person1, person2, ...),
   * 21 - List.of(person3, person7, ...);
   */
  public Map<Integer, List<Person>> groupByAge(List<Person> people) {
    return people
            .stream()
            .filter(p -> !p.getCatList().isEmpty() && p.getAge() > 18 && p.getSex() == Person.Sex.WOMAN)
            .collect(Collectors.groupingBy(Person::getAge, Collectors.toList()));
  }

  /**
   * Given a list of random strings, group all of them by the last letter from the
   * string. If last char is a number or punctuation - skip the word.
   */
  public Map<Character, List<String>> groupWordsByLastChar(List<String> words) {
    return words.stream()
            .filter(s -> Character.isLetter(s.charAt(s.length() - 1)))
            .collect(Collectors.groupingBy(s -> s.charAt(s.length() - 1), Collectors.toList()));
  }
}