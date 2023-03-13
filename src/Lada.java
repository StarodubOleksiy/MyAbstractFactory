public class Lada implements SecondClassCar {

    @Override
    public Lada drive() {
        System.out.println("180 km/h");
        return this;
    }

    @Override
    public Lada stop() {
        System.out.println("3 second");
        return this;
    }

    @Override
    public Lada power() {
        System.out.println("100 hourse power");
        return this;
    }

    @Override
    public Lada wheelDrive() {
        System.out.println("front");
        return this;
    }

    @Override
    public Lada transmission() {
        System.out.println("mechanical and automat");
        return this;
    }

    @Override
    public Lada engineCapacity() {
        System.out.println("1.5 liter");
        return this;
    }

    @Override
    public String getName() {
        return "Lada";
    }
}
