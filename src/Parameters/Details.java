package Parameters;

import Enums.Engines;
import Enums.FordEngines;
import Enums.LadaBodies;
import Enums.MercedesEngines;

public class Details {

    private String engine;

    private String body;

    public void setEngine(Engines engine) {
        this.engine = engine.getName();
    }

    public String getEngine() {
        return engine;
    }

    public String getBody() {
        return body;
    }

    public void setBody(LadaBodies body) {
        this.body = body.getName();
    }
}
