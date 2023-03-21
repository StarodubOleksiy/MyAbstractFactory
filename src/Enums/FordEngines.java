package Enums;

import CarParts.CarEngine;
import CarParts.CarPartsImplementation.FordCarParts.fordEngines.FordEngineFirstType;
import CarParts.CarPartsImplementation.FordCarParts.fordEngines.FordEngineSecondType;

public enum FordEngines implements Engines {
    FordEngineFirstType("FordEngineFirstType", new FordEngineFirstType()),
    FordEngineSecondType("FordEngineSecondType", new FordEngineSecondType());

    private String name;

    private CarEngine engineType;


    FordEngines(String name, CarEngine engine) {
        this.name = name;
        this.engineType = engine;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public CarEngine getEngineType() {
        return engineType;
    }


}
