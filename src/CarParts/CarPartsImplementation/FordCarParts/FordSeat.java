package CarParts.CarPartsImplementation.FordCarParts;

import CarParts.CarSeat;

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
    public String toString() {
        return "FordSeat{" +
                "name='" + name + '\'' +
                '}';
    }
}
