package stepsDefinitions;

import org.openqa.selenium.By;
import io.cucumber.java.ru.Тогда;

import static com.codeborne.selenide.Selenide.*;

public class GoogleSteps extends BasicSteps {

    @Тогда("Переход на страницу {string}")
    public void goToPage(String link) {
        open(link);
    }

    @Тогда("Вод в {string} значения {string}")
    public void setInField(String nameField, String value) throws Exception {
        $(By.xpath(lm.get("Поиск Гугл"))).setValue(value).pressEnter();
    }

}
