package CarFactories.CarFactoryImplementation;

import CarFactories.CarFactory;
import CarParts.CarPartsImplementation.PeugeotCarParts.PeugeotBody;
import CarParts.CarPartsImplementation.PeugeotCarParts.PeugeotEngine;
import CarParts.CarPartsImplementation.PeugeotCarParts.PeugeotSeat;
import CarParts.CarPartsImplementation.PeugeotCarParts.PeugeotWheels;

public class PeugeotFactory implements CarFactory {

    public PeugeotFactory() {
        System.out.println("Creating Peugeot car");
    }

    @Override
    public PeugeotBody createBody()
    {
        System.out.println("Creating body for Peugeot car");
        return new PeugeotBody();
    }

    @Override
    public PeugeotEngine createEngine()
    {
        System.out.println("Creating engine for Peugeot car");
        return new PeugeotEngine();
    }

    @Override
    public PeugeotSeat createSeats()
    {
        System.out.println("Creating seat for Peugeot car");
        return new PeugeotSeat();
    }

    @Override
    public PeugeotWheels createWheels()
    {
        System.out.println("Creating wheels for Peugeot car");
        return new PeugeotWheels();
    }
}
