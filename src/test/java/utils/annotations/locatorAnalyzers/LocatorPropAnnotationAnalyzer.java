package utils.annotations.locatorAnalyzers;

import stepsDefinitions.Main;
import utils.annotations.LocatorProp;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class LocatorPropAnnotationAnalyzer {

    public Map<String, String> locators = new HashMap<>();

    public LocatorPropAnnotationAnalyzer(Class<?> clazz) {
        Field[] fields = clazz.getFields();

        if (Main.locatorsMap != null) {
            Main.locatorsMap.clear();
        }

        for(Field field : fields) {
            if(field.isAnnotationPresent(LocatorProp.class)) {
                String name = field.getAnnotation(LocatorProp.class).name();
                String xpath = field.getAnnotation(LocatorProp.class).xpath();

                locators.put(name, xpath);
            }
        }

        Main.locatorsMap = locators;
    }
}
