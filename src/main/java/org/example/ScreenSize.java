package org.example;

public class ScreenSize {
  public static String findScreenSize(int width, String ratio) {
    String[] ratioParts = ratio.split(":");
    return width + "x" +
            (int) (width * Integer.parseInt(ratioParts[1]) / Integer.parseInt(ratioParts[0]));
  }
}