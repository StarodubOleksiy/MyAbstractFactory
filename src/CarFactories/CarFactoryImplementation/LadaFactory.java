package CarFactories.CarFactoryImplementation;

import CarFactories.CarFactory;
import CarParts.CarBody;
import CarParts.CarPartsImplementation.LadaCarParts.LadaEngine;
import CarParts.CarPartsImplementation.LadaCarParts.LadaSeat;
import CarParts.CarPartsImplementation.LadaCarParts.LadaWheels;
import Enums.Bodies;
import Enums.LadaBodies;
import Parameters.Details;

public class LadaFactory implements CarFactory {

    public LadaFactory() {
        System.out.println("Creating Lada car");
    }

    private Details details;

    public LadaFactory(Details details) {
        this.details = details;
        System.out.println("Creating Ford car");
    }

    @Override
    public CarBody createBody()
    {
        System.out.println("Creating body for Lada car");
        return Bodies.createBody(LadaBodies.values(), details.getBody()).setDetails(details);
    }

    @Override
    public LadaEngine createEngine()
    {
        System.out.println("Creating engine for Lada car");
        return new LadaEngine();
    }

    @Override
    public LadaSeat createSeats()
    {
        System.out.println("Creating seat for Lada car");
        return new LadaSeat();
    }

    @Override
    public LadaWheels createWheels()
    {
        System.out.println("Creating wheels for Lada car");
        return new LadaWheels();
    }
}
