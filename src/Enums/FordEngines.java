package Enums;

import CarParts.CarEngine;
import CarParts.CarPartsImplementation.FordCarParts.fordEngines.FordEngineFirstType;
import CarParts.CarPartsImplementation.FordCarParts.fordEngines.FordEngineSecondType;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Optional;

public enum FordEngines {
    FordEngineFirstType("FordEngineFirstType", new FordEngineFirstType()),
    FordEngineSecondType("FordEngineSecondType", new FordEngineSecondType());

    private String name;

    private CarEngine engineType;


    FordEngines(String name, CarEngine engine) {
        this.name = name;
        this.engineType = engine;
    }

    public String getName() {
        return name;
    }

    public CarEngine getEngineType() {
        return engineType;
    }

    public static CarEngine createFordEngine(String nameOfEngine) {
        return Arrays.asList(FordEngines.values()).stream()
                .filter(engine -> engine.getName().equals(nameOfEngine))
                .findFirst().map(FordEngines::getEngineType).
                        orElseThrow(() ->new NullPointerException("There is no such engine"));
    }


}
