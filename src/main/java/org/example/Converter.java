package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Converter {
    public static final int DECIMAL_PLACE = 2;

    public static float toKiloPerLiter(float mpg) {
        BigDecimal bd = new BigDecimal(Float.toString(mpg * 1.609344f / 4.54609188f));
        bd = bd.setScale(DECIMAL_PLACE, RoundingMode.HALF_UP);
        return bd.floatValue();
    }
}
