public class Mercedes implements FirstClassCar {

     @Override
    public Mercedes drive() {
        System.out.println("220 km/h");
        return this;
    }

    @Override
    public Mercedes stop() {
        System.out.println("4 second");
        return this;
    }

   @Override
    public Mercedes power() {
        System.out.println("330 hourse power");
       return this;
    }

    @Override
    public Mercedes wheelDrive() {
        System.out.println("All-wheel drive");
        return this;
    }

    @Override
    public Mercedes transmission() {
        System.out.println("automat");
        return this;
    }

    @Override
    public Mercedes engineCapacity() {
        System.out.println("2.9 liter");
        return this;
    }

    @Override
    public String getName() {
        return "Mercedes";
    }
}
