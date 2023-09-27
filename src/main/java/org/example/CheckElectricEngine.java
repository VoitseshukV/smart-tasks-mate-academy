package org.example;

import java.util.function.Predicate;

public class CheckElectricEngine implements Predicate<Engine> {
    @Override
    public boolean test(Engine engine) {
        return engine.getEngineType() == Engine.EngineType.ELECTRIC;
    }
}
