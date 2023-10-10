package org.example;

public class Null {
  public int hashCode() {
    return 0;
  }  

  public boolean equals(Object o) {
    return o == null || o.getClass() == Null.class;
  }

  public String toString() {
    return "" + null;
  }  
}