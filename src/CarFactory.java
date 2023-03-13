import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public interface CarFactory {

    static FirstClassCar createCarOfTheFirstCategory(Class<? extends FirstClassCar> car) {
        try {
            Constructor<? extends FirstClassCar> constructor = car.getConstructor();
            return constructor.newInstance();
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException
                | InvocationTargetException exception) {
            exception.printStackTrace();
        }
        return null;
    }

    static SecondClassCar createCarOfTheSecondCategory(Class<? extends SecondClassCar> car) {
        try {
            Constructor<? extends SecondClassCar> constructor = car.getConstructor();
            return constructor.newInstance();
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException
                | InvocationTargetException exception) {
            exception.printStackTrace();
        }
        return null;
    }
}
