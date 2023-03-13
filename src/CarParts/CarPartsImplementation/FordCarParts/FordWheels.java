package CarParts.CarPartsImplementation.FordCarParts;

import CarParts.CarWheels;

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
    public String toString() {
        return "FordWheels{" +
                "name='" + name + '\'' +
                '}';
    }
}
