package utils;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FieldUtil {

    /**
     * Ввести текст в поле
     *
     * @param locator - локатор элемента
     * @param text    - вводимый в элемент текст
     */
    public SelenideElement sendText(String locator, String text) {
        return $(By.xpath(locator))
                .setValue(text);
    }

    /**
     * Ввести текст в поле подождав его появления
     *
     * @param locator    - локатор элемента
     * @param text       - вводимый в элемент текст
     * @param waitSecond - ожидание в секундах
     */
    public SelenideElement sendText(String locator, String text, int waitSecond) {
        return $(By.xpath(locator))
                .waitUntil(Condition.visible, waitSecond * 1000)
                .setValue(text);
    }
}
