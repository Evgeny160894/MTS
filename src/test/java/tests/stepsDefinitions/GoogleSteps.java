package tests.stepsDefinitions;

import tests.pages.Google;
import io.cucumber.java.ru.Тогда;

import static com.codeborne.selenide.Selenide.*;

public class GoogleSteps extends Google {

    @Тогда("Переход на страницу {string}")
    public void goToPage(String link) {
        open(link);
    }

}
