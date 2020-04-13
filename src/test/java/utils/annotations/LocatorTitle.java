package utils.annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LocatorTitle {
    String name();
    String xpath();
}
