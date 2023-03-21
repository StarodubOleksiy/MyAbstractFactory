package CarParts.CarPartsImplementation.FordCarParts;

import CarParts.CarBody;
import CarParts.CarSeat;
import Parameters.Details;

public class FordSeat implements CarSeat {

    private String name;

    public FordSeat() {
        this.name = "Ford seat";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public FordSeat setDetails(Details details) {
        return this;
    }

    @Override
    public String toString() {
        return "FordSeat{" +
                "name='" + name + '\'' +
                '}';
    }
}
