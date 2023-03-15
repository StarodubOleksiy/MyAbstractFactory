package CarParts.CarPartsImplementation.FordCarParts.engineimplementations;

import CarParts.CarPartsImplementation.FordCarParts.FordEngine;

public class FordEngineSecondType implements FordEngine {

    private String name;

    public FordEngineSecondType() {
        this.name = "Ford engine of the second type";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "FordEngine{" +
                "name='" + name + '\'' +
                '}';
    }
}
