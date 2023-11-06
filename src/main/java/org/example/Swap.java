package org.example;

public class Swap {
  public Object[] arguments;

  public Swap(final Object[] args) {
    arguments = new Object[]{args[0], args[1]};
  }

  public void swapValues() {
    Object temp = arguments[0];
    arguments[0] = arguments[1];
    arguments[1] = temp;
  }
}
