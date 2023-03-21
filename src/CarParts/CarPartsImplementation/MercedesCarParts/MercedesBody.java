package CarParts.CarPartsImplementation.MercedesCarParts;

import CarParts.CarBody;
import Parameters.Details;

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
    public CarBody setDetails(Details details)
    {
        return this;
    }

    @Override
    public String toString() {
        return "MercedesBody{" +
                "name='" + name + '\'' +
                '}';
    }
}
