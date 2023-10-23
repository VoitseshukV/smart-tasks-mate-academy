package org.example;

import java.util.function.IntUnaryOperator;

public class Addition {
  public static IntUnaryOperator add(int n) {
    return new IntUnaryOperator() {
      @Override
      public int applyAsInt(int operand) {
        return operand + n;
      }
    };
  }
}