package CarParts.CarPartsImplementation.FordCarParts;

import CarParts.CarBody;

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
    public String toString() {
        return "FordBody{" +
                "name='" + name + '\'' +
                '}';
    }
}
