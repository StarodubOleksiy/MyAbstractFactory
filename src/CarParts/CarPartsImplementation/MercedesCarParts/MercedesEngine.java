package CarParts.CarPartsImplementation.MercedesCarParts;

import CarParts.CarEngine;

public class MercedesEngine implements CarEngine {

    private String name;

    public MercedesEngine() {
        this.name = "Mercedes engine";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MercedesEngine{" +
                "name='" + name + '\'' +
                '}';
    }
}
