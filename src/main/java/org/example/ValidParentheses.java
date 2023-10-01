package org.example;

public class ValidParentheses {
  public static boolean isValidParentheses(String string) {
    int check = 0;
    for (char character: string.toCharArray()) {
      if (character == '(') {
        check++;
      } else if (character == ')') {
        check--;
      }
      if (check < 0) {
        return false;
      }
    }
    return check == 0;  
  }
}
