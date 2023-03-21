package CarParts.CarPartsImplementation.MercedesCarParts;

import CarParts.CarSeat;
import Parameters.Details;

public class MercedesSeat implements CarSeat {

    private String name;

    public MercedesSeat() {
        this.name = "Mercedes seat";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public MercedesSeat setDetails(Details details) {
        return this;
    }

    @Override
    public String toString() {
        return "MercedesSeat{" +
                "name='" + name + '\'' +
                '}';
    }
}
