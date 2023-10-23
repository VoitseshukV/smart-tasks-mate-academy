package org.example;

import org.junit.Assert;
import org.junit.Test;

public class AdditionTest {
  @Test
  public void add_positiveToPositive() {
    Assert.assertEquals("Addition.add(3, 5)", Addition.add(3).applyAsInt(5), 8);
  }

  @Test
  public void add_positiveToNegative() {
    Assert.assertEquals("Addition.add(-2, 6)", Addition.add(-2).applyAsInt(6), 4);
  }

  @Test
  public void add_negativeToNegative() {
    Assert.assertEquals("Addition.add(-19, -11)", Addition.add(-19).applyAsInt(-11), -30);
  }

  @Test
  public void add_negativeToPositive() {
    Assert.assertEquals("Addition.add(7, -1)", Addition.add(7).applyAsInt(-1), 6);
  }

  @Test
  public void add_zeroToPositive() {
    Assert.assertEquals("Addition.add(999, 0)", Addition.add(999).applyAsInt(0), 999);
  }

  @Test
  public void add_zeroToNegative() {
    Assert.assertEquals("Addition.add(-84, 0)", Addition.add(-84).applyAsInt(0), -84);
  }

  @Test
  public void add_zeroToZero() {
    Assert.assertEquals("Addition.add(0, 0)", Addition.add(0).applyAsInt(0), 0);
  }
}
