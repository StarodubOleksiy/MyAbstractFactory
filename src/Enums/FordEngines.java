package Enums;

import CarParts.CarEngine;
import CarParts.CarPartsImplementation.FordCarParts.FordEngine;
import CarParts.CarPartsImplementation.FordCarParts.engineimplementations.FordEngineFirstType;
import CarParts.CarPartsImplementation.FordCarParts.engineimplementations.FordEngineSecondType;

public enum FordEngines {
    FordEngineFirstType, FordEngineSecondType;

    public static CarEngine getFordEngine(FordEngines engine) {
        switch (engine) {
            case FordEngineFirstType:
                return new FordEngineFirstType();
            default:
                return new FordEngineSecondType();
        }
    }
    }
