package stepsDefinitions;

import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class YandexSteps extends Main {

    @Тогда("Вод в {string} значения {string}.")
    public void setInField(String nameField, String value) {
        $(By.xpath(lm(nameField))).setValue(value)
                .pressEnter();
    }
}
