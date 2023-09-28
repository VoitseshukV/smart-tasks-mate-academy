package org.example;

import java.util.Arrays;

public class SupermarketQueue {
  public static int calculateTotalTime(int[] customers, int checkout) {
    int[] checkouts = new int[checkout];
    for (int customer : customers) {
      checkouts[minElement(checkouts)] += customer;
    }
    return maxValue(checkouts);
  }

  private static int minElement(int[] checkouts) {
    int result = 0;
    for (int i = 0; i < checkouts.length; i++) {
      if (checkouts[i] < checkouts[result]) {
        result = i;
      }
    }
    return result;
  }

  private static int maxValue(int[] checkouts) {
    return Arrays.stream(checkouts).max().orElseThrow(() -> new RuntimeException("No elements"));
  }
}
