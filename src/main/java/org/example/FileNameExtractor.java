package org.example;

public class FileNameExtractor {
  public static String extractFileName(String dirtyFileName) {
    String[] parts = dirtyFileName.split("\\.");
    return parts[0].substring(parts[0].indexOf('_') + 1) + "." + parts[1];
  }
}
