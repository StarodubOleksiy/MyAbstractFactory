package CarParts.CarPartsImplementation.LadaCarParts;

import CarParts.CarEngine;

public class LadaEngine implements CarEngine {

    private String name;

    public LadaEngine() {
        this.name = "Lada engine";
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "LadaEngine{" +
                "name='" + name + '\'' +
                '}';
    }
}
