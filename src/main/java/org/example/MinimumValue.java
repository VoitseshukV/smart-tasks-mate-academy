package org.example;

import java.util.Set;
import java.util.TreeSet;

public class MinimumValue {
    public static int getMinValue(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        StringBuilder result = new StringBuilder();
        for (Object num: set.toArray()) {
            result.append(num);
        }
        return Integer.parseInt(result.toString());
    }
}
