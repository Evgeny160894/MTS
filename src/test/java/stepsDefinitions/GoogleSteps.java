package stepsDefinitions;

import org.openqa.selenium.By;
import io.cucumber.java.ru.Тогда;
import pages.Google;
import utils.helpers.LocatorsAdder;

import static com.codeborne.selenide.Selenide.*;

public class GoogleSteps extends BasicSteps {
    private final LocatorsAdder locatorsAdder = new LocatorsAdder(Google.class);

    @Тогда("Переход на страницу {string}")
    public void goToPage(String link) {
        open(link);
    }

    @Тогда("Вод в {string} значения {string}")
    public void setInField(String nameField, String value) {
        $(By.xpath(lm(nameField))).setValue(value).pressEnter();
    }
}
