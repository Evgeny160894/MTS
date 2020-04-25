package stepsDefinitions.stepHelper;

import io.cucumber.java.ru.Тогда;
import stepsDefinitions.Main;

public class FieldHelper extends Main {
    private final int WAITING_TIME_SECOND = 5;

    @Тогда("ввести значение {string} в поле {string}")
    public void sendText(String value, String elementName) {
        fieldUtil.sendText(lm(elementName),value, WAITING_TIME_SECOND);
    }

    @Тогда("ввести значение {string} в поле {string} и нажать 'Enter'")
    public void sendTextAndEnter(String value, String elementName) {
        fieldUtil.sendText(lm(elementName),value, WAITING_TIME_SECOND).pressEnter();
    }

    @Тогда("сравнить значение из поля {string} с {string}")
    public void compareTextFromField(String elementName, String expectedText) {
        elementsUtil.compareValueFromElement(lm(elementName), expectedText, true);
    }
}
