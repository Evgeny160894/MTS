package stepsDefinitions;

import java.util.Map;

public class BasicSteps {
    public static Map<String, String> locatorsMap;

    protected String lm(String locatorName) {
        return locatorsMap.get(locatorName);
    }
}
