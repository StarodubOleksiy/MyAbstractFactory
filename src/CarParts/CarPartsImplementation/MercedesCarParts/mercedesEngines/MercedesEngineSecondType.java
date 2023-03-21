package CarParts.CarPartsImplementation.MercedesCarParts.mercedesEngines;

import CarParts.CarEngine;
import Parameters.Details;

public class MercedesEngineSecondType implements CarEngine {

    private String name;

    public MercedesEngineSecondType() {
        this.name = "Mercedes engine of the second type2.";
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
        return "MercedesEngineSecondType{" +
                "name='" + name + '\'' +
                '}';
    }
}
