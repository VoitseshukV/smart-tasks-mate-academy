package org.example;

public class CubicNumbers {
  public static String findCubicNumbers(String string) {
    StringBuilder currentNumber = new StringBuilder();
    StringBuilder result = new StringBuilder();
    int sum = 0;
    char[] charArray = string.toCharArray();
    for (int i = 0; i < charArray.length; i++) {
        char character = charArray[i];
        if (Character.isDigit(character)) {
            currentNumber.append(character);
        }
        if ((currentNumber.length() >= 3)
                || (!currentNumber.isEmpty() && (!Character.isDigit(character)
                || i == charArray.length - 1))) {
            if (isCubic(currentNumber.toString())) {
                if (!result.isEmpty()) {
                    result.append(" ");
                }
                result.append(currentNumber);
                sum += Integer.parseInt(currentNumber.toString());
            }
            currentNumber = new StringBuilder();
        }
    }
    if (result.isEmpty()) {
      return "Unlucky";
    }
    return result + " " + sum + " Lucky";
  }

  private static boolean isCubic(String number) {
    int result = 0;
    for (char digit : number.toCharArray()) {
      result += (int) Math.pow(Integer.parseInt("" + digit), 3);
    }
    return Integer.parseInt(number) == result;
  }
}