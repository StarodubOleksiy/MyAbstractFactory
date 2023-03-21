package CarParts.CarPartsImplementation.LadaCarParts;

import CarParts.CarWheels;
import Parameters.Details;

public class LadaWheels implements CarWheels {

    private String name;

    public LadaWheels() {
        this.name = "Lada wheels";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public LadaWheels setDetails(Details details) {
        return this;
    }

    @Override
    public String toString() {
        return "LadaWheels{" +
                "name='" + name + '\'' +
                '}';
    }
}
