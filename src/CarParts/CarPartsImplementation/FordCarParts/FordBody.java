package CarParts.CarPartsImplementation.FordCarParts;

import CarParts.CarBody;
import CarParts.CarEngine;
import Parameters.Details;

public class FordBody implements CarBody {

    private String name;

    public FordBody() {
        this.name = "Ford body";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public CarBody setDetails(Details details)
    {
        return this;
    }

    @Override
    public String toString() {
        return "FordBody{" +
                "name='" + name + '\'' +
                '}';
    }
}
