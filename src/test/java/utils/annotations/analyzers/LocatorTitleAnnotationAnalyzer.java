package utils.annotations.analyzers;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.hu.Ha;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import stepsDefinitions.GoogleSteps;
import utils.annotations.LocatorTitle;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class LocatorTitleAnnotationAnalyzer {
    public static void main(String[] args) {
        try {
            new LocatorTitleAnnotationAnalyzer().parseLocatorTitleAnnotation(GoogleSteps.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Object parseLocatorTitleAnnotation(Class<?> clazz) throws Exception {
        Field[] fields = clazz.getFields();

        SelenideElement locator = null;
        for(Field field : fields) {
            if(field.isAnnotationPresent(LocatorTitle.class)) {
                String name = field.getAnnotation(LocatorTitle.class).xpath();
            }
        }
        return locator;
    }
}
