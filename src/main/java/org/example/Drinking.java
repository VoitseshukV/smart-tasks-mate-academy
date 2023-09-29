package org.example;

public class Drinking {
    public static void main(String[] arg) {
        System.out.println(hydrate("1 beer"));
        System.out.println(hydrate("1 shot, 5 ciders and 1 glass of wine"));
    }

    public static String hydrate(String drinks) {
        String[] words = drinks.split("\\W+");
        int result = 0;
        for (String word: words) {
            if (word.matches("\\d+")) {
                result += Integer.valueOf(word);
            }
        }
        return new StringBuilder().append(result).append(result == 1 ? " glass" : " glasses").append(" of water").toString();
    }
}
