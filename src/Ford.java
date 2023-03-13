public class Ford implements FirstClassCar {

    @Override
    public Ford drive() {
        System.out.println("190 km/h");
        return this;
    }

    @Override
    public Ford stop() {
        System.out.println("2 second");
        return this;
    }

    @Override
    public Ford power() {
        System.out.println("95 hourse power");
        return this;
    }

    @Override
    public Ford wheelDrive() {
        System.out.println("front");
        return this;
    }

    @Override
    public Ford transmission() {
        System.out.println("mechanical");
        return this;
    }

    @Override
    public Ford engineCapacity() {
        System.out.println("1 liter");
        return this;
    }

    @Override
    public String getName() {
        return "Ford";
    }
}
