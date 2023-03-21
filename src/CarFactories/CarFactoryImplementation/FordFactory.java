package CarFactories.CarFactoryImplementation;

import CarFactories.CarFactory;
import CarParts.CarEngine;
import CarParts.CarPartsImplementation.FordCarParts.*;
import Enums.Engines;
import Enums.FordEngines;
import Parameters.Details;

public class FordFactory implements CarFactory {

    private Details details;

    public FordFactory() {
        System.out.println("Creating Ford car");
    }

    public FordFactory(Details details) {
        this.details = details;
        System.out.println("Creating Ford car");
    }

    @Override
    public FordBody createBody() {
        System.out.println("Creating body for Ford car");
        return new FordBody();
    }

    @Override
    public CarEngine createEngine() {
        System.out.println("Creating engine for Ford car");
        return Engines.createEngine(FordEngines.values(), details.getEngine()).setDetails(details);
    }

    @Override
    public FordSeat createSeats() {
        System.out.println("Creating seat for Ford car");
        return new FordSeat();
    }

    @Override
    public FordWheels createWheels() {
        System.out.println("Creating wheels for Ford car");
        return new FordWheels();
    }
}
