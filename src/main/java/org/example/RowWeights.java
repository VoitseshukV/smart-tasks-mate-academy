package org.example;

public class RowWeights {
  public static int[] getTotalWeight(int[] weights) {
    int team1 = 0;
    int team2 = 0;
    for (int i = 0; i < weights.length; i++) {
      if (i % 2 == 0) {
        team1 += weights[i];
      } else {
        team2 += weights[i];
      }
    }
    return new int[] {team1, team2};
  }
}
