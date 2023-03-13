public class Peugeot implements SecondClassCar {

    @Override
    public Peugeot drive() {
        System.out.println("210 km/h");
        return this;
    }

    @Override
    public Peugeot stop() {
        System.out.println("5 second");
        return this;
    }

    @Override
    public Peugeot power() {
        System.out.println("180 hourse power");
        return this;
    }

    @Override
    public Peugeot wheelDrive() {
        System.out.println("front");
        return this;
    }

    @Override
    public Peugeot transmission() {
        System.out.println("Automat");
        return this;
    }

    @Override
    public Peugeot engineCapacity() {
        System.out.println("2 liters");
        return this;
    }

    @Override
    public String getName() {
        return "Peugeout";
    }
}
