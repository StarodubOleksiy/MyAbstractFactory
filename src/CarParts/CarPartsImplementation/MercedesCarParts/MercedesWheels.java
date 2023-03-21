package CarParts.CarPartsImplementation.MercedesCarParts;

import CarParts.CarWheels;
import Parameters.Details;

public class MercedesWheels implements CarWheels {

    private String name;

    public MercedesWheels() {
        this.name = "Mercedes wheels";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public MercedesWheels setDetails(Details details) {
        return this;
    }

    @Override
    public String toString() {
        return "MercedesWheels{" +
                "name='" + name + '\'' +
                '}';
    }
}
