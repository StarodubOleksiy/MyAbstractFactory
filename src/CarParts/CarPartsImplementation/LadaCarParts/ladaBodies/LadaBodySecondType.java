package CarParts.CarPartsImplementation.LadaCarParts.ladaBodies;

import CarParts.CarBody;
import Parameters.Details;

public class LadaBodySecondType implements CarBody {

    private String name;

    public LadaBodySecondType() {
        this.name = "Lada body of the second type2.";
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
        return "LadaBodySecondType{" +
                "name='" + name + '\'' +
                '}';
    }
}
