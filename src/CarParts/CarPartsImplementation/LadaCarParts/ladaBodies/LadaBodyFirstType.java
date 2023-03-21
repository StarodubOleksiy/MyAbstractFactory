package CarParts.CarPartsImplementation.LadaCarParts.ladaBodies;

import CarParts.CarBody;
import Parameters.Details;

public class LadaBodyFirstType implements CarBody {

    private String name;

    public LadaBodyFirstType() {
        this.name = "Lada body of the first type1.";
    }

    @Override
    public CarBody setDetails(Details details) {
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "LadaBodyFirstType{" +
                "name='" + name + '\'' +
                '}';
    }
}
