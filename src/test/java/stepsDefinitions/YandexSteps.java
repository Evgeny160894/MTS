package stepsDefinitions;

import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.By;
import pages.Yandex;
import utils.helpers.LocatorsAdder;

import static com.codeborne.selenide.Selenide.$;

public class YandexSteps extends BasicSteps {
    private final LocatorsAdder locatorsAdder = new LocatorsAdder(Yandex.class);

    @Тогда("Вод в {string} значения {string}.")
    public void setInField(String nameField, String value) {
        $(By.xpath(lm(nameField))).setValue(value).pressEnter();
    }
}
