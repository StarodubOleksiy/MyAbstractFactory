package CarParts.CarPartsImplementation.MercedesCarParts.mercedesEngines;

import CarParts.CarEngine;
import Parameters.Details;

public class MercedesEngineFirstType implements CarEngine {

    private String name;

    public MercedesEngineFirstType() {
        this.name = "Mercedes engine of the first type1.";
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
        return "MercedesEngineFirstType{" +
                "name='" + name + '\'' +
                '}';
    }
}
