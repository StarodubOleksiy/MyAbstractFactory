package CarParts.CarPartsImplementation.PeugeotCarParts;

import CarParts.CarWheels;
import Parameters.Details;

public class PeugeotWheels implements CarWheels {

    private String name;

    public PeugeotWheels() {
        this.name = "Peugeot wheels";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public CarWheels setDetails(Details details) {
        return this;
    }

    @Override
    public String toString() {
        return "PeugeotWheels{" +
                "name='" + name + '\'' +
                '}';
    }
}
