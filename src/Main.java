import CarFactories.CarFactory;
import CarFactories.CarFactoryImplementation.FordFactory;
import CarFactories.CarFactoryImplementation.LadaFactory;
import CarFactories.CarFactoryImplementation.MercedesFactory;
import CarFactories.CarFactoryImplementation.PeugeotFactory;
import CarParts.CarPartsImplementation.FordCarParts.engineimplementations.FordEngineFirstType;
import Enums.FordEngines;
import Parameters.Parameters;
import Parameters.FordParameters;

public class Main {

    private Car newCar;

    public static Car creatingNewCar(String carName, Parameters parameters) {
        CarFactory carFactory;
        switch (carName.toLowerCase()) {

            case "ford":
                carFactory = new FordFactory(parameters);//Here is compilation Error
                break;
            case "mercedes":
                carFactory = new MercedesFactory();
                break;
            case "lada":
                carFactory = new LadaFactory();
                break;
            default:
                carFactory = new PeugeotFactory();
                break;
        }
                return new Car(carFactory);
    }

    public static void main(String[] args) {
        Parameters fordParameters = new Parameters();
        fordParameters.setEngine(FordEngines.FordEngineFirstType);
        Car ford  = creatingNewCar("ford",fordParameters);
        System.out.println(ford);
        Car mercedes  = creatingNewCar("mercedes",fordParameters);
        System.out.println(mercedes);
        Car lada  = creatingNewCar("lada",fordParameters);
        System.out.println(lada);
        Car peugeot  = creatingNewCar("peugeot",fordParameters);
        System.out.println(peugeot);
    }
}
