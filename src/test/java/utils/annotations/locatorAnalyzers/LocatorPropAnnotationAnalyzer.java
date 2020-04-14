package utils.annotations.locatorAnalyzers;

import stepsDefinitions.BasicSteps;
import utils.annotations.LocatorProp;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class LocatorPropAnnotationAnalyzer {

    public Map<String, String> locators = new HashMap<>();
    Boolean insertInStaticMap = false;

    public void LocatorPropAnnotationAnalyzer(Class<?> clazz) throws Exception {
        Field[] fields = clazz.getFields();

        if (BasicSteps.locatorsMap != null) {
            insertInStaticMap = true;
        }

        for(Field field : fields) {
            if(field.isAnnotationPresent(LocatorProp.class)) {
                String name = field.getAnnotation(LocatorProp.class).name();
                String xpath = field.getAnnotation(LocatorProp.class).xpath();

                if(insertInStaticMap) {
                    if (BasicSteps.locatorsMap.containsKey(name)) {
                        throw new Exception("\n Локатор \"" + name + "\" будет перезаписан. Измените его название на странице на уникальное на странице \"" + clazz.getName() + "\".");
                    } else {
                        BasicSteps.locatorsMap.put(name, xpath);
                    }
                } else {
                    locators.put(name, xpath);
                }
            }
        }
    }
}
