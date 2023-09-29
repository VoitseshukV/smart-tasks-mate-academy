package org.example;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

public class AutomorphicNumberTest {
  private static final Map<Integer, String> data = new HashMap<>();

  @BeforeClass
  public static void beforeClass() {
    data.put(1, "Automorphic");
    data.put(6, "Automorphic");
    data.put(3, "Not!!");
    data.put(13, "Not!!");
    data.put(25, "Automorphic");
    data.put(76, "Automorphic");
    data.put(225, "Not!!");
    data.put(625, "Automorphic");
    data.put(1355, "Not!!");
  }

  @Test
  public void detectAutomorphic_checkNumbers() {
    for (Map.Entry<Integer, String> entry : data.entrySet()) {
      int input = entry.getKey();
      String expected = entry.getValue();
      String actual = AutomorphicNumber.detectAutomorphic(input);
      Assert.assertEquals(String.format("Your method should return \"%s\" for the number %d\n",
        expected, input), expected, actual);
    }
  }
}
