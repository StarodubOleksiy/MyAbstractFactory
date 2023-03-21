package Enums;

import CarParts.CarBody;
import CarParts.CarPartsImplementation.LadaCarParts.ladaBodies.LadaBodyFirstType;
import CarParts.CarPartsImplementation.LadaCarParts.ladaBodies.LadaBodySecondType;

import java.util.Arrays;

public enum LadaBodies implements Bodies{

    LadaBodyFirstType("LadaBodyFirstType", new LadaBodyFirstType()),
    LadaBodySecondType("LadaBodySecondType", new LadaBodySecondType());

    private String name;

    private CarBody bodyType;


    LadaBodies(String name, CarBody body) {
        this.name = name;
        this.bodyType = body;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public CarBody getBodyType() {
        return bodyType;
    }

}
