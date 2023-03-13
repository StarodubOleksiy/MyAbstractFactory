package CarParts.CarPartsImplementation.FordCarParts;

import CarParts.CarEngine;

public class FordEngine implements CarEngine {

    private String name;

    public FordEngine() {
        this.name = "Ford engine";
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
