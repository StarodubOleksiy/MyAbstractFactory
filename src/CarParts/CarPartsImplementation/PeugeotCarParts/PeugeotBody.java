package CarParts.CarPartsImplementation.PeugeotCarParts;

import CarParts.CarBody;

public class PeugeotBody implements CarBody {

    private String name;

    public PeugeotBody() {
        this.name = "Peugeot body";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PeugeotBody{" +
                "name='" + name + '\'' +
                '}';
    }
}
