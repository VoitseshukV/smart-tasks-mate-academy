package org.example;

import org.junit.Assert;
import org.junit.Test;

public class ScreenSizeTest {
  @Test
  public void findScreenSize_check4By3() {
    int width = 1024;
    String ratio = "4:3";
    String expected = "1024x768";
    String actual = ScreenSize.findScreenSize(width, ratio);
    Assert.assertEquals(String.format("The screen dimensions are \"%s\" for width = %d and ratio = \"%s\"\n",
      expected, width, ratio), expected, actual);
  }

  @Test
  public void findScreenSize_check5By4() {
    int width = 1280;
    String ratio = "5:4";
    String expected = "1280x1024";
    String actual = ScreenSize.findScreenSize(width, ratio);
    Assert.assertEquals(String.format("The screen dimensions are \"%s\" for width = %d and ratio = \"%s\"\n",
      expected, width, ratio), expected, actual);
  }

  @Test
  public void findScreenSize_check3By2() {
    int width = 2160;
    String ratio = "3:2";
    String expected = "2160x1440";
    String actual = ScreenSize.findScreenSize(width, ratio);
    Assert.assertEquals(String.format("The screen dimensions are \"%s\" for width = %d and ratio = \"%s\"\n",
      expected, width, ratio), expected, actual);
  }

  @Test
  public void findScreenSize_check16By9() {
    int width = 1920;
    String ratio = "16:9";
    String expected = "1920x1080";
    String actual = ScreenSize.findScreenSize(width, ratio);
    Assert.assertEquals(String.format("The screen dimensions are \"%s\" for width = %d and ratio = \"%s\"\n",
      expected, width, ratio), expected, actual);
  }

  @Test
  public void findScreenSize_check32By9() {
    int width = 5120;
    String ratio = "32:9";
    String expected = "5120x1440";
    String actual = ScreenSize.findScreenSize(width, ratio);
    Assert.assertEquals(String.format("The screen dimensions are \"%s\" for width = %d and ratio = \"%s\"\n",
      expected, width, ratio), expected, actual);
  }
}
