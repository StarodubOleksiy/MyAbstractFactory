public class Main {


    public static void main(String[] args) {
        Car ford = CarFactory.createCarOfTheFirstCategory(Ford.class);
        ford.drive().stop().engineCapacity().power().transmission().wheelDrive();
        System.out.println("Name of the car is: " + ford.getName());
        Car mercedes = CarFactory.createCarOfTheFirstCategory(Mercedes.class);
        mercedes.drive().stop().engineCapacity().power().transmission().wheelDrive();
        System.out.println("Name of the car is: " + mercedes.getName());
      //  FirstClassCar lada = CarFactory.createCarOfTheFirstCategory(Lada.class); Compilation Error
        Car lada = CarFactory.createCarOfTheSecondCategory(Lada.class);
        lada.drive().stop().engineCapacity().power().transmission().wheelDrive();
        System.out.println("Name of the car is: " + lada.getName());
       // FirstClassCar peugeot = CarFactory.createCarOfTheFirstCategory(Peugeot.class); Compilation Error
        Car peugeot = CarFactory.createCarOfTheSecondCategory(Peugeot.class);
        peugeot.drive().stop().engineCapacity().power().transmission().wheelDrive();
        System.out.println("Name of the car is: " + peugeot.getName());
    }
}
