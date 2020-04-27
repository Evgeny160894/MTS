package stepsDefinitions;

import io.cucumber.java.ru.Тогда;

public class XpathSteps extends Main {

    @Тогда("работа со страницей сайта про xpath")
    public void workWithPageAboutXpath() {
        elementsUtil.checkVisibleElement(lm("Синтаксис xpath"), true);
        elementsUtil.compareValueFromElement(lm("Синтаксис xpath"), "Синтаксис XPath", true);
        System.out.println(elementsUtil.getElementValue(lm("Синтаксис xpath")));
    }

}
