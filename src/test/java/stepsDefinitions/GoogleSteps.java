package stepsDefinitions;

import io.cucumber.java.ru.То;
import org.openqa.selenium.By;
import io.cucumber.java.ru.Тогда;
import pages.Google;
import utils.helpers.LocatorsAdder;

import java.util.Map;

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

    @Тогда("Просмотр сохраненных локаторов")
    public void dw() {
        System.out.println(BasicSteps.locatorsMap.keySet());
    }

}
