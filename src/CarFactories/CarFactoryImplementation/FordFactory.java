package CarFactories.CarFactoryImplementation;

import CarFactories.CarFactory;
import CarParts.CarPartsImplementation.FordCarParts.*;
import CarParts.CarPartsImplementation.FordCarParts.engineimplementations.FordEngineFirstType;
import Parameters.Parameters;
import Parameters.FordParameters;
import CarParts.CarPartsImplementation.FordCarParts.engineimplementations.FordEngineSecondType;

import static Enums.FordEngines.FordEngineFirstType;

public class FordFactory implements CarFactory {

    Parameters parameters;

    public FordFactory() {
        System.out.println("Creating Ford car");
    }

    public FordFactory(Parameters parameters) {
        this.parameters = parameters;
        System.out.println("Creating Ford car");
    }

    @Override
    public FordBody createBody() {
        System.out.println("Creating body for Ford car");
        return new FordBody();
    }

    @Override
    public FordEngine createEngine() {
        System.out.println("Creating engine for Ford car");
        if (parameters.getFordEngine() == FordEngineFirstType)
            return new FordEngineFirstType();
        else return new FordEngineFirstType();
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
