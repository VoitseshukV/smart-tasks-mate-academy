package org.example;

public class AutomorphicNumber {
  public static String detectAutomorphic(int number) {
    return String.valueOf((int) Math.pow(number, 2)).endsWith("" + number) ? "Automorphic" : "Not!!";
  }
}
