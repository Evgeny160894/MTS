package utils.annotations.locatorAnalyzers;

import com.codeborne.selenide.SelenideElement;
import pages.Google;
import utils.annotations.LocatorProp;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class LocatorPropAnnotationAnalyzer {

    public Map<String, String> locators = new HashMap<>();

    public void LocatorPropAnnotationAnalyzer(Class<?> clazz) throws Exception {
        Field[] fields = clazz.getFields();

        SelenideElement locator = null;
        for(Field field : fields) {
            if(field.isAnnotationPresent(LocatorProp.class)) {
                String name = field.getAnnotation(LocatorProp.class).name();
                String xpath = field.getAnnotation(LocatorProp.class).xpath();

                locators.put(name, xpath);
            }
        }
    }
}
