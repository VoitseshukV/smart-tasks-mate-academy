package org.example;

import java.util.Random;
import java.util.function.Supplier;

public class GetRandomColor  implements Supplier<String> {
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "pink",
            "black", "white"};
    private final Random random = new Random();

    @Override
    public String get() {
        return COLORS[random.nextInt(COLORS.length)];
    }
}
