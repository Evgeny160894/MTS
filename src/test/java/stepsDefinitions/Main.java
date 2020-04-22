package stepsDefinitions;

import java.util.Map;

public class Main {
    public static Map<String, String> locatorsMap;

    protected String lm(String locatorName) {
        return locatorsMap.get(locatorName);
    }

}
