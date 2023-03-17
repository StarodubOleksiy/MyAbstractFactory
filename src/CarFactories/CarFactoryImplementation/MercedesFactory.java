package CarFactories.CarFactoryImplementation;

import CarFactories.CarFactory;
import CarParts.CarPartsImplementation.MercedesCarParts.MercedesBody;
import CarParts.CarPartsImplementation.MercedesCarParts.MercedesEngine;
import CarParts.CarPartsImplementation.MercedesCarParts.MercedesSeat;
import CarParts.CarPartsImplementation.MercedesCarParts.MercedesWheels;

public class MercedesFactory implements CarFactory {

    public MercedesFactory() {
        System.out.println("Creating Mercedes car");
    }

    @Override
    public MercedesBody createBody()
    {
        System.out.println("Creating body for Mercedes car");
        return new MercedesBody();
    }

    @Override
    public MercedesEngine createEngine()
    {
        System.out.println("Creating engine for Mercedes car");
        return new MercedesEngine();
    }

    @Override
    public MercedesSeat createSeats()
    {
        System.out.println("Creating seat for Mercedes car");
        return new MercedesSeat();
    }

    @Override
    public MercedesWheels createWheels()
    {
        System.out.println("Creating wheels for Mercedes car");
        return new MercedesWheels();
    }
}
