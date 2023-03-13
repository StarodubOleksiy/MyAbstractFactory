package CarParts.CarPartsImplementation.LadaCarParts;

import CarParts.CarSeat;

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
    public String toString() {
        return "LadaSeat{" +
                "name='" + name + '\'' +
                '}';
    }
}
