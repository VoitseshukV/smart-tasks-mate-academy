package org.example;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference<T> {
    public Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> result1 = new HashSet<>(set1);
        result1.removeAll(set2);
        Set<T> result2 = new HashSet<>(set2);
        result2.removeAll(set1);
        result1.addAll(result2);
        return result1;
    }
}