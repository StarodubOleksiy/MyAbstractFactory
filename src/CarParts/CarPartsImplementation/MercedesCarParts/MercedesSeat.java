package CarParts.CarPartsImplementation.MercedesCarParts;

import CarParts.CarSeat;

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
    public String toString() {
        return "MercedesSeat{" +
                "name='" + name + '\'' +
                '}';
    }
}
