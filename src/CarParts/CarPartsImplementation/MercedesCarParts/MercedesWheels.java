package CarParts.CarPartsImplementation.MercedesCarParts;

import CarParts.CarWheels;

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
    public String toString() {
        return "MercedesWheels{" +
                "name='" + name + '\'' +
                '}';
    }
}
