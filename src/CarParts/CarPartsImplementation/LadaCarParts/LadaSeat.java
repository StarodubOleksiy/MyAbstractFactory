package CarParts.CarPartsImplementation.LadaCarParts;

import CarParts.CarSeat;
import Parameters.Details;

public class LadaSeat implements CarSeat {

    private String name;

    public LadaSeat() {
        this.name = "Lada seat";
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public LadaSeat setDetails(Details details) {
        return this;
    }

    @Override
    public String toString() {
        return "LadaSeat{" +
                "name='" + name + '\'' +
                '}';
    }
}
