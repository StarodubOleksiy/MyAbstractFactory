package CarFactories;

import CarParts.CarBody;
import CarParts.CarEngine;
import CarParts.CarSeat;
import CarParts.CarWheels;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public interface CarFactory {
    CarBody createBody();

    CarEngine createEngine();

    CarSeat createSeats();

    CarWheels createWheels();

}
