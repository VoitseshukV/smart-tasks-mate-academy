package org.example;

import org.junit.Assert;
import org.junit.Test;

public class ShiftLeftTest {
  @Test
  public void calculateMoves_emptyBothStrings() {
    String word1 = "";
    String word2 = "";
    int actual = ShiftLeft.calculateMoves(word1, word2);
    Assert.assertEquals("The result should be 0 if both strings are empty\n",
      0, actual);
  }

  @Test
  public void calculateMoves_checkOneMove() {
    String word1 = "b";
    String word2 = "ab";
    int actual = ShiftLeft.calculateMoves(word1, word2);
    Assert.assertEquals(String.format("The result should be %d for word1 = \"%s\" and word2 = \"%s\"\n",
      1, word1, word2), 1, actual);
  }

  @Test
  public void calculateMoves_checkTwoMoves() {
    String word1 = "test";
    String word2 = "west";
    int actual = ShiftLeft.calculateMoves(word1, word2);
    Assert.assertEquals(String.format("The result should be %d for word1 = \"%s\" and word2 = \"%s\"\n",
      2, word1, word2), 2, actual);
  }

  @Test
  public void calculateMoves_checkSevenMoves() {
    String word1 = "test";
    String word2 = "yes";
    int actual = ShiftLeft.calculateMoves(word1, word2);
    Assert.assertEquals(String.format("The result should be %d for word1 = \"%s\" and word2 = \"%s\"\n",
      7, word1, word2), 7, actual);
  }

  @Test
  public void calculateMoves_checkElevenMoves() {
    String word1 = "mate";
    String word2 = "academy";
    int actual = ShiftLeft.calculateMoves(word1, word2);
    Assert.assertEquals(String.format("The result should be %d for word1 = \"%s\" and word2 = \"%s\"\n",
      11, word1, word2), 11, actual);
  }

  @Test
  public void calculateMoves_checkOneEmptyString() {
    String word1 = "hello";
    String word2 = "";
    int actual = ShiftLeft.calculateMoves(word1, word2);
    Assert.assertEquals(String.format("The result should be %d for word1 = \"%s\" and word2 = \"%s\"\n",
      5, word1, word2), 5, actual);
  }
}
