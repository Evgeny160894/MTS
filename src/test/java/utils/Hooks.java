package utils;

import org.junit.After;
import stepsDefinitions.BasicSteps;

public class Hooks {
    @After
    public void resetLocatorsMap() {
        BasicSteps.locatorsMap.clear();
    }
}
