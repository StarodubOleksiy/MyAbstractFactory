package CarParts.CarPartsImplementation.LadaCarParts;

import CarParts.CarBody;

public class LadaBody implements CarBody {

    private String name;

    public LadaBody() {
        this.name = "Lada wheels";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "LadaBody{" +
                "name='" + name + '\'' +
                '}';
    }
}
