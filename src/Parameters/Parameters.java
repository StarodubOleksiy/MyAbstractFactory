package Parameters;

import CarParts.CarEngine;
import CarParts.CarPartsImplementation.FordCarParts.engineimplementations.FordEngineFirstType;
import CarParts.CarPartsImplementation.FordCarParts.engineimplementations.FordEngineSecondType;
import Enums.FordEngines;
import Enums.MercedesEngines;

public class Parameters {

    private FordEngines fordEngine;

    private MercedesEngines mercedesEngine;

    public void setEngine(FordEngines engine) {
        this.fordEngine = engine;
    }

    public void setEngine(MercedesEngines engine) {
        this.mercedesEngine = engine;
    }


    public FordEngines getFordEngine() {
        return fordEngine;
    }

    public MercedesEngines getMercedesEngine() {
        return mercedesEngine;
    }
}
