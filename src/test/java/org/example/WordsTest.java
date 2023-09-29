package org.example;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WordsTest {
  private static final Map<String, String> data = new HashMap<>();

  @BeforeClass
  public static void beforeClass() {
    data.put("a", "a");
    data.put("winner", "winner");
    data.put("get champion word", "champion");
    data.put("equal equal equal equal equal", "equal");
    data.put("this string is pretty long and i hope you will manage to find the highest scoring word", "pretty");
    data.put("cat sad kid", "cat");
    data.put("", "");
  }

  @Test
  public void getWinnerWord_stringOfWords() {
    for (Map.Entry<String, String> entry : data.entrySet()) {
      String input = entry.getKey();
      String expected = entry.getValue();
      String actual = Words.getWinnerWord(input);
      Assert.assertEquals(String.format("The method should return %s for the input string %s\n",
        expected, input), expected, actual);
    }
  }
}
