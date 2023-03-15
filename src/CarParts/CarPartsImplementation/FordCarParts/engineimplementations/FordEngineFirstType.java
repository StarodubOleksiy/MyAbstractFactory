package CarParts.CarPartsImplementation.FordCarParts.engineimplementations;

import CarParts.CarPartsImplementation.FordCarParts.FordEngine;

public class FordEngineFirstType implements FordEngine {

    private String name;

    public FordEngineFirstType() {
        this.name = "Ford engine of the first type";
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
