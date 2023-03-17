package Parameters;

import Enums.FordEngines;

public class Details {

    private String engine;

    public void setEngine(FordEngines engine) {
        this.engine = engine.getName();
    }

    /*public void setEngine() {
        this.engine = "bla bla bla";
    }*/

    public String getEngine() {
        return engine;
    }

}
