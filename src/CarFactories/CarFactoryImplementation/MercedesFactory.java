package CarFactories.CarFactoryImplementation;

import CarFactories.CarFactory;
import CarParts.CarEngine;
import CarParts.CarPartsImplementation.MercedesCarParts.MercedesBody;
import CarParts.CarPartsImplementation.MercedesCarParts.MercedesEngine;
import CarParts.CarPartsImplementation.MercedesCarParts.MercedesSeat;
import CarParts.CarPartsImplementation.MercedesCarParts.MercedesWheels;
import Enums.Engines;
import Enums.MercedesEngines;
import Parameters.Details;

public class MercedesFactory implements CarFactory {

    public MercedesFactory() {
        System.out.println("Creating Mercedes car");
    }

    private Details details;

    public MercedesFactory(Details details) {
        this.details = details;
        System.out.println("Creating Ford car");
    }

    @Override
    public MercedesBody createBody()
    {
        System.out.println("Creating body for Mercedes car");
        return new MercedesBody();
    }

    @Override
    public CarEngine createEngine()
    {
        System.out.println("Creating engine for Mercedes car");
        return Engines.createEngine(MercedesEngines.values(), details.getEngine()).setDetails(details);
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
