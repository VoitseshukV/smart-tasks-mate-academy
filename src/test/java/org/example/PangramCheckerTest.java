package org.example;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

public class PangramCheckerTest {
  private static final Map<String, Boolean> data = new HashMap<>();

  @BeforeClass
  public static void beforeClass() {
    data.put("cwm fjord bank glyphs vext quiz", true);
    data.put("HOW QUICKLY DAFT JUMPING ZEBRAS VEX", true);
    data.put("Pack My Box With Five Dozen Liquor Jugs.", true);
    data.put("aaaaaaaaaaaaaaaaaaaaaaaaaa", false);
    data.put("AB&CD4?5EFGH1J[KLMNOPQ]R56(STUVW3X)YZ", false);
    data.put("This isn't a pangram!", false);
    data.put("The five boxing wizards jump quickly.", true);
    data.put("", false);
  }

  @Test
  public void isPangram_checkLettersInString() {
    for (Map.Entry<String, Boolean> entry : data.entrySet()) {
      String input = entry.getKey();
      boolean expected = entry.getValue();
      boolean actual = PangramChecker.isPangram(input);
      Assert.assertEquals(String.format("The result should be %b for the input string \"%s\"\n",
        expected, input), expected, actual);
    }
  }
}
