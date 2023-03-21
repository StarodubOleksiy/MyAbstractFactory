package CarParts.CarPartsImplementation.FordCarParts.fordEngines;

import CarParts.CarEngine;
import Parameters.Details;

public class FordEngineFirstType implements CarEngine {

    private String name;

    public FordEngineFirstType() {
        this.name = "Ford engine of the first type1.";
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
