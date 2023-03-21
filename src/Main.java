import CarFactories.CarFactory;
import CarFactories.CarFactoryImplementation.FordFactory;
import CarFactories.CarFactoryImplementation.LadaFactory;
import CarFactories.CarFactoryImplementation.MercedesFactory;
import CarFactories.CarFactoryImplementation.PeugeotFactory;
import Enums.FordEngines;
import Enums.LadaBodies;
import Enums.MercedesEngines;
import Parameters.Details;

public class Main {

    private Car newCar;

    public static Car creatingNewCar(String carName, Details details) {
        CarFactory carFactory;
        switch (carName.toLowerCase()) {

            case "ford":
                carFactory = new FordFactory(details);//Here is compilation Error
                break;
            case "mercedes":
                carFactory = new MercedesFactory(details);
                break;
            case "lada":
                carFactory = new LadaFactory(details);
                break;
            default:
                carFactory = new PeugeotFactory();
                break;
        }
                return new Car(carFactory);
    }

    public static void main(String[] args) {
        Details fordDetails = new Details();
        fordDetails.setEngine(FordEngines.FordEngineFirstType);
        Car ford  = creatingNewCar("ford", fordDetails);
        System.out.println(ford);
        fordDetails.setEngine(FordEngines.FordEngineSecondType);
        Car secondFord  = creatingNewCar("ford", fordDetails);
        System.out.println(secondFord);
        Details mercedesDetails = new Details();
        mercedesDetails.setEngine(MercedesEngines.MercedesEngineFirstType);
        Car mercedes  = creatingNewCar("mercedes", mercedesDetails);
        System.out.println(mercedes);
        mercedesDetails.setEngine(MercedesEngines.MercedesEngineSecondType);
        Car secondMercedes  = creatingNewCar("mercedes", mercedesDetails);
        System.out.println(secondMercedes);
        Details ladaDetails = new Details();
        ladaDetails.setBody(LadaBodies.LadaBodyFirstType);
        Car lada  = creatingNewCar("lada", ladaDetails);
        System.out.println(lada);
        ladaDetails.setBody(LadaBodies.LadaBodySecondType);
        Car secondLada  = creatingNewCar("lada", ladaDetails);
        System.out.println(secondLada);
        Car peugeot  = creatingNewCar("peugeot", fordDetails);
        System.out.println(peugeot);
        //fordDetails.setEngine();
       // Car thirdFord  = creatingNewCar("ford", fordDetails);
       // System.out.println(ford);
    }
}
