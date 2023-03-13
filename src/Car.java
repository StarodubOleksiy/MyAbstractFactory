import CarFactories.CarFactory;
import CarParts.CarBody;
import CarParts.CarEngine;
import CarParts.CarSeat;
import CarParts.CarWheels;

public class Car {

    private final CarBody carBody;
    private final CarEngine carEngine;
    private final CarSeat carSeat;
    private final CarWheels carWheels;

    public Car(CarFactory carFactory) {
        System.out.println("Creating new car of a certain type.");
        carBody = carFactory.createBody();
        carEngine = carFactory.createEngine();
        carSeat = carFactory.createSeats();
        carWheels = carFactory.createWheels();
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public CarEngine getCarEngine() {
        return carEngine;
    }

    public CarSeat getCarSeat() {
        return carSeat;
    }

    public CarWheels getCarWheels() {
        return carWheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBody=" + carBody +
                ", carEngine=" + carEngine +
                ", carSeat=" + carSeat +
                ", carWheels=" + carWheels +
                '}';
    }
}
