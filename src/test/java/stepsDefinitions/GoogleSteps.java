package stepsDefinitions;

import org.openqa.selenium.By;
import io.cucumber.java.ru.Тогда;

import static com.codeborne.selenide.Selenide.*;

public class GoogleSteps extends Main {

    @Тогда("Переход на страницу {string}")
    public void goToPage(String link) {
        open(link);
    }

    @Тогда("Вод в {string} значения {string}")
    public void setInField(String nameField, String value) {
        $(By.xpath(lm(nameField))).setValue(value).pressEnter();
    }
}
