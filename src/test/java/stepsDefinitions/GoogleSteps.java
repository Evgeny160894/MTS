package stepsDefinitions;

import io.qameta.allure.Step;
import pages.Google;
import io.cucumber.java.ru.Тогда;

import static com.codeborne.selenide.Selenide.*;

public class GoogleSteps extends Google {

    @Step("Test")
    @Тогда("^Переход на страницу \"([^\"]*)\"$")
    public void goToPage(String link) {
        open(link);
    }

}
