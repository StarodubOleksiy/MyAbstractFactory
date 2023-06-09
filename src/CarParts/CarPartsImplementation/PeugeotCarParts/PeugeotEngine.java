package CarParts.CarPartsImplementation.PeugeotCarParts;

import CarParts.CarEngine;
import Parameters.Details;

public class PeugeotEngine implements CarEngine {

    private String name;

    public PeugeotEngine() {
        this.name = "Peugeot engine";
    }

    @Override
    public CarEngine setDetails(Details details)
    {
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PeugeotEngine{" +
                "name='" + name + '\'' +
                '}';
    }
}
