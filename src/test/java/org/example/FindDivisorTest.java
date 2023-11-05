package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class FindDivisorTest {
  @Test
  public void countDivisors_randomNumber() {
    Random random = new Random();
    int randomNum = 1 + random.nextInt(100);
    int counter = countDivisors(randomNum);

    Assert.assertEquals(String.format("Your method should return the number of divisors %d for the number %d",
      counter, randomNum), counter, FindDivisor.countDivisors(randomNum));
  }

  private static int countDivisors(int number) {
    int result = 0;
    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        result++;
      }
    }
    return result;
  }
}
