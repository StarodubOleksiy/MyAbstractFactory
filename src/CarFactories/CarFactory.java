package CarFactories;

import CarParts.CarBody;
import CarParts.CarEngine;
import CarParts.CarSeat;
import CarParts.CarWheels;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public interface CarFactory {
    CarBody createBody();

    CarEngine createEngine();

    CarSeat createSeats();

    CarWheels createWheels();
}
