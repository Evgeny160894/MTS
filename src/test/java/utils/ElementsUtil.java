package utils;

import com.codeborne.selenide.Condition;
import io.cucumber.java.an.E;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ElementsUtil {

    public static ElementsUtil elementsUtil() {
        final ElementsUtil elementsUtil = new ElementsUtil();
        return elementsUtil;
    }

    /**
     * Клик по элементу без ожидания его появления
     *
     * @param locator - локатор элемента
     */
    public ElementsUtil elementClick(String locator) {
        $(By.xpath(locator)).click();

        return this;
    }

    /**
     * Клик по элементу с ожиданием
     *
     * @param locator - локатор элемента
     * @param waitSecond - ожидание в секундах
     */
    public ElementsUtil elementClick(String locator, int waitSecond) {
        $(By.xpath(locator))
                .waitUntil(Condition.visible, waitSecond*1000)
                .click();

        return this;
    }

    /**
     * Ввести текст в поле
     *
     * @param locator - локатор элемента
     * @param text - вводимый в элемент текст
     */
    public ElementsUtil sendText(String locator, String text) {
        $(By.xpath(locator)).setValue(text);

        return this;
    }

    /**
     * Ввести текст в поле подождав его появления
     *
     * @param locator - локатор элемента
     * @param text - вводимый в элемент текст
     * @param waitSecond - ожидание в секундах
     */
    public ElementsUtil sendText(String locator, String text, int waitSecond) {
        $(By.xpath(locator))
                .waitUntil(Condition.visible, waitSecond*1000)
                .setValue(text);

        return this;
    }

    /**
     * Нажатие на кнопку ENTER
     */
    public void pressEnter() {

    }


}
