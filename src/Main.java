import CarFactories.CarFactory;
import CarFactories.CarFactoryImplementation.FordFactory;
import CarFactories.CarFactoryImplementation.LadaFactory;
import CarFactories.CarFactoryImplementation.MercedesFactory;
import CarFactories.CarFactoryImplementation.PeugeotFactory;

public class Main {

    private Car newCar;

    public static Car creatingNewCar(String carName) {
        CarFactory carFactory;
        switch (carName.toLowerCase()) {

            case "ford":
                carFactory = new FordFactory();
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
        Car ford  = creatingNewCar("ford");
        System.out.println(ford);
        Car mercedes  = creatingNewCar("mercedes");
        System.out.println(mercedes);
        Car lada  = creatingNewCar("lada");
        System.out.println(lada);
        Car peugeot  = creatingNewCar("peugeot");
        System.out.println(peugeot);
    }
}
