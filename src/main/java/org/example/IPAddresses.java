package org.example;

public class IPAddresses {
    public static long countIPBetween(String start, String end) {
        String[] startDigits = start.split("\\.");
        String[] endDigits = end.split("\\.");
        return difference(startDigits[3], endDigits[3])
                + difference(startDigits[2], endDigits[2]) * 256L
                + difference(startDigits[1], endDigits[1]) * (long) Math.pow(256, 2)
                + difference(startDigits[0], endDigits[0]) * (long) Math.pow(256, 3);
    }

    private static int difference(String start, String end) {
        return Integer.valueOf(end) - Integer.valueOf(start);
    }
}
