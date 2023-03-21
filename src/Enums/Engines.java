package Enums;

import CarParts.CarEngine;

import java.util.Arrays;

public interface Engines {

    String getName();

    CarEngine getEngineType();

    static CarEngine createEngine(Engines[] enginesArray, String nameOfEngine) {
        return Arrays.stream(enginesArray)
                .filter(engine -> engine.getName().equals(nameOfEngine))
                .findFirst().map(Engines::getEngineType).
                        orElseThrow(() -> new NullPointerException("There is no such sparepart"));
    }
}
