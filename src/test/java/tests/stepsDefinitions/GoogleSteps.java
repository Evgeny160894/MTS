package tests.stepsDefinitions;

import io.qameta.allure.Step;
import tests.pages.Google;
import io.cucumber.java.ru.Тогда;

import static com.codeborne.selenide.Selenide.*;

public class GoogleSteps extends Google {

    @Step("Test")
    @Тогда("Переход на страницу {string}")
    public void goToPage(String link) {
        open(link);
    }

}
