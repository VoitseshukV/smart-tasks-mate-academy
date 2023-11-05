package org.example;

public class FindDivisor {
  public static int countDivisors(int number) {
    int result = 0;
    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        result++;
      }
    }
    return result;
  }
}