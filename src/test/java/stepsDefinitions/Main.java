package stepsDefinitions;

import utils.ElementsUtil;
import utils.FieldUtil;

import java.util.Map;

public class Main {
    public static Map<String, String> locatorsMap;

    protected FieldUtil fieldUtil = new FieldUtil();
    protected ElementsUtil elementsUtil = new ElementsUtil();

    public static String lm(String locatorName) {
        return locatorsMap.get(locatorName);
    }

}
