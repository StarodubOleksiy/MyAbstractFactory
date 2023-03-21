package CarParts.CarPartsImplementation.FordCarParts;

import CarParts.CarWheels;
import Parameters.Details;

public class FordWheels implements CarWheels {

    private String name;

    public FordWheels() {
        this.name = "Ford wheels";
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public FordWheels setDetails(Details details) {
        return this;
    }


    @Override
    public String toString() {
        return "FordWheels{" +
                "name='" + name + '\'' +
                '}';
    }
}
