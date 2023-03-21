package Enums;

import CarParts.CarBody;

import java.util.Arrays;

public interface Bodies {

    String getName();

    CarBody getBodyType();

    static CarBody createBody(Bodies[] bodiesArray, String nameOfEngine) {
        return Arrays.stream(bodiesArray)
                .filter(body -> body.getName().equals(nameOfEngine))
                .findFirst().map(Bodies::getBodyType).
                        orElseThrow(() -> new NullPointerException("There is no such sparepart"));
    }
}
