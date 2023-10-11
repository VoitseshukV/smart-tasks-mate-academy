package org.example;

public class TruncNumbers {
  public static double truncateToHundredth(double num) {
    return (double) ((int) (num * 100)) / 100;
  }
}
