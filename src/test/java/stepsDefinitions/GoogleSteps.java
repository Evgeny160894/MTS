package stepsDefinitions;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import pages.Google;
import io.cucumber.java.ru.Тогда;
import utils.annotations.analyzers.LocatorTitleAnnotationAnalyzer;

import javax.annotation.Nullable;

import static com.codeborne.selenide.Selenide.*;

public class GoogleSteps {

    @Тогда("Переход на страницу {string}")
    public void goToPage(String link) {
        open(link);
    }

    @Тогда("Ввести в поле {string} значение {string}")
    public void setValue(String nameField, String value) throws Exception {
        new Configuration();
        String tt = "//input[@aria-label='Найти']";
        $(By.xpath(tt)).setValue(value).pressEnter();
    }

}
