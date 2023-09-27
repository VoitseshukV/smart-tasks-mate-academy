package org.example;

import java.util.function.Function;

public class FindAutoType implements Function<Integer, AutoType> {
    @Override
    public AutoType apply(Integer integer) {
        if (integer < 1500) {
            return AutoType.CAR;
        }
        return AutoType.TRUCK;
    }
}
