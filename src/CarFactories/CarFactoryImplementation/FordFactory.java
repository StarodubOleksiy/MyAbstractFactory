package CarFactories.CarFactoryImplementation;

import CarFactories.CarFactory;
import CarParts.CarBody;
import CarParts.CarEngine;
import CarParts.CarPartsImplementation.FordCarParts.FordBody;
import CarParts.CarPartsImplementation.FordCarParts.FordEngine;
import CarParts.CarPartsImplementation.FordCarParts.FordSeat;
import CarParts.CarPartsImplementation.FordCarParts.FordWheels;
import CarParts.CarSeat;
import CarParts.CarWheels;

public class FordFactory implements CarFactory {

    public FordFactory() {
        System.out.println("Creating Ford car");
    }

    @Override
    public FordBody createBody()
    {
        System.out.println("Creating body for Ford car");
        return new FordBody();
    }

    @Override
    public FordEngine createEngine()
    {
        System.out.println("Creating engine for Ford car");
        return new FordEngine();
    }

    @Override
    public FordSeat createSeats()
    {
        System.out.println("Creating seat for Ford car");
        return new FordSeat();
    }

    @Override
    public FordWheels createWheels()
    {
        System.out.println("Creating wheels for Ford car");
        return new FordWheels();
    }
}
