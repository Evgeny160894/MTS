package stepsDefinitions.stepHelper;

import io.cucumber.java.ru.Тогда;
import stepsDefinitions.Main;

public class ElementHelper extends Main {

    @Тогда("нажать на элемент {string}")
    public void clickOnElement(String elementName) {
        elementsUtil.elementClick(lm(elementName), 10);
    }

    @Тогда("нажать на ссылку с текстом {string}")
    public void clickLinkWithText(String textLink) {
        elementsUtil.clickOnHyperLink(textLink);
    }

    @Тогда("Проверка видимости элемента {string} на странице")
    public void checkVisibleElement(String elementName) throws Exception {
        elementsUtil.checkVisibleElement(lm(elementName), true);
    }
}
