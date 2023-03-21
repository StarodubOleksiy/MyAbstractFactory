package Enums;

import CarParts.CarEngine;
import CarParts.CarPartsImplementation.MercedesCarParts.mercedesEngines.MercedesEngineFirstType;
import CarParts.CarPartsImplementation.MercedesCarParts.mercedesEngines.MercedesEngineSecondType;

public enum MercedesEngines implements Engines {

    MercedesEngineFirstType("MercedesEngineFirstType", new MercedesEngineFirstType()),
    MercedesEngineSecondType("MercedesEngineSecondType", new MercedesEngineSecondType());

    private String name;

    private CarEngine engineType;


    MercedesEngines(String name, CarEngine engine) {
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
