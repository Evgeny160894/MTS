package stepsDefinitions;

import org.openqa.selenium.By;
import io.cucumber.java.ru.Тогда;

import static com.codeborne.selenide.Selenide.*;

public class GoogleSteps {

    @Тогда("Переход на страницу {string}")
    public void goToPage(String link) {
        open(link);
    }

    @Тогда("Вод в {string} значения {string}")
    public void setInField(String nameField, String value) {
        $(By.xpath("//input[@aria-label='Найти']")).setValue(value).pressEnter();
    }

}
