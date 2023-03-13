package CarParts.CarPartsImplementation.PeugeotCarParts;

import CarParts.CarSeat;

public class PeugeotSeat implements CarSeat {

    private String name;

    public PeugeotSeat() {
        this.name = "Peugeot seat";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PeugeotSeat{" +
                "name='" + name + '\'' +
                '}';
    }
}


