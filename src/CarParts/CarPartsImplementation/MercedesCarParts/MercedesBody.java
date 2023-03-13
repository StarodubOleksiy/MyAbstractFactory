package CarParts.CarPartsImplementation.MercedesCarParts;

import CarParts.CarBody;

public class MercedesBody implements CarBody {

    private String name;

    public MercedesBody() {
        this.name = "Mercedes body";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MercedesBody{" +
                "name='" + name + '\'' +
                '}';
    }
}
