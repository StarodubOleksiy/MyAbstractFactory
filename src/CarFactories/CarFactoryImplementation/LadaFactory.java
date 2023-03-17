package CarFactories.CarFactoryImplementation;

import CarFactories.CarFactory;
import CarParts.CarPartsImplementation.LadaCarParts.LadaBody;
import CarParts.CarPartsImplementation.LadaCarParts.LadaEngine;
import CarParts.CarPartsImplementation.LadaCarParts.LadaSeat;
import CarParts.CarPartsImplementation.LadaCarParts.LadaWheels;

public class LadaFactory implements CarFactory {

    public LadaFactory() {
        System.out.println("Creating Lada car");
    }

    @Override
    public LadaBody createBody()
    {
        System.out.println("Creating body for Lada car");
        return new LadaBody();
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
