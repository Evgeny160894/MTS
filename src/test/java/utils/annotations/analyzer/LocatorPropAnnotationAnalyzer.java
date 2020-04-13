package utils.annotations.analyzer;

import com.codeborne.selenide.SelenideElement;
import utils.annotations.LocatorProp;

import java.lang.reflect.Field;

public class LocatorPropAnnotationAnalyzer {
    public void locatorPropTitleAnnotation(Class<?> clazz) throws Exception {
        Field[] fields = clazz.getFields();

        SelenideElement locator = null;
        for(Field field : fields) {
            if(field.isAnnotationPresent(LocatorProp.class)) {
                String name = field.getAnnotation(LocatorProp.class).name();
                String xpath = field.getAnnotation(LocatorProp.class).xpath();
            }
        }
    }
}
