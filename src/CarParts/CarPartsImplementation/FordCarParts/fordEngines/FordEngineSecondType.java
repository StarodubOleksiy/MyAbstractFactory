package CarParts.CarPartsImplementation.FordCarParts.fordEngines;

import CarParts.CarEngine;
import Parameters.Details;

public class FordEngineSecondType implements CarEngine {

    private String name;

    public FordEngineSecondType() {
        this.name = "Ford engine of the second type";
    }

    @Override
    public CarEngine setDetails(Details details) {
        return this;
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
