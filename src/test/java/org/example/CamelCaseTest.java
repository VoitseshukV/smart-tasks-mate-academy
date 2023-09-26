package org.example;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CamelCaseTest {
  private static final Map<String, String> dataBreak = new HashMap<>();
  private static final Map<String, String> dataConvert = new HashMap<>();

  @BeforeClass
  public static void beforeClass() {
    dataConvert.put("camelCase", "camelCase");
    dataConvert.put("PascalCase", "PascalCase");
    dataConvert.put("big-data", "bigData");
    dataConvert.put("new_variable", "newVariable");
    dataConvert.put("Forget-Me-Not", "ForgetMeNot");
    dataConvert.put("Java_script", "JavaScript");
    dataConvert.put("convert-This-to-camel-case-please", "convertThisToCamelCasePlease");
    dataConvert.put("And_this_string_too_it_seems_so_long", "AndThisStringTooItSeemsSoLong");
    dataConvert.put("now_we_need-to-Deal-With-mixed_cases_And-delimiters_take-Them_into-account", "nowWeNeedToDealWithMixedCasesAndDelimitersTakeThemIntoAccount");
    dataConvert.put("", "");
    dataBreak.put("aB", "a B");
    dataBreak.put("mateAcademy", "mate Academy");
    dataBreak.put("camelCasingTest", "camel Casing Test");
    dataBreak.put("chicken", "chicken");
  }

  @Test
  public void breakCamelCase_stringInCamelCase() {
    for (Map.Entry<String, String> entry : dataBreak.entrySet()) {
      String input = entry.getKey();
      String expected = entry.getValue();
      String actual = CamelCase.breakCamelCase(input);
      Assert.assertEquals(String.format("The result should be \"%s\" for the input string \"%s\"\n",
        expected, input), expected, actual);
    }
  }

  @Test
  public void breakCamelCase_emptyString() {
    Assert.assertEquals(String.format("The result should be \"%s\" for the empty input string\n", ""),
      "", CamelCase.breakCamelCase(""));
  }

  @Test
  public void convertToCamelCase_inputString() {
    for (Map.Entry<String, String> entry : dataConvert.entrySet()) {
      String input = entry.getKey();
      String expected = entry.getValue();
      String actual = CamelCase.convertToCamelCase(input);
      Assert.assertEquals(String.format("The method should return %s for the input string %s\n",
              expected, input), expected, actual);
    }
  }
}
